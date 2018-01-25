package com.javarush.task.task29.task2909.car;

/**
 * Created by TRACTEL_RND on 13.11.2017.
 */
public class Cabriolet extends Car {


    public Cabriolet(int numberOfPassengers) {
        super(numberOfPassengers);
    }

    @Override
    public int getMaxSpeed() {

        return MAX_CABRIOLET_SPEED;
    }
}
