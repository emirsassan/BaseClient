package me.sassan.base.ui.components.impl;

import me.sassan.base.api.module.Module;
import me.sassan.base.ui.components.Component;
import me.sassan.base.utils.render.RenderUtils;
import net.minecraft.client.Minecraft;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class ModuleComponent extends Component {
    private final Module module;

    public ModuleComponent(Module module, int x, int y, int width, int height) {
        super(x, y, width, height);
        this.module = module;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY) {
        RenderUtils.drawRect(x, y, width, height, 0xFF1F1F1F);
        RenderUtils.drawString(Minecraft.getMinecraft().fontRendererObj, module.getName(), x + 6, (int) (y + (float) Minecraft.getMinecraft().fontRendererObj.FONT_HEIGHT / 2 + 4), module.isEnabled() ? 0xFFFF4F4F : -1);
    }

    @Override
    public void mouseClicked(int mouseX, int mouseY, int mouse) {
        if (isMouseOver(mouseX, mouseY)) {
            switch (mouse) {

                case 0:
                    module.toggle();
                    break;

                case 1:
                    break;

                case 2:
                    //keybinding
                    break;
            }
        }
    }

    @Override
    public void keyTyped(char typedChar, int key) {

    }
}
