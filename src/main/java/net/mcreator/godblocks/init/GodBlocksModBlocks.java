
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.godblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.godblocks.block.SolarPanelMK1Block;
import net.mcreator.godblocks.block.CoalGeneratorBlock;
import net.mcreator.godblocks.block.BatteryMK1Block;
import net.mcreator.godblocks.GodBlocksMod;

public class GodBlocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GodBlocksMod.MODID);
	public static final RegistryObject<Block> SOLAR_PANEL_MK_1 = REGISTRY.register("solar_panel_mk_1", () -> new SolarPanelMK1Block());
	public static final RegistryObject<Block> BATTERY_MK_1 = REGISTRY.register("battery_mk_1", () -> new BatteryMK1Block());
	public static final RegistryObject<Block> COAL_GENERATOR = REGISTRY.register("coal_generator", () -> new CoalGeneratorBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			SolarPanelMK1Block.registerRenderLayer();
		}
	}
}
