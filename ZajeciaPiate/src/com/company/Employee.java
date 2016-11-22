package com.company;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Kuba on 2016-11-15.
 */
public class Employee {
    private String name;
    private double salary;
    private Date hireDate;

    public Employee(String n , double s, int year , int month , int day){
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year ,
                month-1 , day);
        hireDate = calendar.getTime();
    }
    public String getName(){
        return  name;
    }
    public /*zamiast public mozna wstawic final*/double getSalary(){
        return salary;
    }
    public Date getHireDate(){
        return hireDate;
    }

    public double getBonus() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate +
                ", bonus=" + getBonus() +
                '}';
    }
}
