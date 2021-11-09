package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SwitchWeekTest {

    @Test
    public void nameOfDay1() {
        int day = 1;
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay2() {
        int day = 2;
        String expected = "Вторник";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay3() {
        int day = 3;
        String expected = "Среда";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay4() {
        int day = 4;
        String expected = "Четверг";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay5() {
        int day = 5;
        String expected = "Пятница";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay6() {
        int day = 6;
        String expected = "Суббота";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay7() {
        int day = 7;
        String expected = "Воскресенье";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void nameOfDay8() {
        int day = 8;
        String expected = "Ошибка";
        String out = SwitchWeek.nameOfDay(day);
        Assert.assertEquals(expected, out);
    }
}