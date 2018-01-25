package com.javarush.task.task30.task3008;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by TRACTEL_RND on 22.01.2018.
 */
public class ConsoleHelper {

    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message) {

        System.out.println(message);
    }

    public static String readString() {

        String str = "";
        try {
            str = br.readLine();
        }
        catch (IOException e) {
            System.out.println("Произошла ошибка при попытке ввода текста. Попробуйте еще раз.");
            return readString();
        }

        return str;
    }

    public static int readInt() {

        int num=0;
        try {
            num = Integer.parseInt(readString());

        } catch (NumberFormatException e) {
            System.out.println("Произошла ошибкапри попытке ввода числа. Попробуйте еще раз.");
            return readInt();
        }
        return num;
    }

}

