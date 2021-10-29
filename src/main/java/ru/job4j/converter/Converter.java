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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 5;
        expected = 4.3f;
        out = Converter.dollarToEuro(in);
        passed = expected == out;
        System.out.println("5 dollars are 4.3 euro. Test result : " + passed);

        in = 140;
        expected = (float) 2.3333333;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 rubles are 2.3333333 dollar. Test result : " + passed);

        in = 12;
        expected = (float) 14.039999;
        out = Converter.euroToDollar(in);
        passed = expected == out;
        System.out.println("12 euro are 14.039999 dollar. Test result : " + passed);
    }
}
