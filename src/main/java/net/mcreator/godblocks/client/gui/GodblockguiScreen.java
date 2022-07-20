
package net.mcreator.godblocks.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Checkbox;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.godblocks.world.inventory.GodblockguiMenu;
import net.mcreator.godblocks.network.GodblockguiButtonMessage;
import net.mcreator.godblocks.GodBlocksMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class GodblockguiScreen extends AbstractContainerScreen<GodblockguiMenu> {
	private final static HashMap<String, Object> guistate = GodblockguiMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Checkbox a;
	Checkbox b;
	Checkbox c;
	Checkbox ccc;

	public GodblockguiScreen(GodblockguiMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("god_blocks:textures/godblockgui.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		this.addRenderableWidget(new Button(this.leftPos + 4, this.topPos + 5, 61, 20, new TextComponent("Heal Me"), e -> {
			if (true) {
				GodBlocksMod.PACKET_HANDLER.sendToServer(new GodblockguiButtonMessage(0, x, y, z));
				GodblockguiButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		a = new Checkbox(this.leftPos + 4, this.topPos + 31, 150, 20, new TextComponent("1"), false);
		guistate.put("checkbox:a", a);
		this.addRenderableWidget(a);
		b = new Checkbox(this.leftPos + 4, this.topPos + 54, 150, 20, new TextComponent("2"), false);
		guistate.put("checkbox:b", b);
		this.addRenderableWidget(b);
		c = new Checkbox(this.leftPos + 70, this.topPos + 77, 150, 20, new TextComponent("3"), false);
		guistate.put("checkbox:c", c);
		this.addRenderableWidget(c);
		ccc = new Checkbox(this.leftPos + 4, this.topPos + 101, 150, 20, new TextComponent("3"), false);
		guistate.put("checkbox:ccc", ccc);
		this.addRenderableWidget(ccc);
	}
}
