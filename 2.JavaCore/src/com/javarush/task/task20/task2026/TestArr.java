package com.javarush.task.task20.task2026;

/**
 * Created by TRACTEL_RND on 01.04.2017.
 */
public class TestArr {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length; i++) {
                if (a[i][j] == 1 && ((i == 0 && (j == 0 || a[i][j - 1] == 0)) || (a[i - 1][j] == 0 && (j == 0 || a[i][j - 1] == 0)))) {
                    count++;
                }
            }
        }
        return count;
    }
}