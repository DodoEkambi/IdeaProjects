public class SumOddRange {
    public static boolean isOdd(int i){
        if(i<0){
            return false;
        }
        else if(i%2==1){
            return true;
        }
        else return false;
    }
    public static int sumOdd(int start,int end){
       int sum=0;
        if((start<0)||(end<start)||(end<0)){
            return -1;
        }
        else
            for(int i=start;i<=end;i++){
                if(isOdd(i)){
                    sum+=i;
                }
            }
            return sum;
    }
}
