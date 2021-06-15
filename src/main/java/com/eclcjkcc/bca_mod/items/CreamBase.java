package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CreamBase extends Item {
    public CreamBase() {
        super(new Properties().group(BCA_Mod.MOD_GROUP).food(new Food.Builder()
                .hunger(0)
                .setAlwaysEdible()
                .saturation(5)
                .effect(new EffectInstance(Effects.MINING_FATIGUE, 1000, 1), 0.5f)
                .build())
        );
    }
}

