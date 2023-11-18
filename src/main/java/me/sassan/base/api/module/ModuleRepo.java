package me.sassan.base.api.module;

import me.sassan.base.impl.module.player.Jump;
import me.sassan.base.impl.module.render.ClickGui;
import net.minecraft.client.Minecraft;
import net.weavemc.loader.api.event.EventBus;
import net.weavemc.loader.api.event.KeyboardEvent;

import java.util.*;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class ModuleRepo {
    public List<Module> list = new ArrayList<>();

    public ModuleRepo() {
        list.add(new Jump());
        list.add(new ClickGui());

        EventBus.subscribe(KeyboardEvent.class, event -> {
            list.forEach((m) -> {
                if (event.getKeyState()) return;

                if (event.getKeyCode() == m.getKey()) {
                    m.toggle();
                    Minecraft.getMinecraft().thePlayer.sendChatMessage("Toggled " + m.getName() + " to " + m.isEnabled());
                }
            });
        });

        System.out.println("Loaded " + list.size() + " modules");
    }
}
