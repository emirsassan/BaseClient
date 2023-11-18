package me.sassan.base;

import me.sassan.base.api.module.ModuleRepo;
import net.weavemc.loader.api.ModInitializer;
import net.weavemc.loader.api.event.EventBus;

public class Base implements ModInitializer {
    public static Base INSTANCE;
    public ModuleRepo moduleRepo;

    @Override
    public void preInit() {
        System.out.println("Initializing BaseClient");

        EventBus.subscribe(this);

        INSTANCE = this;
    }

    public void post() {
        moduleRepo = new ModuleRepo();
    }
}