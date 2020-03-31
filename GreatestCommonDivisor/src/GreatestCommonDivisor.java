public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        int minNumber = 0;
        int greatestDivisor=1;
        if (first < 10 || second < 10) {
            return -1;
        } else if (first < second) {
            minNumber = first;
        } else {
            minNumber = second;
        }
        for (int i = 1; i <= minNumber; i++) {
            if (first % i == 0 && second%i == 0) {
               greatestDivisor=i;
            }
        }

        return greatestDivisor;
}
}
