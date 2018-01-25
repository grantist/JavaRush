package com.javarush.task.task26.task2601;

import java.util.*;

/* 
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {

        Integer[] a = {5, 13, 7, 6, 9, 9};
        sort(a);

    }

    public static Integer[] sort(Integer[] array) {

        int len = array.length;
        Arrays.sort(array);

        final int med = len % 2 != 0 ? array[len / 2] : (int) ((array[len / 2] + array[len / 2 - 1]) / 2);

        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Math.abs(o1 - med) - Math.abs(o2 - med);
            }
        };

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list, comp);
        Integer[] rez = list.toArray(new Integer[list.size()]);
        return rez;

    }
}
