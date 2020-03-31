package com.company;

public class LargestPrime {
    public static long getLargestPrime(long number) {

        if (number <= 1L) {
            return -1L;
        }
        long secondDivider = 1L;
        for(long i=2L;i<=number;i++){
            if(number%i==0L){
                secondDivider=i;
                number/=secondDivider;
            }

        }
        for(long i=2L;i<secondDivider;i++)
        {
            if(secondDivider%i==0L){
                secondDivider=i;
            }
        }

        return  secondDivider;
    }

}
