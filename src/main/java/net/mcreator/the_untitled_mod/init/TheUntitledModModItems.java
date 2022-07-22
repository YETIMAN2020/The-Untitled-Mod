
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_untitled_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.the_untitled_mod.item.EnergymeterItem;
import net.mcreator.the_untitled_mod.TheUntitledModMod;

public class TheUntitledModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheUntitledModMod.MODID);
	public static final RegistryObject<Item> SOLAR_PANEL_MK_1 = block(TheUntitledModModBlocks.SOLAR_PANEL_MK_1, TheUntitledModModTabs.TAB_WHAT);
	public static final RegistryObject<Item> BATTERY_MK_1 = block(TheUntitledModModBlocks.BATTERY_MK_1, TheUntitledModModTabs.TAB_WHAT);
	public static final RegistryObject<Item> ENERGYMETER = REGISTRY.register("energymeter", () -> new EnergymeterItem());
	public static final RegistryObject<Item> COAL_GENERATOR = block(TheUntitledModModBlocks.COAL_GENERATOR, TheUntitledModModTabs.TAB_WHAT);
	public static final RegistryObject<Item> CABLE_BLOCK = block(TheUntitledModModBlocks.CABLE_BLOCK, TheUntitledModModTabs.TAB_WHAT);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
