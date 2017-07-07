package com.homelearning.creational.abstract_factory.factory;

import com.homelearning.creational.abstract_factory.gui.Button;
import com.homelearning.creational.abstract_factory.gui.Menu;
import com.homelearning.creational.abstract_factory.gui.Window;

public interface GUIFactory {
    Window newWindow();
    Button newButton();
    Menu newMenu();
}
