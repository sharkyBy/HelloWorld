package com.javacourse.se.lesson7;

public class Main {
    // The main method to start the execution of the entire program.
    //This method (keyword - void) don't return a value
    public static void main(String[] args) {
        /*First option to declare an object and assign a value to a variable
        //Declare an object 'ourBus'
        Bus ourBus;
        Bus firstBus;
        Bus secondBus;

        //Variable initialization (create variable 'new Bus()') 'ourBus'
        //new - keyword, Bus() - class constructor
        ourBus=new Bus();
        firstBus=new Bus();
        secondBus=new Bus();*/

        //Second option to declare an object and assign a value to a variable
        Bus ourBus = new Bus();
        Bus firstBus = new Bus();
        Bus secondBus = new Bus();

        //First option
        //Assign a value to a variable 'color' of the class 'Bus' for objects ourBus, firstBus, secondBus
        ourBus.color = "Green";
        firstBus.color = "Red";
        secondBus.color = "Gray";

        //Print the specified 'color' method 'showColor' of the class 'Bus'
        ourBus.showColor();
        firstBus.showColor();
        secondBus.showColor();

        //Second option
        //Assign a value to a variable 'model' of the class 'Bus' for objects ourBus, firstBus, secondBus
        ourBus.model = "Mercedes";
        firstBus.model = "Man";
        secondBus.model = "Neoplan";

        //Print the specified 'model' method 'showModel' of the class 'Bus'
        ourBus.showModel();
        firstBus.showModel();
        secondBus.showModel();

        //Third option
        //Print the specified 'model' and 'color method 'showBusProperties' of the class 'Bus'
        ourBus.showBusProperties();
        firstBus.showBusProperties();
        secondBus.showBusProperties();
    }
}