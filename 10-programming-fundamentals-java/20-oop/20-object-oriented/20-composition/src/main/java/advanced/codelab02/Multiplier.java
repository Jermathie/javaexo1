package advanced.codelab02;

public enum Multiplier {
    TIMES_1(1),
    TIMES_2(2),
    TIMES_3(3);

    private final int multiplier;

    Multiplier(int multiplier) {
        this.multiplier = multiplier;
    }

    public int getMultiplier() {
        return multiplier;
    }
}
