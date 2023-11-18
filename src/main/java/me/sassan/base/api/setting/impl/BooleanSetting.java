package me.sassan.base.api.setting.impl;

import me.sassan.base.api.setting.Setting;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class BooleanSetting extends Setting<Boolean> {
    public BooleanSetting(String name, Boolean value) {
        super(name, value);
    }

    public BooleanSetting(String name) {
        super(name, false);
    }
}
