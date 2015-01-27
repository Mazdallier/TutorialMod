package com.plasmablazer.tutorialmod.init;

import com.plasmablazer.tutorialmod.item.*;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.common.registry.*;

public class ModItems
{
    public static final ItemTM tutorialIngot = new ItemTM(Names.Items.TUTORIAL_INGOT_NAME);

    public static void init()
    {
        GameRegistry.registerItem(tutorialIngot, tutorialIngot.getName());
    }
}
