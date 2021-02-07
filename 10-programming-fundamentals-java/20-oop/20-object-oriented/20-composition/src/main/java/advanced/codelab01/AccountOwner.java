package advanced.codelab01;

public class AccountOwner {

    private final String firstName;
    private final String lastName;

    public AccountOwner(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("Mr. or Mrs. %s, %s", firstName, lastName);
    }
}
