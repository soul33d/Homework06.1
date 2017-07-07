package com.homelearning.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        Figure figure = new Figure();
        figure.move(1, 2);
        System.out.println(figure);
        FigureMetricAdapter adapter = new FigureMetricAdapter(figure);
        adapter.move(1, 2);
        System.out.println(figure);
    }
}
