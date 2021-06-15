package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class CookedFishSandwichBase extends Item {
    public CookedFishSandwichBase() {
        super(new Properties().group(BCA_Mod.MOD_GROUP).food(new Food.Builder()
                .hunger(7)
                .saturation(11f)
                .build())
        );
    }
}
