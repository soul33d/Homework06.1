package com.homelearning.creational.abstract_factory.factory;

import com.homelearning.creational.abstract_factory.gui.Button;
import com.homelearning.creational.abstract_factory.gui.Menu;
import com.homelearning.creational.abstract_factory.gui.Window;
import com.homelearning.creational.abstract_factory.gui.linux.ButtonLinux;
import com.homelearning.creational.abstract_factory.gui.linux.MenuLinux;
import com.homelearning.creational.abstract_factory.gui.linux.WindowLinux;

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
