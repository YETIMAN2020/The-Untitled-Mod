
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_untitled_mod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.the_untitled_mod.block.entity.BatteryMK1BlockEntity;
import net.mcreator.the_untitled_mod.TheUntitledModMod;

public class TheUntitledModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES,
			TheUntitledModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> BATTERY_MK_1 = register("battery_mk_1", TheUntitledModModBlocks.BATTERY_MK_1,
			BatteryMK1BlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block,
			BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
