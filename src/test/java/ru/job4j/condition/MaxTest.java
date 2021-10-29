package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenLeft10Right20ThenMax20() {
        int left = 10;
        int right = 20;
        int expected = 20;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeft200Right10ThenMax200() {
        int left = 200;
        int right = 10;
        int expected = 200;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenLeft50Right50ThenMax50() {
        int left = 50;
        int right = 50;
        int expected = 50;
        int rsl = Max.max(left, right);
        Assert.assertEquals(expected, rsl);
    }

}