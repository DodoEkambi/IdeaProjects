package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Vehicle vehicle1=new Vehicle(4,"car",false);
            Car car1=new Car(4,"car","Skoda","diesel","automatic",false);
            Model octavia=new Model(4,"car","diesel","dsg",210,7,50,3,10);
            //octavia.getCurrentState();
            octavia.setMoving(false);
            octavia.getCurrentState();

    }
}
