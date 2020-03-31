package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString="This is a string";
        System.out.println("My string is: " + myString);
        myString=myString+" and this is more.";
        System.out.println("My string is: " + myString);
        myString=myString+"\u00A9 2020";
        System.out.println("My string is: " + myString);
        String myNumberString="250.55";
        myNumberString=myNumberString+"49.55";
        System.out.println("My Number string is :"+ myNumberString);
        String lastString="10";
        int myInt=50;
        lastString=lastString+myInt;
        System.out.println("My last String is: "+lastString);
        double  doubleNumber=120.47d;
        lastString=lastString+doubleNumber;
        System.out.println("My actual last string: "+lastString);
    }
}
