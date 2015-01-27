package com.plasmablazer.tutorialmod;

import com.plasmablazer.tutorialmod.handler.*;
import com.plasmablazer.tutorialmod.proxy.*;
import com.plasmablazer.tutorialmod.reference.*;
//import com.plasmablazer.tutorialmod.util.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY)
public class TutorialMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TutorialMod instance;

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {
        ConfigHandler.init(e.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent e)
    {

    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent e)
    {

    }
}
