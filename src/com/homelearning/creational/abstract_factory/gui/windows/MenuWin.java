package com.homelearning.creational.abstract_factory.gui.windows;

import com.homelearning.creational.abstract_factory.gui.Menu;

public class MenuWin implements Menu {
    public void show() {
        System.out.println("Windows menu is on screen.");
    }
}
