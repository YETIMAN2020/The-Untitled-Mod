
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_untitled_mod.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.the_untitled_mod.client.gui.CoalGeneratorGuiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TheUntitledModModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(TheUntitledModModMenus.COAL_GENERATOR_GUI, CoalGeneratorGuiScreen::new);
		});
	}
}
