public class LastDigitChecker {
    public static boolean hasSameLastDigit(int number1,int number2,int number3){
        if(isValid(number1)&&isValid(number2)&&isValid(number3)){
            int number1fd=number1%10;
            int number2fd=number2%10;
            int number3fd=number3%10;
            if((number1fd==number2fd)||(number1fd==number3fd)||(number2fd==number3fd)){
                return true;
            }
            else {
                return false;}

        }
        else {return false;}
    }
    public static boolean isValid(int number){
        if(number>=10&&number<=1000){
            return true;
        }
        else {
            return false;
        }
    }
}
