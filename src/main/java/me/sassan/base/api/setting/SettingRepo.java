package me.sassan.base.api.setting;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sassan
 * 18.11.2023, 2023
 */
public class SettingRepo {
    public static final SettingRepo INSTANCE = new SettingRepo();
    public List<Setting> list = new ArrayList<>();
}
