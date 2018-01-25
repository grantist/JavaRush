package com.javarush.task.task25.task2506;

import sun.awt.windows.ThemeReader;

/**
 * Created by TRACTEL_RND on 12.10.2017.
 */
public class LoggingStateThread extends Thread {
    Thread t= new Thread();
    public LoggingStateThread(Thread tar) {
        this.t=tar;

    }

    @Override
    public void run() {
        Thread.State currentState = t.getState();
        System.out.println(currentState);
        super.run();
        while (!currentState.equals(State.TERMINATED)) {
            Thread.State newState = t.getState();
            if (!newState.equals(currentState)) {
                System.out.println(newState);
                currentState = newState;
            }
        }
        this.interrupt();
    }
    }

