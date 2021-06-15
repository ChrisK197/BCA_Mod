package com.eclcjkcc.bca_mod.world.gen;

import com.eclcjkcc.bca_mod.util.RegistryHandler;
import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.ConfiguredPlacement;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = BCA_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModOreGen {

    @SubscribeEvent
    public static void generateOres(FMLLoadCompleteEvent event){
        for(Biome biome : ForgeRegistries.BIOMES){
            if(biome.getCategory() == Biome.Category.NETHER){

            }
            else if (biome.getCategory() == Biome.Category.THEEND){
            }
            else{
                if(biome == Biomes.MOUNTAINS || biome == Biomes.DESERT_HILLS || biome == Biomes.WOODED_HILLS || biome == Biomes.TAIGA_HILLS || biome == Biomes.MOUNTAIN_EDGE || biome == Biomes.JUNGLE_HILLS || biome == Biomes.BIRCH_FOREST_HILLS || biome == Biomes.SNOWY_TAIGA_HILLS || biome == Biomes.GIANT_TREE_TAIGA_HILLS || biome == Biomes.GRAVELLY_MOUNTAINS) {
                    genOre(biome, 7, 3, 3, 50, OreFeatureConfig.FillerBlockType.NATURAL_STONE, RegistryHandler.SALT_ORE.get().getDefaultState(), 10);
                }
            }
        }
    }
    private static void genOre(Biome biome, int count, int bottomOffset, int topOffset, int max, OreFeatureConfig.FillerBlockType filler, BlockState defaultBlockstate, int size){
        CountRangeConfig range = new CountRangeConfig(count, bottomOffset, topOffset, max);
        OreFeatureConfig feature = new OreFeatureConfig(filler, defaultBlockstate, size);
        ConfiguredPlacement config = Placement.COUNT_RANGE.configure(range);
        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(feature).withPlacement(config));

    }
}
