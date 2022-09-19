package ru.mirea;

public class Main {
    public static void main(String[] args) {
        Tester tester = new Tester();

        tester.addCircle(new Circle(new Point(10,10),15));

        System.out.println(tester);
        tester.addCircle(new Circle(new Point(20,50),10));

        System.out.println(tester);

        tester.clearCircles();

        System.out.println(tester);
          

    }
}
