package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int changeMoney = money - price;

        while (changeMoney > 0) {
            for (int i = 0; i < coins.length; i++) {
                if (changeMoney - coins[i] >= 0) {
                    rsl[size++] = coins[i];
                    changeMoney -= coins[i];
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }

    public static void main(String[] args) {
        int[] newArray = change(50, 12);

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
    }
}
