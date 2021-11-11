package ru.job4j.array;

public class FindLoop {

    public static int indexOf(int[] data, int el) {
        // если элемента нет в массиве, то возвращаем -1.
        int rst = -1;

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

}
