package com.kata.Enchantment.enums;

public enum Enchantment {

    ICE("Icy", "+5 ice damage"), FIRE("Inferno", "+5 fire damage"), LIFESTEAL("Vampire", "+5 lifesteal"),
    AGILITY("Quick", "+5 agility"), STRENGTH("Angry", "+5 strength");

    private final String prefix;
    private final String attributes;

    private Enchantment(final String prefix, final String attributes) {
        this.prefix = prefix;
        this.attributes = attributes;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public String getAttributes() {
        return this.attributes;
    }

}
