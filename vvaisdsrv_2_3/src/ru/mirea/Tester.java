package ru.mirea;

import java.util.ArrayList;

public class Tester {
    private int numOfCircles = 0;
    private ArrayList<Circle> circles = new ArrayList<>();

    public Tester(){
    }

    public Tester(ArrayList<Circle> circles){
        this.circles = circles;
        this.numOfCircles = circles.size();
    }

    public void addCircle(Circle circle){
        this.circles.add(circle);
        this.numOfCircles+=1;
    }

    public void clearCircles(){
        this.circles.clear();
        this.numOfCircles = 0;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "numOfCircles=" + numOfCircles +
                ", circles=" + circles +
                '}';
    }
}

