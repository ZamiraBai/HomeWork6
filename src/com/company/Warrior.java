package com.company;

public class Warrior extends Player {
    private int superAbility;

    public int getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(int superAbility) {
        this.superAbility = superAbility;
    }
    public String applySuperAbility() {
        return "Warrior - Нанес критический удар!";
    }
}
