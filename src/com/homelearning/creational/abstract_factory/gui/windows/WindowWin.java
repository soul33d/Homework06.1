package com.homelearning.creational.abstract_factory.gui.windows;

import com.homelearning.creational.abstract_factory.gui.Window;

public class WindowWin implements Window {
    public void show() {
        System.out.println("Windows window is on screen.");
    }
}
