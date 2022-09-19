package ru.mirea;

public class Point {
    private double x = 0.0;
    private double y = 0.0;

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Point(){}

    public void setY(double y) {
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
