package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {

        boolean result = true;

        if ((word.length < pref.length) || pref.length == 0) {
            result = false;
        } else {
            for (int i = 0; i < pref.length; i++) {
                if (word[i] != pref[i]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
