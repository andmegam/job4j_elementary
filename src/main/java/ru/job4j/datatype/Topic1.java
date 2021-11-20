package ru.job4j.datatype;

public class Topic1 {

    public static void main(String[] args) {
        byte age = 37;
        char sex = 'М';
        float height = 1.7f;
        short bricksCount = 15000;
        long bacteriaCount = 10000000L;
        double distanceToSpace = 10000000.5D;
        boolean permissionWork = true;
        long fileSize = 1772400L;
        System.out.println("Возраст age (byte) = " + age);
        System.out.println("Пол sex (char) = " + sex);
        System.out.println("Рост (в метрах) height (float) = " + height);
        System.out.println("Кол-во кирпичей bricksCount (short) = " + bricksCount);
        System.out.println("Кол-во бактерий  bacteriaCount (long) = " + bacteriaCount);
        System.out.println("Расстояние до космических объектов (double) = " + distanceToSpace);
        System.out.println("Разрешение на работу (boolean) = " + permissionWork);
        System.out.println("Размер файла (long) = " + fileSize);

    }
}
