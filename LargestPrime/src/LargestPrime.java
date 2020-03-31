public class LargestPrime {
    public static int getLargestPrime(int number) {
        int divider = 0;
        if (number <= 1) {
            return -1;
        }
        int secondDivider = 1;
        for(int i=2;i<=number;i++){
            if(number%i==0){
                divider=secondDivider;
                secondDivider=i;
                number/=secondDivider;
            }

        }
        for(int i=2;i<secondDivider;i++)
        {
            if(secondDivider%i==0){
                secondDivider=i;
            }
        }

        return  secondDivider;
    }
}
