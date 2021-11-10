package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenN1ThenFact120() {
        int n = 5;
        int expected = 120;
        int rsl = Factorial.calc(n);
        Assert.assertEquals(expected, rsl);

    }
}