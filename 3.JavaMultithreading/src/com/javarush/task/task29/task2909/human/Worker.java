package com.javarush.task.task29.task2909.human;

public class Worker extends Human {

    private double salary; //зарплата

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {

        return company;
    }

    private String company; // название компании


    public Worker(String name, int age) {
       super(name,age);
    }
    
    public double getSalary() {
        return salary;
    } //получаем зарплату

    public void setSalary(double salary) {
        this.salary = salary;
    } //устанавливаем зарплату
}