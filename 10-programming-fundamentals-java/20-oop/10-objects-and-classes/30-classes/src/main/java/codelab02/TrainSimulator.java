package codelab02;

public class TrainSimulator {

    public static void main(String[] args) {
        RailroadCar defaultRailroadCar = new RailroadCar("AB550");
        RailroadCar premiumRailroadCar = new RailroadCar("CD888", 150, true, true);

        System.out.println(defaultRailroadCar);
        System.out.println("-------------------");
        System.out.println(premiumRailroadCar);
        System.out.println("-------------------");

        premiumRailroadCar.isFirstClass(false);
        System.out.println("Is first-class (should be false): " + premiumRailroadCar.isFirstClass());

        premiumRailroadCar.toggleHasToilet();
        System.out.println("Has toilet (should be false): " + premiumRailroadCar.hasToilet());

    }

}
