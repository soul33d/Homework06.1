package com.homelearning.abstract_factory.gui.linux;

import com.homelearning.abstract_factory.gui.Window;

public class WindowLinux implements Window {
    public void show() {
        System.out.println("Linux window is on screen");
    }
}
