package com.javarush.task.task21.task2113;

import java.util.*;

/**
 * Created by TRACTEL_RND on 02.07.2017.
 */
public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List hr) {

        horses = hr;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public static void main(String[] args) throws InterruptedException {

        List hrt = new ArrayList();
        game = new Hippodrome(hrt);

        Horse horse1 = new Horse("Anna", 3, 0);
        Horse horse2 = new Horse("Oleg", 3, 0);
        Horse horse3 = new Horse("Zhanna", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {

        for (int i = 0; i < 100; i++) {

            move();
            print();
            Thread.sleep(200);
        }

    }

    public void move() {

        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {

        for (Horse h : horses) {
            h.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }

    }

    public Horse getWinner() {

        TreeMap <Double, Horse> ds = new TreeMap<Double, Horse>();
        for (Horse hr: horses) {
            ds.put(hr.getDistance(),hr);
        }
        Map.Entry<Double, Horse> lastItem = ds.lastEntry();
        return lastItem.getValue();
    }

      public void printWinner(){
        System.out.println("Winner is" +" "+ getWinner().getName()+"!");
    }
    }
