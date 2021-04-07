package com.kata.Enchantment;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Random;

public class DuranceTest {
    Durance durance;

    @Test
    void after_enchanting_his_weapon_it_returns_the_expected_description() {
        Random randomNumberMock = Mockito.mock(Random.class);
        when(randomNumberMock.nextInt(anyInt())).thenReturn(11).thenReturn(0).thenReturn(10);

        Durance durance = new Durance();
        durance.setRandom(randomNumberMock);

        durance.enchant();

        assertEquals("Icy Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed\r\n+5 ice damage",
                durance.describeWeapon());

        durance.enchant();

        assertEquals("Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed", durance.describeWeapon());
    }

    @Test
    void if_our_enchantment_is_the_same_we_roll_again() {
        Random randomNumberMock = Mockito.mock(Random.class);
        when(randomNumberMock.nextInt(anyInt())).thenReturn(11).thenReturn(1).thenReturn(11).thenReturn(1)
                .thenReturn(11).thenReturn(2);

        Durance durance = new Durance();
        durance.setRandom(randomNumberMock);

        durance.enchant();

        assertEquals("Inferno Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed\r\n+5 fire damage",
                durance.describeWeapon());

        durance.enchant();

        assertEquals("Vampire Dagger of the Nooblet\r\n5 - 10 attack damage\r\n1.2 attack speed\r\n+5 lifesteal",
                durance.describeWeapon());
    }
}
