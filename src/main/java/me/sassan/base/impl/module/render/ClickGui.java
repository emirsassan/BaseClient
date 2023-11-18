package me.sassan.base.impl.module.render;

import me.sassan.base.api.module.Module;
import me.sassan.base.ui.CGui;
import org.lwjgl.input.Keyboard;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class ClickGui extends Module {
    private CGui cGui;

    public ClickGui() {
        super("ClickGui", "ClickGui", Keyboard.KEY_RCONTROL);
    }

    @Override
    public void onEnable() {
        if (cGui == null) {
            cGui = new CGui();
        }

        setEnabled(false);
        mc.displayGuiScreen(cGui);
        super.onEnable();
    }
}
