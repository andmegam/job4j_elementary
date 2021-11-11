package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;

        if ((word.length < post.length) || post.length == 0) {
            result = false;
        } else {
            for (int i = 0; i < post.length; i++) {
                if (word[word.length - 1 - i] != post[post.length - 1 - i]) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }
}
