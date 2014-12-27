package com.plasmablazer.tutorialmod;

import com.plasmablazer.tutorialmod.proxy.*;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class TutorialMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TutorialMod instance;

    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
    public static IProxy proxy;

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent e)
    {

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
