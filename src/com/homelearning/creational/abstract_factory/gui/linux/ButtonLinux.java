package com.homelearning.creational.abstract_factory.gui.linux;

import com.homelearning.creational.abstract_factory.gui.Button;

public class ButtonLinux implements Button {
    public void show() {
        System.out.println("Linux button is on screen.");
    }
}
