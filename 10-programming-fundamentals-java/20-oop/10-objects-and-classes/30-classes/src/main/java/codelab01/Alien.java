package codelab01;

public class Alien {

    private final String firstName;
    private final String lastName;
    private final int numberOfHeads;

    public Alien() {
        this("Unidentified", "Unidentified", 1);
    }

    public Alien(String firstName, String lastName) {
        this(firstName, lastName, 1);
    }

    public Alien(String firstName, String lastName, int numberOfHeads) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfHeads = numberOfHeads;
    }

    String getFullName() {
        return firstName + " " + lastName;
    }

    int getNumberOfHeads() {
        return numberOfHeads;
    }

    @Override
    public String toString() {
        return getFullName() + " with " + getNumberOfHeads() + " head(s)";
    }
}
