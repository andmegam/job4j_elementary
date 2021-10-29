package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void main(String[] args) {
        double square1 = SqArea.square(4, 1);
        double square2 = SqArea.square(6, 2);

        System.out.println("p = 4, k = 1, real = " + square1);
        System.out.println("p = 6, k = 2, real = " + square2);
    }
}