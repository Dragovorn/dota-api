package com.dragovorn.dotaapi.generate;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class Main {

    public static void main(String... args) throws IOException {
        File workDir = new File("work");
        File heroesJSON = new File(workDir, "heroes.json");
        File abilitiesJSON = new File(workDir, "abilities.json");
        File itemsJSON = new File(workDir, "items.json");
        File heroesOutput = new File("src\\main\\java\\com\\dragovorn\\dotaapi\\match\\hero\\generated\\Hero.java");
        File abilitiesOutput = new File("src\\main\\java\\com\\dragovorn\\dotaapi\\match\\hero\\generated\\AbilityType.java");
        File itemsOutput = new File("src\\main\\java\\com\\dragovorn\\dotaapi\\match\\hero\\generated\\Item.java");

        if (!workDir.exists()) {
            workDir.mkdirs();
        }

        if (heroesOutput.exists()) {
            heroesOutput.delete();
        }

        if (abilitiesOutput.exists()) {
            abilitiesOutput.delete();
        }

        if (itemsOutput.exists()) {
            itemsOutput.delete();
        }

        download(new URL("https://raw.githubusercontent.com/odota/dotaconstants/master/build/heroes.json"), heroesJSON);
        download(new URL("https://raw.githubusercontent.com/odota/dotaconstants/master/build/ability_ids.json"), abilitiesJSON);
        download(new URL("https://raw.githubusercontent.com/odota/dotaconstants/master/build/item_ids.json"), itemsJSON);

        try {
            generate(heroesJSON, heroesOutput, "Hero", false);
            generate(itemsJSON, itemsOutput, "Item", true);
            generate(abilitiesJSON, abilitiesOutput, "AbilityType", true);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void download(URL url, File file) throws IOException {
        ReadableByteChannel rbc = Channels.newChannel(url.openStream());
        FileOutputStream fos = new FileOutputStream(file);
        fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
    }

    private static void generate(File input, File output, String className, boolean isId) throws IOException {
        JSONObject object = new JSONObject(new JSONTokener(new FileReader(input)));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));

        writer.append("package com.dragovorn.dotaapi.match.hero.generated;\n");
        writer.newLine();
        writer.append("public enum ").append(className).append(" {\n");
        writer.newLine();
        object.keys().forEachRemaining(string -> {
            try {

                writer.append("    ");
                if (isId) {
                    writer.append(object.getString(string).toUpperCase());
                } else {
                    JSONObject hero = object.getJSONObject(string);
                    writer.append(hero.getString("name").toUpperCase());
                }
                writer.append('(');
                writer.append(string);
                writer.append("),\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.append("    ;");
        writer.newLine();
        writer.newLine();
        writer.append("    private final int id;");
        writer.newLine();
        writer.newLine();
        writer.append("    ").append(className).append("(int id) {\n");
        writer.append("        this.id = id;\n");
        writer.append("    }");
        writer.newLine();
        writer.newLine();
        writer.append("    public int id() {\n");
        writer.append("        return this.id;\n");
        writer.append("    }");
        writer.newLine();
        writer.newLine();
        writer.append("    public static ").append(className).append(" fromId(int id) {\n");
        writer.append("        for (").append(className).append(" clazz : values()) {\n");
        writer.append("            if (clazz.id() == id) {\n");
        writer.append("                return clazz;\n");
        writer.append("            }\n");
        writer.append("        }\n");
        writer.newLine();
        writer.append("        throw new IllegalArgumentException(\"There is no ").append(className).append(" \" + id);\n");
        writer.append("    }\n");
        writer.append("}\n");
        writer.close();
    }

//    private int id;
//
//    Item(int id) {
//        this.id = id;
//    }
//
//    public int id() {
//        return this.id;
//    }
//
//    public static Item fromId(int id) {
//        for (Item item : values()) {
//            if (item.id() == id) {
//                return item;
//            }
//        }
//
//        throw new IllegalArgumentException("There is no item " + id);
//    }
}