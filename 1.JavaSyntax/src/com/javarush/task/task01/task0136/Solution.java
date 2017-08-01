package com.javarush.task.task01.task0136;

import java.util.*;

/* 
Да хоть на Луну!
*/

        public class Solution {
            public static void main(String[] args) {
                System.out.println(getCountSecondsPassedInCurrentHour(12345));
            }

            public static int getCountSecondsPassedInCurrentHour(int seconds) {

                double res = (double)seconds/3600;

                int res2 = (int)res;

                double res3 = (res-res2)*3600;

                return (int)res3;
            }
        }