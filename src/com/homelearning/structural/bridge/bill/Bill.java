package com.homelearning.structural.bridge.bill;

import com.homelearning.structural.bridge.Currency;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract class Bill {
    protected Currency currency;
    protected Map<String, Double> items;
    protected double total;

    public Bill(Currency currency) {
        this(currency, new LinkedHashMap<>());
    }

    public Bill(Currency currency, Map<String, Double> items) {
        this.currency = currency;
        this.items = items;
    }

    public void addItem(String name, double price){
        items.put(name, price);
        total += price;
    }

    public abstract void printBill();
}
