import java.util.Scanner;
public class InputCalculator {
    public static void inputThenPrintSumAndAverage( ){
        Scanner scanner=new Scanner(System.in);
        double average=0;
        double count=0;
        double sum=0;
        boolean first=true;
        while(true){
            boolean isAnInt=scanner.hasNextInt();
            if(isAnInt){
                int number;
                if(first){
                    number=scanner.nextInt();
                    first=false;
                    sum+=number;
                    count++;
                    average=sum;
                }
                else{
                    number=scanner.nextInt();
                    sum+=number;
                    count++;
                    average=sum/count;
                }
            }
            else {
                System.out.println("SUM = "+(int)sum+ " AVG = "+(int)Math.round(average));
                break;}
        }
        scanner.close();
    }
}
