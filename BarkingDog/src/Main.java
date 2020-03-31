public class Main {
    public static void main(String[] args) {
        boolean barking=true;
       // BarkingDog.shouldWakeUp(barking,23);
        System.out.println(BarkingDog.shouldWakeUp(barking,23));
        System.out.println(BarkingDog.shouldWakeUp(barking,7));
        System.out.println(BarkingDog.shouldWakeUp(barking,-3));
        System.out.println(BarkingDog.shouldWakeUp(barking,8));
        System.out.println(BarkingDog.shouldWakeUp(barking,22));
        System.out.println(BarkingDog.shouldWakeUp(!barking,-5));
    }
}
