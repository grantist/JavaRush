package com.javarush.task.task26.task2608;

/* 
Мудрый человек думает раз, прежде чем два раза сказать
*/
public class Solution {
    int var1;
    int var2;
    int var3;
    int var4;

    public Solution(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        int v=0;
        synchronized(new Solution(var1,var2,0,0)) {
            v= var1 + var2;
        };
       return v;
    }

    public  int getSumOfVar3AndVar4() {
        int v = 0;
        synchronized (new Solution(0, 0, var3, var4)) {
            v = var3 + var4;
        }
        ;
        return v;
    }
    public static void main(String[] args) {

    }
}
