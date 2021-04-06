package com.kata.Enchantment;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeaponTest {

    @Test
    void the_weapon_provides_an_expected_description() {
        Weapon weapon = new Weapon("Dagger of the Nooblet");
        assertEquals("Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed", weapon.describe());
    }
}
