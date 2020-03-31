public class DigitSumChallenge {
    public static int sumDigits(int number){
        int sum=0;
        while(number>=10){
            int lsb=(number%10);
            sum=sum+lsb;
            number=(int)(number-lsb)/10;
            if(number<10){
                sum=sum+number;
                return sum;
            }
            continue;


        }
        return -1;
    }
}
