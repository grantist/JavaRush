package com.javarush.task.task10.task1007;

/* 
Задача №7 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        long l = 111_1111_111_110L; //-57
        int x = (byte) 0b1000_1100_1010;//-53
        double m = 110_987_654_6299.123_34;//-1.0
        float f =  l++ + 10 + ++x - (float) m;//-100
        l = (long) f / 1000;
        System.out.println(l);

    }
}