package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       /* double amount=10000;
        for(int i=2;i<9;i++){
            System.out.println("10.000 at interest "+i+"% interest = " + String.format("%.2f",calculateInterest(amount,i)));
        }
        for(int j=8;j>1;j--){
            System.out.println("\t10.000 at interest "+j+"% interest = " + String.format("%.2f",calculateInterest(amount,j)));
        }*/
        int count=0;
        //System.out.println(isPrime(1));
        for(int i=1;i<100;i++){

            if(isPrime(i)){
                count++;
                System.out.println(i +" "+ isPrime(i)+" "+count);
                if(count==6){
                    break;
                }
            }

            }


        }

   /* public static double calculateInterest(double amount,double interest){
        return (amount*(interest/100));
    }*/



   public static boolean isPrime(int n){
       if (n==1){
           return false;
       }
       for(int i=2;i<=n/2;i++){
           if(n%i==0){
               return false;
           }
       }
       return true;
   }

}
