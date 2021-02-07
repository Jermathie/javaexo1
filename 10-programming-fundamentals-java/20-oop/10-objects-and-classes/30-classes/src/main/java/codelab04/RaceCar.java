package codelab04;

public class RaceCar {

    private int numberOfGears;
    private int currentGear;

    public RaceCar() {
        this(6, 0);
    }

    public RaceCar(int numberOfGears, int currentGear) {
        this.numberOfGears = numberOfGears;
        this.currentGear = assertCurrentGearIsValid(currentGear);
    }

    public void shiftGearUp() {
        currentGear = assertCurrentGearIsValid(currentGear + 1);
    }

    public void shiftGearDown() {
        currentGear = assertCurrentGearIsValid(currentGear - 1);
    }

    public void shiftGear(int gear) {
        currentGear = assertCurrentGearIsValid(calculateGearToShiftTo(gear));
    }

    @Override
    public String toString() {
        return "RaceCar with " + numberOfGears + " gears in total, currently in " + currentGear + " gear.";
    }

    /**
     * The argument gear can never be more than 1 gear higher or lower than currentGear
     * @param gear the gear to change to
     * @return  | gear if the gear is +1 or -1 compared to the currentGear
     *          | currentGear if the gear is >+1 or <-1 compared to the currentGear
     */
    private int calculateGearToShiftTo(int gear) {
        return Math.abs(currentGear - gear) > 1 ? currentGear : gear;
    }

    /**
     * Asserts the currentGear is not negative and never bigger than the numberOfGears
     * @param currentGear the current gear
     * @return currentGear
     * @throws IllegalArgumentException if current gear is negative or current gear is bigger than numberOfGears
     */
    private int assertCurrentGearIsValid(int currentGear) {
        if (currentGear < 0) {
            throw new IllegalArgumentException("currentGear can not be negative. It was: " + currentGear);
        }
        if (currentGear > numberOfGears) {
            throw new IllegalArgumentException("currentGear (" + currentGear
                    + ") can not be higher than numberOfGears (" + numberOfGears + ")");
        }
        return currentGear;
    }
}
