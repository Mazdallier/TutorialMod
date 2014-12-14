package com.plasmablazer.tutorialmod;

import com.plasmablazer.tutorialmod.proxies.IProxy;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.event.*;

@Mod(name = Reference.MOD_NAME, modid = Reference.MOD_ID, version = Reference.MOD_VERSION)
public class TutorialMod
{
    @Mod.Instance(Reference.MOD_ID)
    public static TutorialMod instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
