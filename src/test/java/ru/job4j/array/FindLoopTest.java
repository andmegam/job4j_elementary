package ru.job4j.array;

import org.junit.Test;
import org.junit.Assert;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHasHas2ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 10;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5InRangeFrom4To8Then4() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int el = 5;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 45;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas5InRangeFrom4To8ThenMinus1() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int el = 2;
        int start = 4;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }
}