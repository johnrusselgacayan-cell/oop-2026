package com.cell.model;

import com.cell.abs.GeometricObject;

public class Circle extends GeometricObject {
    private double radius;

    public Circle(double radius, String string, boolean b) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f]", radius);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle c = (Circle) o;
            return radius == c.radius;
        }
        return false;
    }
    
}
