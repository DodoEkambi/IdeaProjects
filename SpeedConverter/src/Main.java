public class Main {

    public static void main(String[] args) {
        long miles=SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles:"+miles);
        SpeedConverter.printConversion(12);
        SpeedConverter.printConversion(0);
        SpeedConverter.printConversion(-50);
    }
}
