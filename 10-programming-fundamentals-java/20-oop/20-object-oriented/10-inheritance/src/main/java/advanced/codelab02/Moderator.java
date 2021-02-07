package advanced.codelab02;

public class Moderator extends Member {

    private final boolean isTrusted;

    public Moderator(String username, boolean isTrusted) {
        super(username);
        this.isTrusted = isTrusted;
    }

    @Override
    public String signIn() {
        if(isTrusted) {
            super.assignNewLastSignedInOn();
            return "Sup mod " + getUsername() + "!? The last time you signed in was " + getPreviousLastSignedInOn();
        }
        return super.signIn();
    }
}
