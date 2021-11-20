package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        System.out.println();
        String[] names = new String[4];
        names[0] = "АЛЕКСАНДР СЕРГЕЕВИЧ ПУШКИН";
        names[1] = "ЛЕВ НИКОЛАЕВИЧ ТОЛСТОЙ";
        names[2] = "ФЕДОР МИХАЙЛОВИЧ ДОСТОЕВСКИЙ";
        names[3] = "АНТОН ПАВЛОВИЧ ЧЕХОВ";
        System.out.println("names[0] = " + names[0]);
        System.out.println("names[1] = " + names[1]);
        System.out.println("names[2] = " + names[2]);
        System.out.println("names[3] = " + names[3]);
    }
}
