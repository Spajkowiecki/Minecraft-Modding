package com.byspajki.spajkaddons;

import com.byspajki.spajkaddons.core.blocks.RedDiamondBlock;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SpajkCreativeTab extends CreativeTabs 
{
    
    static Item icon;
    

    public SpajkCreativeTab() 
    {
        super(SpajkAddons.MODID);
    }

    @Override
    public Item getTabIconItem() 
    {        
        return icon;
    }
    
}
