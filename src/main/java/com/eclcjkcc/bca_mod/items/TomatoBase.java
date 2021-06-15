package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class TomatoBase extends Item {

    public TomatoBase() {
        super(new Properties()
                .group(BCA_Mod.MOD_GROUP)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(3)
                        .build())
        );
    }
}
