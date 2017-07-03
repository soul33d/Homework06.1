package com.homelearning.abstract_factory.gui.linux;

import com.homelearning.abstract_factory.gui.Menu;

public class MenuLinux implements Menu {
    public void show() {
        System.out.println("Linux menu is on screen.");
    }
}
