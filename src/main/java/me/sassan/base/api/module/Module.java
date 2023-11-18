package me.sassan.base.api.module;

import lombok.Getter;
import lombok.Setter;
import net.minecraft.client.Minecraft;
import net.weavemc.loader.api.event.EventBus;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
@Getter @Setter
public class Module {
    private String name;
    private String description;
    public int key;

    public boolean enabled;

    protected Minecraft mc = Minecraft.getMinecraft();

    public Module(String name, String description, int key) {
        this.name = name;
        this.description = description;
        this.key = key;
    }

    public void toggle() {
        enabled = !enabled;

        if (this.enabled) {
            onEnable();
        } else {
            onDisable();
        }
    }

    public void onEnable() {
        EventBus.subscribe(this);
    }

    public void onDisable() {
        EventBus.unsubscribe(this);
    }
}
