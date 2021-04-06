package com.kata.Enchantment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kata.Enchantment.enums.Enchantment;

public class WeaponTest {

    @Test
    void the_weapon_provides_an_expected_description() {
        Weapon weapon = new Weapon("Dagger of the Nooblet");
        assertEquals("Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed", weapon.describe());
    }

    @Test
    void if_given_an_enchantment_the_expected_description_is_printed() {
        Weapon weapon = new Weapon("Dagger of the Nooblet", Enchantment.FIRE);
        assertEquals("Inferno Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed\r\n+5 fire damage",
                weapon.describe());
    }
}
