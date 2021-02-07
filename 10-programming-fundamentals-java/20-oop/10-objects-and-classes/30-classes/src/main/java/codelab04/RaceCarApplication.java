package codelab04;

public class RaceCarApplication {

    public static void main(String[] args) {
        RaceCar raceCarDefault = new RaceCar();
        RaceCar raceCarBad = new RaceCar(3, 0);

        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearDown();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);
        raceCarDefault.shiftGearUp();
        System.out.println(raceCarDefault);

        // Will throw an illegalArgumentException (as it should)
        // raceCarDefault.shiftGearUp();

        System.out.println("-----------------");

        raceCarBad.shiftGear(1);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(2);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(3);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(9);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(2);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(1);
        System.out.println(raceCarBad);
        raceCarBad.shiftGear(0);
        System.out.println(raceCarBad);

        // Will throw an illegalArgumentException (as it should)
        // raceCarBad.shiftGear(-1);

    }

}
