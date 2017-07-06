package com.homelearning.adapter;

public class FigureMetricAdapter {
    private static final double COEFFICIENT = 2.54;

    private Figure figure;

    public FigureMetricAdapter(Figure figure) {
        this.figure = figure;
    }

    public void move(int xSantimeters, int ySantimeters){
        figure.move(xSantimeters/COEFFICIENT, ySantimeters/COEFFICIENT);
    }
}
