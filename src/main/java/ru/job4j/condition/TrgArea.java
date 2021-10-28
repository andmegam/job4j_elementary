package ru.job4j.condition;

public class TrgArea {

    /**
     * Метод должен вычислить площадь треугольника.
     *
     * @return Вернуть площадь, если треугольник существует или -1, если
     * треугольника нет.
     */
    public static double area(double a, double b, double c) {
        double rsl = -1;
        double p = TrgArea.semiPerimeter(a, b, c);
        if (TrgArea.existTriangle(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     */
    private static double semiPerimeter(double a, double b, double c) {
        return (a + b + c) * 0.5;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     */
    private static boolean existTriangle(double a, double b, double c) {
        boolean exist = false;
        if (a > 0 && b > 0 && c > 0) {
            if ((a + c > b) && (a + b > c) && (c + b > a)) {
                exist = true;
            }
        }
        return exist;
    }

    public static void main(String[] args) {
        double rsl1 = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl1);

        double rsl2 = TrgArea.area(1, 1, 2);
        System.out.println("area (1, 1, 2) = " + rsl2);
    }
}
