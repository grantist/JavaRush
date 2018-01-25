package com.javarush.task.task29.task2909.car;

import java.util.Date;

abstract public class Car {
    static public final int TRUCK = 0; //константа TRUCK принимает значение 0
    static public final int SEDAN = 1; //константа SEDAN принимает значение 1
    static public final int CABRIOLET = 2; //константа CABRIOLET принимает значение 2


    final int MAX_TRUCK_SPEED = 80;
    final int MAX_SEDAN_SPEED = 120;
    final int MAX_CABRIOLET_SPEED = 90;

    double fuel; // топливо

    public double summerFuelConsumption;
    public double winterFuelConsumption;
    public double winterWarmingUp;

    private int type;

    private boolean driverAvailable;
    private int numberOfPassengers;

    protected Car(int type, int numberOfPassengers) {  // конструктор Сar c двумя параметрами
        this.type = type;
        this.numberOfPassengers = numberOfPassengers;
    }

    protected Car(int numberOfPassengers) {  // конструктор Сar c двумя параметрами
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car create(int type, int numberOfPassengers) {

        if (type==0) {
            return new Truck(numberOfPassengers);
        }
       else if (type==1) {
            return new Sedan(numberOfPassengers);
        }
         else 
            return new Cabriolet(numberOfPassengers);

    }

    public void fill(double numberOfLiters) { // метод заполнения бака автомобиля

            if (numberOfLiters < 0)
                throw new RuntimeException();
                fuel += numberOfLiters;

    }

    public boolean isSummer(Date date , Date summerStart, Date summerEnd) {
        if (date.before(summerStart) || date.after(summerEnd))
            return false;
        else return true;
    }

    public double getWinterConsumption(int length) {
        double consumption;
        consumption = length * winterFuelConsumption + winterWarmingUp;
        return consumption;

    }

    public double getSummerConsumption(int length) {
        double consumption;
        consumption = length * summerFuelConsumption;
        return consumption;
    }

    public double getTripConsumption(Date date, int length, Date SummerStart, Date SummerEnd) { // метод  получает расход топлива
        double consumption;
        if (!isSummer(date,SummerStart,SummerEnd)) {
            consumption=getWinterConsumption(length);
        } else {
            consumption=getSummerConsumption(length);
        }
        return consumption;
    }

    public int getNumberOfPassengersCanBeTransferred() {


        if (!canPassengersBeTransferred())
            return 0;
        return numberOfPassengers;
    }

    private boolean canPassengersBeTransferred() {
        if (isDriverAvailable()&&fuel>0)
            return true;
        else return false;
    }

    public boolean isDriverAvailable() {
        return driverAvailable;
    }

    public void setDriverAvailable(boolean driverAvailable) {
        this.driverAvailable = driverAvailable;
    }

    public void startMoving() {
        if (numberOfPassengers > 0) {
            fastenPassengersBelts();
        } else {
            fastenDriverBelt();
        }
    }

    public void fastenPassengersBelts() {
        fastenDriverBelt();
    }

    public void fastenDriverBelt() {
    }

    public abstract int getMaxSpeed();


}