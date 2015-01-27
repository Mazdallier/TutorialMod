package com.plasmablazer.tutorialmod.init;

import com.plasmablazer.tutorialmod.block.*;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.block.material.*;

public class ModBlocks
{
    public static final BlockTM tutorialBlock = new BlockTM(Names.Blocks.TUTORIAL_BLOCK_NAME, Material.iron);

    public static void init()
    {
        GameRegistry.registerBlock(tutorialBlock, tutorialBlock.getName());
    }
}
