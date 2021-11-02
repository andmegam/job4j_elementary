package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.0001);
    }

    @Test
    public void whenConvert5DollarThen4dot3Euro() {
        float in = 5;
        float expected = 4.3f;
        float out = Converter.dollarToEuro(in);
        Assert.assertEquals(expected, out, 0.0001);
    }

    @Test
    public void whenConvert140RblThen2dot333Dollar() {
        float in = 140;
        float expected = 2.333f;
        float out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.001);
    }

    @Test
    public void whenConvert12EuroThen14dot039Dollar() {
        float in = 12;
        float expected = 14.039f;
        float out = Converter.euroToDollar(in);
        Assert.assertEquals(expected, out, 0.001);
    }

}