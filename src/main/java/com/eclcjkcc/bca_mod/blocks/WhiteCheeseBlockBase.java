package com.eclcjkcc.bca_mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class WhiteCheeseBlockBase extends Block {

    public WhiteCheeseBlockBase() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(0.5f, 1f)
                .sound(SoundType.SLIME)
        );
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
