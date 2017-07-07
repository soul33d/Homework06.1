package com.homelearning.creational.abstract_factory.factory;

import com.homelearning.creational.abstract_factory.gui.Button;
import com.homelearning.creational.abstract_factory.gui.Menu;
import com.homelearning.creational.abstract_factory.gui.Window;
import com.homelearning.creational.abstract_factory.gui.mac.ButtonMac;
import com.homelearning.creational.abstract_factory.gui.mac.MenuMac;
import com.homelearning.creational.abstract_factory.gui.mac.WindowMac;

public class MacGUIFactory implements GUIFactory {
    @Override
    public Window newWindow() {
        return new WindowMac();
    }

    @Override
    public Button newButton() {
        return new ButtonMac();
    }

    @Override
    public Menu newMenu() {
        return new MenuMac();
    }
}
