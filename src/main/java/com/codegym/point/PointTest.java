package com.codegym.point;

import java.util.Arrays;

public class PointTest {
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point);

        Point point1 = new Point(3,4);
        System.out.println(point1);

        point.setX(9);
        point.setY(8);
        System.out.println("x: " + point.getX() + ", y: " + point.getY());

        point.setXY(1,1);
        System.out.println(Arrays.toString(point.getXY()));
    }
}
