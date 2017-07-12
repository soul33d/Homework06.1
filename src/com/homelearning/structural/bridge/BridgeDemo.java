package com.homelearning.structural.bridge;

import com.homelearning.structural.bridge.bill.Bill;
import com.homelearning.structural.bridge.bill.TerminalBill;

public class BridgeDemo {
    public static void main(String[] args) {
        Bill bill = new TerminalBill(Currency.UAH);
        bill.addItem("Keyboard", 500);
        bill.addItem("Mouse", 300);
        bill.addItem("Mousepad", 90);
        bill.printBill();
    }
}
