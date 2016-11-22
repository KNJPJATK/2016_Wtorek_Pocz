package com.company;

/**
 * Created by Kuba on 2016-11-15.
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String n, double s, int year, int month,
                   int day) {
        super(n, s, year, month, day);
        bonus = 200.0;

    }
    public void setBonus(double b){
        bonus = b;
    }

    public double getSalary(){
        return super.getSalary();
    }

    @Override
    public double getBonus() {
        return bonus;
    }
}
