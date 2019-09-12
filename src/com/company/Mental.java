package com.company;

public class Mental extends Player {
    private int superAbility;

    public int getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(int superAbility) {
        this.superAbility = superAbility;
    }
    public String applySuperAbility() {
        return "Mental - Нанес критический удар!";
    }
}
