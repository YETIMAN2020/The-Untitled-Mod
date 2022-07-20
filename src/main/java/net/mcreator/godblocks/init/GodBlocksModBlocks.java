
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.godblocks.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.godblocks.block.GodblockBlock;
import net.mcreator.godblocks.GodBlocksMod;

public class GodBlocksModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GodBlocksMod.MODID);
	public static final RegistryObject<Block> GODBLOCK = REGISTRY.register("godblock", () -> new GodblockBlock());
}
