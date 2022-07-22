
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.the_untitled_mod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class TheUntitledModModTabs {
	public static CreativeModeTab TAB_WHAT;

	public static void load() {
		TAB_WHAT = new CreativeModeTab("tabwhat") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.COBBLESTONE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
