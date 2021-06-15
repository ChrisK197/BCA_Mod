package com.eclcjkcc.bca_mod.blocks;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class SaltOreItemBase extends BlockItem {

    public SaltOreItemBase(Block block) {
        super(block, new Properties().group(BCA_Mod.MOD_GROUP));
    }
}
