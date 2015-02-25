package com.byspajki.spajkaddons;

import cpw.mods.fml.common.registry.GameRegistry;

public class BlockRegistration extends GameRegistry
{
    public BlockRegistration()
    {
        GameRegistry.registerBlock(SpajkAddons.RedDiamondBlock, "RedDiamondBlock");
    }
}
