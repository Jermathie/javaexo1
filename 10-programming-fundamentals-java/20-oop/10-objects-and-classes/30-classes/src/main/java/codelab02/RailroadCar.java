package codelab02;

public class RailroadCar {

    private final String serialNumber;
    private final int numberOfSeats;

    private boolean hasToilet;
    private boolean isFirstClass;

    public RailroadCar(String serialNumber) {
        this(serialNumber, 100, false, false);
    }

    public RailroadCar(String serialNumber, int numberOfSeats, boolean hasToilet, boolean isFirstClass) {
        this.serialNumber = serialNumber;
        this.numberOfSeats = numberOfSeats;
        this.hasToilet = hasToilet;
        this.isFirstClass = isFirstClass;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public boolean hasToilet() {
        return hasToilet;
    }

    public boolean isFirstClass() {
        return isFirstClass;
    }

    public void isFirstClass(boolean isFirstClass) {
        this.isFirstClass = isFirstClass;
    }

    public void toggleHasToilet() {
        this.hasToilet = !hasToilet;
    }

    @Override
    public String toString() {
        return String.format("RailroadCar %s: Number of seats: %s - First class: %s - Has a toilet: %s",
                getSerialNumber(), getNumberOfSeats(), isFirstClass(), hasToilet());
    }
}
