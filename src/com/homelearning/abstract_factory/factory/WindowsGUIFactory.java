package com.homelearning.abstract_factory.factory;

import com.homelearning.abstract_factory.gui.Button;
import com.homelearning.abstract_factory.gui.Menu;
import com.homelearning.abstract_factory.gui.Window;
import com.homelearning.abstract_factory.gui.windows.ButtonWin;
import com.homelearning.abstract_factory.gui.windows.MenuWin;
import com.homelearning.abstract_factory.gui.windows.WindowWin;

public class WindowsGUIFactory implements GUIFactory {
    @Override
    public Window newWindow() {
        return new WindowWin();
    }

    @Override
    public Button newButton() {
        return new ButtonWin();
    }

    @Override
    public Menu newMenu() {
        return new MenuWin();
    }
}
