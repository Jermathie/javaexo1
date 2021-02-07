package codelab03;

public class Person {

    private final int ageInYears;

    public Person(int ageInYears) {
        this.ageInYears = assertAgeInYearsIsPositive(ageInYears);
    }

    /**
     * Asserts that the ageInYears argument if positive
     * @param ageInYears the age in years
     * @return the passed-in ageInYears argument
     * @throws IllegalArgumentException if the ageInYears argument is negative
     */
    private int assertAgeInYearsIsPositive(int ageInYears) {
        if(ageInYears < 0) {
            throw new IllegalArgumentException("The argument ageInYears must be positive, not " + ageInYears);
        }
        return ageInYears;
    }

    public int calculateAllowance() {
        if(ageInYears <= 12) {
            return 100;
        }
        if(ageInYears < 18) {
            return 100 + 5 * (ageInYears - 12);
        }
        return 0;
    }
}
