

public class NumberToWords {
    public static   int reverse(int number) {
        int lastDigit;
        int reversed=0;
        if(number<0){
            number=number*-1;
        }
        while(number>0){
            lastDigit=number%10;
            number=(number-lastDigit)/10;
            reversed=(reversed*10)+lastDigit;
        }
            int countZero=getDigitCount(number)-getDigitCount(reversed);
            return  countZero;

        }





    public static int getDigitCount(int number){
        int lsb=0;
        int count=0;
        if(number<0){
            return -1;
        }
        else if(number==0){
            return 1;
        }
        else {

            while (number > 0) {
                lsb = number % 10;
                number = (number - lsb) / 10;
                count++;
            }
            return count;
        }
    }
    public static void numberToWords(int number) {
        int lastDigit = 0;
        int zeroDigit = 0;
        int temp = reverse(number);
        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (temp > 0) {
            int countZero = getDigitCount(number) - 1;
            for (int i = 0; i < countZero; i++) {
                number = number / 10;
            }
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            for (int j = 0; j < countZero; j++) {
                System.out.println("Zero");
            }
        }
    }


      /*  else

        while(temp>0) {
                    lastDigit = temp % 10;
                    temp = (temp - lastDigit) / 10;
                    switch (lastDigit) {
                        case 0:
                            System.out.println("Zero");
                            break;
                        case 1:
                            System.out.println("One");
                            break;
                        case 2:
                            System.out.println("Two");
                            break;
                        case 3:
                            System.out.println("Three");
                            break;
                        case 4:
                            System.out.println("Four");
                            break;
                        case 5:
                            System.out.println("Five");
                            break;
                        case 6:
                            System.out.println("Six");
                            break;
                        case 7:
                            System.out.println("Seven");
                            break;
                        case 8:
                            System.out.println("Eight");
                            break;
                        case 9:
                            System.out.println("Nine");
                            break;
                    }
                }


        }
*/
}



