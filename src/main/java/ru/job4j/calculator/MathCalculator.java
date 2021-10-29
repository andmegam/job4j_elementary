package ru.job4j.calculator;

import ru.job4j.math.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double divAndMinus(double first, double second) {
        return MathFunction.div(first, second)
                + MathFunction.minus(first, second);
    }

    public static double sumAll(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.minus(first, second)
                + MathFunction.div(first, second)
                + MathFunction.minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат сумма двух чисел и умножение двух чисел: " + sumAndMultiply(10, 20));
        System.out.println("Результат разность двух чисел и деление двух чисел: " + divAndMinus(10, 20));
        System.out.println("Результат сумма всех четырех операций: " + sumAll(10, 20));
    }
}

