public class SharedDigit {
    public static boolean hasSharedDigit(int number1,int number2){
        int number1fd=0;
        int number1sd=0;
        int number2fd=0;
        int number2sd=0;
        if((number1>=10&&number1<=99)&&(number2>=10&&number2<=99)){
            number1fd=number1%10;
            number1sd=number1/10;
            number2fd=number2%10;
            number2sd=number2/10;
            if((number1fd==number2fd)||(number1fd==number2sd)||(number1sd==number2fd)||(number1sd==number2sd)){
                return true;
            }
            else {
                return false;
            }


        }
        else {return false;}

    }
}
