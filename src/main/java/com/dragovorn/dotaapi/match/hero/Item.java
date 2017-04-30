package com.dragovorn.dotaapi.match.hero;

public enum Item {

    BLINK_DAGGER(1, 2250, true, false, false),
    BLADES_OF_ATTACK(2, 420, true, false, false);

    private boolean sideShop;
    private boolean secretShop;
    private boolean recipe;

    private int id;
    private int cost;

    Item(int id, int cost, boolean sideShop, boolean secretShop, boolean recipe) {
        this.id = id;
        this.cost = cost;
        this.sideShop = sideShop;
        this.secretShop = secretShop;
        this.recipe = recipe;
    }

    public int getId() {
        return this.id;
    }

    public int getCost() {
        return this.cost;
    }

    public boolean isInSideShop() {
        return this.sideShop;
    }

    public boolean isInSecretShop() {
        return this.secretShop;
    }

    public boolean isRecipe() {
        return this.recipe;
    }
}