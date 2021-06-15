package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CheeseBase extends Item {
    public CheeseBase() {
        super(new Properties().group(BCA_Mod.MOD_GROUP).food(new Food.Builder()
                .hunger(5)
                .saturation(10)
                .build())
        );
    }
}

