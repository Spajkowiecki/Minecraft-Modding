package com.byspajki.spajkaddons.core.blocks;

import com.byspajki.spajkaddons.SpajkAddons;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RedDiamondOre extends Block
{
	public RedDiamondOre(Material material)
	{
		super(material);
		this.setBlockName("RedDiamondOre");
		this.setHardness(4.0F);
		this.setBlockTextureName(SpajkAddons.MODID +"textures/blocks/RedDiamondOre.png");
		this.setStepSound(soundTypeStone);
		this.setCreativeTab(CreativeTabs.tabRedstone);
		
		
		//Block Registry
		
		
	}
}
