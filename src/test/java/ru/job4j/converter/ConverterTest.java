package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {
    /**
     * Точность сравнения
     */
    private float eps = 0.0001f;

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert5DollarThen4Euro() {
        float in = 5;
        float expected = 4.3f;
        float out = Converter.dollarToEuro(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert140RblThen2Dollar() {
        float in = 140;
        float expected = (float) 2.3333333;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert12EuroThen14Dollar() {
        float in = 12;
        float expected = (float) 14.039999;
        float out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out, eps);
    }

}