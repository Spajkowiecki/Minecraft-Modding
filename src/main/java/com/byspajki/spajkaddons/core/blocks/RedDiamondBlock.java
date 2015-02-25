package com.byspajki.spajkaddons.core.blocks;

import com.byspajki.spajkaddons.SpajkAddons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedDiamondBlock extends Block
{
	public RedDiamondBlock(Material material)
	{
		super(Material.rock);
		this.setBlockName("RedDiamondBlock");
		this.setBlockTextureName(SpajkAddons.MODID+":"+"textures/blocks/RedDiamondBlock.png");
		this.setCreativeTab(CreativeTabs.tabBlock);
		//Block Registry

		
	}
}
