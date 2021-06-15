package com.eclcjkcc.bca_mod.events;
//check this file later
import com.eclcjkcc.bca_mod.BCA_Mod;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = BCA_Mod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.DEDICATED_SERVER)
public class ModServerEvents {


    //@SubscribeEvent
    //public static void onScrapeSneak(InputUpdateEvent event) {
    //LivingEntity player = event.getEntityLiving();
    //if (event.getMovementInput().sneaking){
    //if (player.getHeldItemMainhand().getItem() == RegistryHandler.SCRAPER.get()) {
    //if (player.getHeldItemOffhand().getItem() == Items.ROTTEN_FLESH) {
                    //event.getPlayer().addItemStackToInventory(new ItemStack(RegistryHandler.OLD_FLESH.get()));
    //ItemHandlerHelper.giveItemToPlayer(event.getPlayer(), new ItemStack(RegistryHandler.OLD_FLESH.get()));
    //}

    //}
    //}
    //}
}