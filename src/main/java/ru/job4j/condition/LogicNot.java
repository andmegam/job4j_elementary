package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isNotEven(int num) {
        return !isEven(num);
    }

    public static boolean isNotPositive(int num) {
        return !(num > 0);
    }

    public static boolean notEvenAndPositive(int num) {
        return isNotEven(num) && isPositive(num);
    }

    public static boolean isEvenOrNotPositive(int num) {
        return (isEven(num) || isNotPositive(num));
    }

    public static void main(String[] args) {
        int num = 9;
        System.out.println(isEven(num));
        System.out.println(isPositive(num));
        System.out.println(isNotEven(num));
        System.out.println(isNotPositive(num));
        System.out.println(notEvenAndPositive(num));
        System.out.println(isEvenOrNotPositive(num));
    }
}
