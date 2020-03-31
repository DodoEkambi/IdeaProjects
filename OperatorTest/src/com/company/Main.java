package com.company;

public class Main {

    public static void main(String[] args) {
    double first=20.00d;
    double second=80.00d;
    double total=(first+second)*100.00d;// 20.00d+80.00d=100.00d; 100.00d*100.00d=10000.00d;
        System.out.println("Total is:"+total);
        double result=total%40.00d;//remainder is 0
        System.out.println("The remainder is:"+result);
        boolean isRemainder=(result==0)?true:false;
        System.out.println(isRemainder);
        if(isRemainder){
            System.out.println(isRemainder);
        }
        else
            System.out.println("Remainder="+result);
    }
}
