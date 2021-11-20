package ru.job4j.praxis;

import java.util.Arrays;

public class MyArrays {

    public static void main(String[] args) {
        int[] left = {1, 3};
        int[] right = {2, 4};
        int[][] data = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[] res = rightDiagonal(data);
        System.out.println(Arrays.toString(res));
    }

    /**
     * Вам дана квадратная матрица. Нужно получить правую диагональ. Правая диагональ это диагональ матрицы,
     * которая идет справа налево. Например, для {{1, 2}, {3, 4}} это будет {2, 3}, левой в этом случае будет {1, 4}
     */
    public static int[] rightDiagonal(int[][] data) {
        int[] res = new int[data.length];
        int index = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i == data.length - 1 - j) {
                    res[index++] = data[i][j];
                }
            }
        }
        return res;
    }

    /**
     * У String есть метод indexOf(). Он ищет первое вхождение символа.
     * Ваша задача написать метод, который возвращает
     * индекс по количество вхождений. Если ничего не найдено нужно вернуть -1
     * <p>
     * Если если число вхождений указано равное 1, то метод работает как обычный indexOf()
     */
    public static int indexOfWithCount(char[] string, char c, int number) {
        int index = 0;
        for (int i = number; i < string.length; i++) {
            if (string[i] == c) {
                index = i;
            }
        }
        return index > 0 ? index : -1;
    }

    /**
     * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве четные числа в порядке убывания
     * их индексов. Для вывода использовать System.out.println()     *
     * Например, для {1, 2, 3, 4} вывести 4, 2
     */
    public static void evenPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i] % 2 == 0) {
                System.out.println(array[array.length - 1 - i]);
            }
        }
    }

    /**
     * Дан целочисленный массив размера N. Вывести все содержащиеся в данном массиве нечетные числа в
     * порядке возрастания их индексов. Для вывода использовать System.out.println()
     */
    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Даны целые числа n (> 2), a и b. Сформировать и вывести целочисленный массив размера n, первый элемент
     * которого равен a, второй равен b, а каждый последующий элемент равен сумме всех предыдущих.
     */
    public static int[] summingPrevious(int a, int b, int n) {
        int[] result = new int[n];
        result[0] = a;
        result[1] = b;
        for (int i = 2; i < result.length; i++) {
            for (int j = 0; j < i; j++) {
                result[i] += result[j];
            }

        }
        return result;
    }

    /**
     * Транспонирование матрицы
     *
     * @param matrix - исходная матрица
     * @return - транспонированная матрица
     */
    public static int[][] convert(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = matrix[j][i];
            }
        }

        return result;
    }

    /**
     * Треугольная матрицац
     *
     * @param count - кол-во строк
     * @return - матрица
     */
    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int r = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = r++;
            }
        }
        return triangle;
    }

    /**
     * Слияние двух отсортированных массивов.
     *
     * @param arr1 - первый массив
     * @param arr2 - второй массив
     * @return - объединенный массив
     */
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, r = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[r] = arr1[i];
                i++;
            } else {
                result[r] = arr2[j];
                j++;
            }
            r++;
        }
        if (i < arr1.length) {
            System.arraycopy(arr1, i, result, r, (arr1.length - i));
        }
        if (j < arr2.length) {
            System.arraycopy(arr2, j, result, r, (arr2.length - j));
        }
        return result;
    }

    public static void printCrossEl(int[] left, int[] right) {
        for (int l : left) {
            for (int r : right) {
                if (l == r) {
                    System.out.println(r);
                }
            }
        }
    }
}
