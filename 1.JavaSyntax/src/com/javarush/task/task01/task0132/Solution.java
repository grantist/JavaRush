package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {

        int n5 = number/100;
        int n6 = number%10;
        int  n4 = (number%100)/10;

        return n5+n4+n6;




    }
}