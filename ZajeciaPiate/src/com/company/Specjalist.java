package com.company;

/**
 * Created by Kuba on 2016-11-15.
 */
public class Specjalist extends Employee {
    public Specjalist(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
    }

    @Override
    public double getBonus() {
        return getSalary() * 0.01;
    }
}
