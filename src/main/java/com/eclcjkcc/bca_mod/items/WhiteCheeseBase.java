package com.eclcjkcc.bca_mod.items;

import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class WhiteCheeseBase extends Item {
    public WhiteCheeseBase() {
        super(new Properties().group(BCA_Mod.MOD_GROUP).food(new Food.Builder()
                .hunger(5)
                .saturation(10)
                .effect(new EffectInstance(Effects.NAUSEA, 100, 3), 1)
                .effect(new EffectInstance(Effects.HUNGER, 100, 5), 0.5f)
                .effect(new EffectInstance(Effects.BLINDNESS, 100, 1), 0.4f)
                .build())
        );
    }
}

