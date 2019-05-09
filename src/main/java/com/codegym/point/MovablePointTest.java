package com.codegym.point;

import java.util.Arrays;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);

        MovablePoint movablePoint1 = new MovablePoint(5,6);
        System.out.println(movablePoint1);

        MovablePoint movablePoint2= new MovablePoint(5,5,5,5);
        System.out.println(movablePoint2);

        movablePoint.setXSpeed(12);
        movablePoint.setYSpeed(22);
        System.out.println(movablePoint.getXSpeed()+ movablePoint.getYSpeed());

        movablePoint.setSpeed(33,44);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));

        movablePoint2.move();
        System.out.println(movablePoint2.getX() +" , " + movablePoint2.getY());
    }
}
