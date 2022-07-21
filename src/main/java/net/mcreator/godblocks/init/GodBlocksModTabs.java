
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.godblocks.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GodBlocksModTabs {
	public static CreativeModeTab TAB_THE_UNTITELD_MOD;

	public static void load() {
		TAB_THE_UNTITELD_MOD = new CreativeModeTab("tabthe_untiteld_mod") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GodBlocksModBlocks.GODBLOCK.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
