package ru.job4j.array;

public class Square {

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int number : array) {
            System.out.println(number);
        }
    }

    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = i * i;
        }
        return rst;
    }
}
