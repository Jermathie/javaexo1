package advanced.codelab02;

public class PayingMember extends Member {

    public PayingMember(String username) {
        super(username);
    }

    @Override
    protected String prepareSignInMessage() {
        return "Dear honorary " + getUsername() + ", welcome! The last time you signed in was "
                + getPreviousLastSignedInOn();
    }
}
