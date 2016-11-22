package com.company;

public class Main {

    public static void main(String[] args) {
	Manager boss = new Manager("Joe Black " , 8000,1982,12,15);
        Employee [] staff = new Employee[3];
        staff[0]=boss;
        staff[1]=new Employee("Jakis Ktos",1200,1962,8,5);
        staff[2]=new Specjalist("Kolejny Ktos",5000,2000,10,30);

        for(Employee e : staff) {
            System.out.printf("%s %.2f\n", e.getName(), e.getBonus());
            e.getClass().getName();
            if (e instanceof Manager) {
                // Coś dla managera
//                Manager m = (Manager) e;
            }
        }
    }
}
