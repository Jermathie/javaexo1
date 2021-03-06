package basic.codelab02;

public class Person {

    private final String fullName;
    private final String email;

    public Person(String fullName, String email) {
        this.fullName = fullName;
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }
}
