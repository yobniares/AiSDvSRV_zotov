package ru.mirea;

public class Circle {
    private Point center =new Point();
    private double radius = 0.0;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(){}

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
