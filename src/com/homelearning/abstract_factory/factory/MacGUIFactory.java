package com.homelearning.abstract_factory.factory;

import com.homelearning.abstract_factory.gui.Button;
import com.homelearning.abstract_factory.gui.Menu;
import com.homelearning.abstract_factory.gui.Window;
import com.homelearning.abstract_factory.gui.mac.ButtonMac;
import com.homelearning.abstract_factory.gui.mac.MenuMac;
import com.homelearning.abstract_factory.gui.mac.WindowMac;

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
