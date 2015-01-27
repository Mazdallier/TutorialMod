package com.plasmablazer.tutorialmod.reference;

public enum Configs
{
    ORE_GEN("oreGen", "general.ores"),
    FURNACE_SPEED("furnaceSpeed", "general.machines");

    public final String name;
    public final String category;
    public final String comment;

    Configs(String name, String category)
    {
        this.name = "config." + Textures.RESOURCE_PREFIX + category + "." + name + ".name";
        this.category = category;
        this.comment = "config." + Textures.RESOURCE_PREFIX + category + "." + name + ".comment";
    }
}
