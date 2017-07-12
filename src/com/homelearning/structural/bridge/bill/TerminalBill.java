package com.homelearning.structural.bridge.bill;

import com.homelearning.structural.bridge.Currency;

import java.util.Map;

public class TerminalBill extends Bill {

    public TerminalBill(Currency currency) {
        super(currency);
    }

    public TerminalBill(Currency currency, Map<String, Double> items) {
        super(currency, items);
    }

    @Override
    public void printBill() {
        items.forEach((name, price) -> System.out.println(name + " : " + price + " " + currency));
        System.out.println("Total : " + total + " " + currency);
    }
}
