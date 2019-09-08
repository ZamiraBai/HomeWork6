package com.company;

public class Boss extends Player {
    private int bossDefence;

    public Boss (int bossDefence) {
        this.bossDefence = bossDefence;
    }

    public int getBossDefence() {
        return bossDefence;
    }

    public void setBossDefence(int bossDefence) {
        this.bossDefence = bossDefence;
    }
}
