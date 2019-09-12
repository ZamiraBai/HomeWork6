package com.company;

public class Main {

    public static void main(String[] args) {
        Warrior w = new Warrior();
        System.out.println(w.applySuperAbility());

        Magical m = new Magical();
        System.out.println(m.applySuperAbility());

        Mental m1 = new Mental();
        System.out.println(m1.applySuperAbility());
    }
}
