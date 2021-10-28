package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        double result0 = Point.distance(0, 0, 2, 0);
        double result1 = Point.distance(10, 20, 30, 40);
        double result2 = Point.distance(120, 130, 150, 160);

        System.out.println("result (0, 0) to (2, 0) = " + result0);
        System.out.println("result (10, 20) to (30, 40) = " + result1);
        System.out.println("result (120, 130) to (150, 160) = " + result2);
    }
}
