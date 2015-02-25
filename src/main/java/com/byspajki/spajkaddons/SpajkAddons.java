package com.byspajki.spajkaddons;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import com.byspajki.spajkaddons.core.blocks.RedDiamondOre;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = SpajkAddons.MODID, version = SpajkAddons.VERSION)
public class SpajkAddons
{

    
    public static final     String MODID = "spajkadds";
    public static final     String VERSION = "1.0";
    public static final     String MODNAME = "SpajkAddons";
    
    public static           Block RedDiamondOre;
    public static           Block RedDiamondBlock;
    
    public                  CreativeTabs tabSpajk;
    
    
    //tab for my mod: Spajk Addons
    @Mod.Instance(SpajkAddons.MODID)
    public static SpajkAddons instance;

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        tabSpajk = new SpajkCreativeTab();
    }
}
