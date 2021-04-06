package com.kata.Enchantment;

public class Weapon {
    private String name;
    private int minimumAttackDamage;
    private int maximumAttackDamage;
    private double attackSpeed;

    Weapon(String name) {
        this.name = name;
        this.minimumAttackDamage = 5;
        this.maximumAttackDamage = 10;
        this.attackSpeed = 1.2;
    }

    public String describe() {
        return this.name + "\r\n" + this.minimumAttackDamage + " - " + this.maximumAttackDamage + " attack damage"
                + "\r\n" + this.attackSpeed + " attack speed";

    }
}
