package com.plasmablazer.tutorialmod.block;

import com.plasmablazer.tutorialmod.init.ModCreativeTabs;
import com.plasmablazer.tutorialmod.reference.*;
import cpw.mods.fml.relauncher.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.*;

public class BlockTM extends Block
{
    public BlockTM(String name)
    {
        this(name, Material.air);
    }

    public BlockTM(String name, Material material)
    {
        super(material);
        this.setBlockName(name);
        this.setBlockTextureName(name);
        this.setCreativeTab(ModCreativeTabs.tutorialTab);
    }

    @Override
    public String getUnlocalizedName()
    {
        return formatName(super.getUnlocalizedName());
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(getUnwrappedUnlocalizedName(this.getUnlocalizedName()));
    }

    public String formatName(String name)
    {
        return String.format("tile.%s%s", Textures.RESOURCE_PREFIX, getUnwrappedUnlocalizedName(name));
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
