package advanced.codelab02;

import java.time.LocalDate;

public class Member {

    private final String username;
    private LocalDate lastSignedInOn;
    private LocalDate previousLastSignedInOn;

    public Member(String username) {
        this.username = username;
        this.lastSignedInOn = LocalDate.now();
        this.previousLastSignedInOn = this.lastSignedInOn;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getPreviousLastSignedInOn() {
        return previousLastSignedInOn;
    }

    public String signIn() {
        assignNewLastSignedInOn();
        return prepareSignInMessage();
    }

    /**
     * Sets the previouslyLastSignedInOn LocalDate to lastSignedInOn
     * Sets the lastSignedInOn LocalDate to now().
     */
    protected void assignNewLastSignedInOn() {
        previousLastSignedInOn = lastSignedInOn;
        lastSignedInOn = LocalDate.now();
    }

    protected String prepareSignInMessage() {
        return "Welcome " + getUsername() + ", the last time you signed in was " + getPreviousLastSignedInOn();
    }
}
