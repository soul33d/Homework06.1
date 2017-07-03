package com.homelearning.abstract_factory.gui.mac;

import com.homelearning.abstract_factory.gui.Window;

public class WindowMac implements Window {
    public void show() {
        System.out.println("Mac window is on screen.");
    }
}
