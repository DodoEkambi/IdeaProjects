public class NumberPalindrome {
    public static boolean isPalindrome(int number){

        int temp1=number;
        int reverse=0;
        if(temp1<0){
            temp1=temp1*(-1);
        }

        while(temp1>0){
            int lsb=temp1%10;
            reverse=((reverse*10)+lsb);
            temp1=(int)(temp1-lsb)/10;

        }

     if(reverse ==number||reverse ==-number){
         return true;
     }
     else return false;

    }
    public static int reverseNumber(int number){
        int temp1=number;
        int reverse=0;
        if(temp1<0){
            temp1=temp1*(-1);
        }

        while(temp1>0){
            int lsb=temp1%10;
            reverse=((reverse*10)+lsb);
            temp1=(int)(temp1-lsb)/10;

        }
        return reverse;

    }
}
