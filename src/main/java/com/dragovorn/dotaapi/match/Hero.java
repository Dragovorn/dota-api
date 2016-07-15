package com.dragovorn.dotaapi.match;

/**
 * *************************************************************************
 * (c) Dragovorn 2016. This file was created by Andrew at 11:31 PM.
 * as of July 14 2016 the project DotaAPI is Copyrighted.
 * *************************************************************************
 */
public enum Hero {
    ANTIMAGE("Anti-Mage", 1),
    AXE("Axe", 2),
    BANE("Bane", 3),
    BLOODSEEKER("Bloodseeker", 4),
    CRYSTAL_MAIDEN("Crystal Maiden", 5),
    DROW_RANGER("Drow Ranger", 6),
    EARTHSHAKER("Earthshaker", 7),
    JUGGERNAUT("Juggernaut", 8),
    MIRANA("Mirana", 9),
    MORPHLING("Morphling", 10),
    SHADOW_FIEND("Shadow Fiend", 11),
    PHANTOM_LANCER("Phantom Lancer", 12),
    PUCK("Puck", 13),
    PUDGE("Pudge", 14),
    RAZOR("Razor", 15),
    SAND_KING("Sand King", 16),
    STORM_SPIRIT("Storm Spirit", 17),
    SVEN("Sven", 18),
    TINY("Tiny", 19),
    VENGEFUL_SPIRIT("Vengeful Spirit", 20),
    WIND_RANGER("Windranger", 21),
    ZEUS("Zeus", 22),
    KUNKKA("Kunkka", 23),
    LINA("Lina", 25),
    LION("Lion", 26),
    SHADOW_SHAMAN("Shadow Shaman", 27),
    SLARDAR("Slardar", 28),
    TIDEHUNTER("Tidehunter", 29),
    WITCH_DOCTOR("Witch Doctor", 30),
    LICH("Lich", 31),
    RIKI("Riki", 32),
    ENIGMA("Enigma", 33),
    TINKER("Tinker", 34),
    SNIPER("Sniper", 35),
    NECROPHOS("Necrophos", 36),
    WARLOCK("Warlock", 37),
    BEASTMASTER("Beastmaster", 38),
    QUEEN_OF_PAIN("Queen of Pain", 39),
    VENOMANCER("Venomancer", 40),
    FACELESS_VOID("Faceless Void", 41),
    WRAITH_KING("Wraith King", 42),
    DEATH_PROPHET("Death Prophet", 43),
    PHANTOM_ASSASSIN("Phantom Assassin", 44),
    PUGNA("Pugna", 45),
    TEMPLAR_ASSASSIN("Templar Assassin", 46),
    VIPER("Viper", 47),
    LUNA("Luna", 48),
    DRAGON_KNIGHT("Dragon Knight", 49),
    DAZZLE("Dazzle", 50),
    CLOCKWERK("Clockwerk", 51),
    LESHRAC("Leshrac", 52),
    NATURES_PROPHET("Nature's Prophet", 53),
    LIFESTEALER("Lifestealer", 54),
    DARK_SEER("Dark Seer", 55),
    CLINKZ("Clinkz", 56),
    OMNIKNIGHT("Omniknight", 57),
    ENCHANTRESS("Enchantress", 58),
    HUSKAR("Huskar", 59),
    NIGHT_STALKER("Night Stalker", 60),
    BROODMOTHER("Broodmother", 61),
    BOUNTY_HUNTER("Bounty Hunter", 62),
    WEAVER("Weaver", 63),
    JAKIRO("Jakiro", 64),
    BATRIDER("Batrider", 65),
    CHEN("Chen", 66),
    SPECTRE("Spectre", 67),
    ANCIENT_APPARITION("Ancient Apparition", 68),
    DOOM("Doom", 69),
    URSA("Ursa", 70),
    SPIRIT_BREAKER("Spirit Breaker", 71),
    GYROCOPTER("Gyrocopter", 72),
    ALCHEMIST("Alchemist", 73),
    INVOKER("Invoker", 74),
    SILENCER("Silencer", 75),
    OUTWORLD_DEVOURER("Outworld Devourer", 76),
    LYCAN("Lycan", 77),
    BREWMASTER("Brewmaster", 78),
    SHADOW_DEMON("Shadow Demon", 79),
    LONE_DURID("Lone Druid", 80),
    CHAOS_KNIGHT("Chaos Knight", 81),
    MEEPO("Meepo", 82),
    TREANT_PROTECTOR("Treant Protector", 83),
    OGRE_MAGI("Ogre Magi", 84),
    UNDYING("Undying", 85),
    RUBICK("Rubick", 86),
    DISRUPTER("Disrupter", 87),
    NYX_ASSASSIN("Nyx Assassin", 88),
    NAGA_SIREN("Naga Siren", 89),
    KEEPER_OF_THE_LIGHT("Keeper of the Light", 90),
    IO("Io", 91),
    VISAGE("Visage", 92),
    SLARK("Slark", 93),
    MEDUSA("Medusa", 94),
    TROLL_WARLORD("Troll Warlord", 95),
    CENTAUR_WARRUNNER("Centaur Warrunner", 96),
    MAGNUS("Magnus", 97),
    TIMBERSAW("Timbersaw", 98),
    BRISTLEBACK("Bristleback", 99),
    TUSK("Tusk", 100),
    SKYWRATH_MAGE("Skywrath Mage", 101),
    ABADDON("Abaddon", 102),
    ELDER_TITAN("Elder Titan", 103),
    LEGION_COMMANDER("Legion Commander", 104),
    TECHIES("Techies", 105),
    EMBER_SPIRIT("Ember Spirit", 106),
    EARTH_SPIRIT("Earth Spirit", 107),
    ABYSSAL_UNDERLORD("Abyssal Underlord", 108),
    TERRORBLADE("Terrorblade", 109),
    PHOENIX("Phoenix", 110),
    ORACLE("Oracle", 111),
    WINTER_WYVERN("Winter Wyvern", 112),
    ARC_WARDEN("Arc Warden", 113);

    private String name;

    private int value;

    Hero(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public int getValue() {
        return this.value;
    }
}