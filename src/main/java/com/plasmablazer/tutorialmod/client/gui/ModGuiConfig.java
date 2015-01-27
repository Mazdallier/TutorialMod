package com.plasmablazer.tutorialmod.client.gui;

import com.plasmablazer.tutorialmod.handler.*;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.client.config.*;
import net.minecraft.client.gui.*;
import net.minecraftforge.common.config.*;

public class ModGuiConfig extends GuiConfig
{
    public ModGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.MOD_ID,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
