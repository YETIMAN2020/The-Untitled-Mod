
package net.mcreator.godblocks.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.godblocks.entity.NpcEntity;

public class NpcRenderer extends MobRenderer<NpcEntity, VillagerModel<NpcEntity>> {
	public NpcRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(NpcEntity entity) {
		return new ResourceLocation("god_blocks:textures/godblockgui.png");
	}
}
