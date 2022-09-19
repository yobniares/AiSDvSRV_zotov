package ru.mirea;

public class TestBall {

    public static void main(String[] args) {
        Ball ball = new Ball(10,29);
        System.out.println(ball);
        System.out.println("moving right...");
        ball.setX(30);
        System.out.println(ball);
        System.out.println("moving up...");
        ball.setY(5);
        System.out.println(ball);
        System.out.println("to zero...");
        ball.setXY(0,0);
        System.out.println(ball);
        System.out.println("move diagonal...");
        ball.move(15,15);
        System.out.println(ball);
        System.out.println("Test passed");

    }
}
