package com.eclcjkcc.bca_mod.world.gen;

import com.eclcjkcc.bca_mod.util.RegistryHandler;
import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Random;

@Mod.EventBusSubscriber(modid = BCA_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModPlantGen {

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
