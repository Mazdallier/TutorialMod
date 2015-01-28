package com.plasmablazer.tutorialmod.item;

import com.plasmablazer.tutorialmod.init.ModCreativeTabs;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.*;

public class ItemTM extends Item
{
    public ItemTM(String name)
    {
        super();
        this.setUnlocalizedName(name);
        this.setCreativeTab(ModCreativeTabs.tutorialTab);
        this.setMaxStackSize(64);
    }

    @Override
    public String getUnlocalizedName()
    {
        return formatName(super.getUnlocalizedName());
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return formatName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    public String formatName(String name)
    {
        return String.format("item.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(name));
    }

    public String getUnwrappedUnlocalizedName(String name)
    {
        return name.substring(name.indexOf(".") + 1);
    }

    public String getName()
    {
        return this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(":") + 1);
    }
}
