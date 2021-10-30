package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return (ab > 0 && ac > 0 && bc > 0) && (ab + bc > ac) && (ab + ac > bc) && (bc + ac > ab);
    }
}
