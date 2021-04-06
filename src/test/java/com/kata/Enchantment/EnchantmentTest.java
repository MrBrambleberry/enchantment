package com.kata.Enchantment;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.kata.Enchantment.enums.Enchantment;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EnchantmentTest {

    @ParameterizedTest
    @CsvSource({ "ICE,Icy,+5 ice damage", "FIRE,Inferno,+5 fire damage", "LIFESTEAL,Vampire,+5 lifesteal",
            "AGILITY,Quick,+5 agility", "STRENGTH,Angry,+5 strength" })
    void enchantments_return_their_correct_prefix_and_attributes(Enchantment enchantment, String expectedPrefix,
            String expectedAttributes) {
        assertEquals(expectedPrefix, enchantment.getPrefix());
        assertEquals(expectedAttributes, enchantment.getAttributes());
    }
}
