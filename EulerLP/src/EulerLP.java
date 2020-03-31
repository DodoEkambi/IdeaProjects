public class EulerLP {
    public static long getPrime(long number){

        if (number <= 1) {
            return -1;
        }
        long secondDivider = 1;
        for(long i=2;i<=number;i++){
            if(number%i==0){
                secondDivider=i;
                number/=secondDivider;
            }

        }
        for(long i=2;i<secondDivider;i++)
        {
            if(secondDivider%i==0){
                secondDivider=i;
            }
        }

        return  secondDivider;
    }


}

