package com.javacourse.se.lesson7;

public class Bus {
    //Declare variables
    public String model;
    public String color;
    //Creating a  method 'showColor' in the body of the class 'Bus'
    public void showColor(){
        System.out.println("Bus colors:");
        System.out.println("   - "+color);
    }

    //Creating a method 'showModel' in the body of the class 'Bus'
    public void showModel(){
        System.out.println("Bus model:");
        System.out.println("   - "+model);

    }

    //And you can: create a method, combine different variables in the method, transfer the method to the "main" class
    public void showBusProperties(){
        System.out.println("Bus model: - "+model+"; bus color: - "+color);
    }
}
