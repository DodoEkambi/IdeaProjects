public class Main {
    public static void main(String[] args) {


        System.out.println((float)calcFeetAndInchesInCentimeters(3,14));
        System.out.println(calcFeetAndInchesInCentimeters(12));
        System.out.println(calcFeetAndInchesInCentimeters(11));
        System.out.println(calcFeetAndInchesInCentimeters(-1,-1));
        System.out.println(calcFeetAndInchesInCentimeters(-2));


    }


        public static double calcFeetAndInchesInCentimeters(double feet,double inches)
        {
                if(isValidNumbers(feet,inches)){
                    return (double)((12*2.54*feet)+(inches*2.54));
                }
                else {
                    return -1;
                }
        }
        public static double calcFeetAndInchesInCentimeters(double inches){
                if(inches>=0)
                {
                    return feet= (double)(inches/12);
                    double remainingInches= (int)inches%12;
                    System.out.println(feet+"feet, " + remainingInches);
                }
                else {

                    return -1;}

        }
        public static boolean isValidNumbers(double feet,double inches){
            if(feet>=0||(inches>=0||inches<=12))
            {
                return true;
            }
            else
            { System.out.println("Invalid Data");
                return false;}
        }

}
