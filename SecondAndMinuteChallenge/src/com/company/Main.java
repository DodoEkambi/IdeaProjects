package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getDurationString(3569));
        System.out.println(getDurationString(25,61));
        System.out.println(getDurationString(75,59));
        System.out.println(getDurationString(-1,-1) );
    }
    public static String getDurationString(int minutes,int seconds){
        if((minutes < 0)|| (seconds < 0) || (seconds > 59))
        {
            return "Invalid Value";
        }

            int minute1=seconds/60;
            int tempMinute=minutes+minute1;
            int exactMinute=tempMinute%60;
            int hours=(int)tempMinute/60;
            return  hours+" hour " + exactMinute + " minute " + seconds+" second.";

    }
    public static String getDurationString(int seconds){
        if(seconds<0)
        {return "Invalid Value";
        }
         int minute2=seconds/60;
        int remainingSeconds=seconds%60;
        return  getDurationString(minute2,remainingSeconds);


    }
}
