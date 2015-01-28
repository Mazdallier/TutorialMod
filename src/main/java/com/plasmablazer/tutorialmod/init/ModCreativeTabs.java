package com.plasmablazer.tutorialmod.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModCreativeTabs
{
    public static final CreativeTabs tutorialTab = new CreativeTabTM("tutorialTab");

    private static class CreativeTabTM extends CreativeTabs
    {
        public CreativeTabTM(String tutorialTab)
        {
            super(tutorialTab);
        }

        @Override
        public Item getTabIconItem()
        {
            return ModItems.tutorialIngot;
        }
    }
}
