public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;
        int lastDigit = 0;

        if (number < 0) {
            return -1;
        } else if (number >= 0 && number < 10)
                {
                    return sum = number + number;
                }
        else if (number>=10){

                lastDigit=number%10;
                sum+=lastDigit;
                while(number>=10){
                    number/=10; }
                sum+=number;

        }
        return sum;
        }
    }















