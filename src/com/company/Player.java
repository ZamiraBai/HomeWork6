package com.company;

public class Player {
    private int health;
    private int damage;
    private String heroesTypes;
    private String hitTypes;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getHeroesTypes() {
        return heroesTypes;
    }

    public void setHeroesTypes(String heroesTypes) {
        this.heroesTypes = heroesTypes;
    }

    public String getHitTypes() {
        return hitTypes;
    }

    public void setHitTypes(String hitTypes) {
        this.hitTypes = hitTypes;
    }
}
