package com.kata.Enchantment;

import com.kata.Enchantment.enums.Enchantment;

public class Weapon {
    private String name;
    private int minimumAttackDamage;
    private int maximumAttackDamage;
    private double attackSpeed;
    private Enchantment enchantment;

    Weapon(String name) {
        this.name = name;
        this.minimumAttackDamage = 5;
        this.maximumAttackDamage = 10;
        this.attackSpeed = 1.2;
    }

    Weapon(String name, Enchantment enchantment) {
        this.name = name;
        this.minimumAttackDamage = 5;
        this.maximumAttackDamage = 10;
        this.attackSpeed = 1.2;
        this.enchantment = enchantment;
    }

    public String describe() {
        if (this.enchantment != null) {
            return this.enchantment.getPrefix() + " " + this.name + "\r\n" + this.minimumAttackDamage + " - "
                    + this.maximumAttackDamage + " attack damage" + "\r\n" + this.attackSpeed + " attack speed" + "\r\n"
                    + this.enchantment.getAttributes();
        }

        return this.name + "\r\n" + this.minimumAttackDamage + " - " + this.maximumAttackDamage + " attack damage"
                + "\r\n" + this.attackSpeed + " attack speed";

    }

    public void resetEnchantment() {
        this.enchantment = null;
    }

    public void applyEnchantment(Enchantment enchantment) {
        this.enchantment = enchantment;
    }

    public Enchantment getEnchantment() {
        return this.enchantment;
    }
}
