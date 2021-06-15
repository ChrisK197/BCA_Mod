package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MilkBucketItem;

public class HalfCreamBucketBase extends MilkBucketItem {
    public HalfCreamBucketBase() {
        super(new Properties().maxStackSize(1).group(BCA_Mod.MOD_GROUP).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(1)
                .build())
        );
    }
}

