package ocp1.shape.impl;

import ocp1.shape.Shape;

public class Rectangle implements Shape {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
