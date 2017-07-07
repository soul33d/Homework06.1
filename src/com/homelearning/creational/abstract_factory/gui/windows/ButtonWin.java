package com.homelearning.creational.abstract_factory.gui.windows;

import com.homelearning.creational.abstract_factory.gui.Button;

public class ButtonWin implements Button {
    public void show() {
        System.out.println("Windows button is on screen.");
    }
}
