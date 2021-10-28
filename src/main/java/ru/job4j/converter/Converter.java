package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static float euroToDollar(float value) {
        return value * 1.17f;
    }

    public static float dollarToEuro(float value) {
        return value * 0.86f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");

        euro = Converter.dollarToEuro(5);
        System.out.println("5 dollars are " + euro + " euro.");

        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");

        dollar = Converter.euroToDollar(12);
        System.out.println("12 euro is " + dollar + " dollars.");
    }
}
