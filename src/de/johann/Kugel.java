package de.johann;

public class Kugel {
    private double radius;

    private final double pi = 3.14;

    public Kugel(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Der Radius darf nicht Null oder negativ sein!");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getDurchmesser() {
        return 2.0 * radius;
    }

    public double getVolumen() {
        return (4.0 / 3.0) * pi * (radius * radius * radius);
    }

    public double getOberflaeche() {
        return 4.0 * pi * (radius * radius);
    }
}