package com.javarush.task.task29.task2909.user;

/**
 * Created by TRACTEL_RND on 15.11.2017.
 */
public class Address {

    private String country;
    private String city;
    private String house;


    public void setCity(String city) {

        this.city = city;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHouse() {

        return house;
    }

    public void setCountry(String country) {


        this.country = country;
    }



    public String getCity() {

        return city;
    }

    public String getCountry() {

        return country;
    }
}
