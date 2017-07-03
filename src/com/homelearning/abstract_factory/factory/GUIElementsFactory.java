package com.homelearning.abstract_factory.factory;

import com.homelearning.abstract_factory.gui.Button;
import com.homelearning.abstract_factory.gui.Menu;
import com.homelearning.abstract_factory.gui.Window;

public interface GUIElementsFactory {
    Window newWindow();
    Button newButton();
    Menu newMenu();
}
