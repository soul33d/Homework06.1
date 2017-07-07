package com.homelearning.structural.adapter;

public class Figure {
    double x,y;

    public Figure() {
    }

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void move(double xInches, double yInches){
        x += xInches;
        y += yInches;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
