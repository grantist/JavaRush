package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;

public class Solution {
    public static void main(String[] args) {

    }
    
    static class MyException extends Error {

    }

    static class MyException2 extends RuntimeException {
    }

    static class MyException3 extends Throwable {
    }

    static class MyException4 extends Exception {
    }
}

