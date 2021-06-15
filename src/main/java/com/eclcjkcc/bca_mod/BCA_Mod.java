package com.eclcjkcc.bca_mod;

import com.eclcjkcc.bca_mod.util.RegistryHandler;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("bca_food_mod")
public class BCA_Mod
{
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "bca_food_mod";
    public static final String MOD_NAME = "BCA_Mod";
    public static final ItemGroup MOD_GROUP = new ModGroup("bca_tab");

    public BCA_Mod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        RegistryHandler.init();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) { }

    private void doClientStuff(final FMLClientSetupEvent event) { }

    public static class ModGroup extends ItemGroup {
        public ModGroup(String label) {
            super(label);
        }

        @Override
        public ItemStack createIcon() {
            return RegistryHandler.SALT_ORE_ITEM.get().getDefaultInstance();
        }


    }
}
