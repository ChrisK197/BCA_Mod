package com.eclcjkcc.bca_mod.world.gen;

import com.eclcjkcc.bca_mod.blocks.HerbBase;
import com.eclcjkcc.bca_mod.util.RegistryHandler;
import com.eclcjkcc.bca_mod.BCA_Mod;
import com.google.common.collect.ImmutableSet;
import jdk.nashorn.internal.ir.BlockLexicalContext;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.util.IMutableSearchTree;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

@Mod.EventBusSubscriber(modid = BCA_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModPlantGen {

    /*public static final BlockState herb = RegistryHandler.HERB.get().getDefaultState();
    public static final BlockClusterFeatureConfig herb_config = new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(herb), new SimpleBlockPlacer()).tries(64).whitelist(ImmutableSet.of(Blocks.GRASS_BLOCK.getBlock())).func_227317_b_().build();

    public static void generatePlants() {
        ForgeRegistries.BIOMES.forEach(biome -> {
            biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(herb_config).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(10))));
        });
    }*/
    @SubscribeEvent
    public static void generatePlants(FMLLoadCompleteEvent event) {
        for (Biome biome : ForgeRegistries.BIOMES) {

            if (biome.getCategory() == Biome.Category.NETHER) {

            } else if (biome.getCategory() == Biome.Category.THEEND) {

            } else {

            }
        }
    }

    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        this.addHerb(RegistryHandler.HERB.get(), world, random, chunkX, chunkZ);
    }

    public void addHerb(Block block, World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 20; i++) {
            int posX = chunkX + random.nextInt(16);
            int posZ = chunkZ + random.nextInt(16);
            int posY = 40 + random.nextInt(25);

        }
    }
}
