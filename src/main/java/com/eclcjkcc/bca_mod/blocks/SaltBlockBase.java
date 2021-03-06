package com.eclcjkcc.bca_mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;

public class SaltBlockBase extends Block {

    public SaltBlockBase() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(1.5f, 6f)
                .sound(SoundType.STONE)
                .harvestLevel(1)
                .harvestTool(ToolType.PICKAXE)
                .setRequiresTool()
        );
    }
    @Override
    public int getExpDrop(BlockState state, IWorldReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
