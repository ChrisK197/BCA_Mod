package com.eclcjkcc.bca_mod.events;

import com.eclcjkcc.bca_mod.util.RegistryHandler;
import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;


@Mod.EventBusSubscriber(modid = BCA_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvents {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent event){

        //Render Types
        RenderTypeLookup.setRenderLayer(RegistryHandler.HERB.get(), RenderType.getCutout());
    }
}