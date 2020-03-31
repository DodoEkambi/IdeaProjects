package com.company;

public class Main {


    public static void  main(String[] args) {
        // write your code here
       int number = 0;
       int max=-1;

        for (int i = 999; i >= 100; i--) {
            if(max>=i*999){
                break;
            }
            for (int j = 999; j >= 100; j--) {
                number = i * j;
                if (max<number && isPalindrome(number)) {
                        max=number;
                    System.out.println("The max palindrome: "+ max+" the dividend:"+ i+" "+j);
                }

            }

        }
    }


        public static boolean isPalindrome ( int number){
            int temp1=number;
            int reverse=0;



            while(temp1>0){
                int lsb=temp1%10;
                reverse=((reverse*10)+lsb);
                temp1=(int)(temp1-lsb)/10;

            }

            if(reverse ==number){

                return true;
            }
            else return false;
        }

}
