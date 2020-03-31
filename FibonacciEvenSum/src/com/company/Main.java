package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        int fark=1;

        for(int i=2;i<4000000;){
            if(i%2==0){
                sum+=i;

            }
            fark=i-fark;
            i+=fark;

        }
        System.out.println(sum);
    }
}
