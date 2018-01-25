package com.javarush.task.task29.task2909.user;

public class User {
    private String name;
    private String surname;
    private int age;
    private Address address;

    private Work work;

    private boolean man;

    public void setMan(boolean man) {
        this.man = man;
    }

    public boolean isMan() {

        return man;
    }

    public User(String name, String surname, int age) { //конструктор
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User(String name, String surname) { //конструктор
        this.name = name;
        this.surname = surname;

    }

    public String getBoss()
    {
       return work.getBoss();
    }
    public void printInfo(){
        System.out.println("Имя: " +new User(name,surname,age).getName());
        System.out.println("Фамилия: " + new User(name, surname,age).getSurname());

    }

    public void printAdditionalInfo() {
        if (new User(name, surname,age).getAge()<16)
            System.out.println("Пользователь моложе 16 лет");
        else
            System.out.println("Пользователь старше 16 лет");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return address.getCountry();
    }

    public void setCountry(String country) {
        address.setCountry(country);
    }

    public String getCity() {
        return address.getCity();
    }

    public void setCity(String city) {address.setCity(city);
    }

    public String getAddress() {
        return address.getCountry() + " " + address.getCity() + " " + address.getHouse();
    }

    public Work getWork() {
        return work;
    }

    public void setWork(Work work) {
        this.work = work;
    }
}