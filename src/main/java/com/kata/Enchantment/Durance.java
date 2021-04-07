package com.kata.Enchantment;

import java.util.Random;

import com.kata.Enchantment.enums.Enchantment;

public class Durance {
    Weapon weapon = new Weapon("Dagger of the Nooblet");
    Random random = new Random();

    public void enchant() {
        if (random.nextInt(1000) % 10 == 0) {
            weapon.resetEnchantment();
        } else {
            int randomInt = random.nextInt(1000) % 5;

            if (Enchantment.values()[randomInt] == weapon.getEnchantment()) {
                enchant();
            } else {
                weapon.applyEnchantment(Enchantment.values()[randomInt]);
            }

        }
    }

    public String describeWeapon() {
        return this.weapon.describe();
    }

    public void setRandom(Random random) {
        this.random = random;
    }
}
