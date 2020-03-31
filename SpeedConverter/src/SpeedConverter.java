public class SpeedConverter  {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<=0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);

    }

    public static void printConversion(double kiloMetersPerHour){
        long milesPerHour=toMilesPerHour(kiloMetersPerHour);
        if(kiloMetersPerHour>0){
            System.out.println(kiloMetersPerHour+"km/h = "+ milesPerHour + " mi/h.");
        }
        else {
            System.out.println("Invalid Value");
        }
    }


}
