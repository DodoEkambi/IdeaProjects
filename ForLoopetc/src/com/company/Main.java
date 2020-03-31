package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int sum=0;
        int count=0;
        for(int i=1;i<=1000;i++){
            if(division(i)){
                System.out.println(i);
                sum=sum+i;
                System.out.println("\t"+sum);
                count++;
                if(count==5){
                    break;
                }
            }
        }
        //System.out.println(i);
    }
    public static boolean division(int i){
        if(i%3==0&&i%5==0){

            return true;}

        else return false;
    }
}
