
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.godblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.godblocks.item.EnergymeterItem;
import net.mcreator.godblocks.GodBlocksMod;

public class GodBlocksModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GodBlocksMod.MODID);
	public static final RegistryObject<Item> GODBLOCK = block(GodBlocksModBlocks.GODBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> NPC = REGISTRY.register("npc_spawn_egg",
			() -> new ForgeSpawnEggItem(GodBlocksModEntities.NPC, -1, -1, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> SOLAR_PANEL_MK_1 = block(GodBlocksModBlocks.SOLAR_PANEL_MK_1, GodBlocksModTabs.TAB_THE_UNTITELD_MOD);
	public static final RegistryObject<Item> BATTERY_MK_1 = block(GodBlocksModBlocks.BATTERY_MK_1, GodBlocksModTabs.TAB_THE_UNTITELD_MOD);
	public static final RegistryObject<Item> ENERGYMETER = REGISTRY.register("energymeter", () -> new EnergymeterItem());
	public static final RegistryObject<Item> COAL_GENERATOR = block(GodBlocksModBlocks.COAL_GENERATOR, GodBlocksModTabs.TAB_THE_UNTITELD_MOD);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
