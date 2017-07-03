package com.homelearning.abstract_factory.factory;

import com.homelearning.abstract_factory.gui.Button;
import com.homelearning.abstract_factory.gui.Menu;
import com.homelearning.abstract_factory.gui.Window;
import com.homelearning.abstract_factory.gui.linux.ButtonLinux;
import com.homelearning.abstract_factory.gui.linux.MenuLinux;
import com.homelearning.abstract_factory.gui.linux.WindowLinux;

public class LinuxGUIFactory implements GUIFactory {
    @Override
    public Window newWindow() {
        return new WindowLinux();
    }

    @Override
    public Button newButton() {
        return new ButtonLinux();
    }

    @Override
    public Menu newMenu() {
        return new MenuLinux();
    }
}
