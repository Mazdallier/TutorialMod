package com.plasmablazer.tutorialmod.handler;

import com.plasmablazer.tutorialmod.reference.Configs;
import com.plasmablazer.tutorialmod.reference.Reference;
import com.plasmablazer.tutorialmod.reference.Settings;
import cpw.mods.fml.client.event.*;
import cpw.mods.fml.common.eventhandler.*;
import net.minecraft.util.StatCollector;
import net.minecraftforge.common.config.*;

import java.io.*;

public class ConfigHandler
{
    public static Configuration config;

    public static void init(File configFile)
    {
        if (config == null)
        {
            config = new Configuration(configFile);
            loadConfigs();
        }
    }

    private static void loadConfigs()
    {
        Settings.Configs.oreGen[0] = config.getBoolean(Configs.ORE_GEN.name, Configs.ORE_GEN.category, Settings.Configs.oreGen[1], StatCollector.translateToLocal(Configs.ORE_GEN.comment));
        Settings.Configs.furnaceSpeed[0] = config.getInt(Configs.FURNACE_SPEED.name, Configs.FURNACE_SPEED.category, Settings.Configs.furnaceSpeed[1], Settings.Configs.furnaceSpeed[2], Settings.Configs.furnaceSpeed[3], StatCollector.translateToLocal(Configs.FURNACE_SPEED.comment));

        if (config.hasChanged())
        {
            config.save();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent.OnConfigChangedEvent e)
    {
        if (e.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfigs();
        }
    }
}
