package me.sassan.base.ui;

import me.sassan.base.Base;
import me.sassan.base.api.module.Module;
import me.sassan.base.api.module.ModuleRepo;
import me.sassan.base.ui.components.impl.ModuleComponent;
import me.sassan.base.utils.render.RenderUtils;
import net.minecraft.client.gui.GuiScreen;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class CGui extends GuiScreen {
    private int x, y, width, height;
    private final List<ModuleComponent> moduleComponents = new ArrayList<>();

    public CGui() {
        this.width = 450;
        this.height = 300;
        this.x = 50;
        this.y = 50;

        this.shit();
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);

        RenderUtils.drawRect(x, y, width, height, 0xFF0F0F0F);

        int i = 0;
        for (ModuleComponent md : moduleComponents) {
            md.updateComponent(x, y);
            md.drawScreen(mouseX, mouseY);
            i += 30;
        }
    }

    private void shit() {
        for (Module module : Base.INSTANCE.moduleRepo.list) {
            moduleComponents.add(new ModuleComponent(module, 0, 0, width - 112, 24));
        }
    }

    @Override
    public void keyTyped(char typedChar, int keyCode) {
        super.keyTyped(typedChar, keyCode);
    }
}
