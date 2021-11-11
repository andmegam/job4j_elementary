package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort2() {
        int[] data = new int[]{2, 1, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{0, 1, 2};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3() {
        int[] data = new int[]{2, 1, -5, -3, 0};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-5, -3, 0, 1, 2};
        Assert.assertArrayEquals(expected, result);
    }
}