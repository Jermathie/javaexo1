package advanced.codelab02;

public class MemberApplication {

    public static void main(String[] args) {
        Member memberDave = new Member("Dave");
        Member memberDaveFree = new FreeMember("DaveFree");
        Member memberModerator = new Moderator("DaveMod", true);
        Member memberModeratorUntrusted = new Moderator("JessyMod", false);
        Member memberPaying = new PayingMember("Rich Dave");

        System.out.println(memberDave.signIn());
        System.out.println(memberDaveFree.signIn());
        System.out.println(memberModerator.signIn());
        System.out.println(memberModeratorUntrusted.signIn());
        System.out.println(memberPaying.signIn());
    }

}
