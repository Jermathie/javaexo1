package advanced.codelab01;

public class FreeAccount extends Account {

    private static final double MAX_FREE_ACCOUNT_WITHDRAW = 100;

    public FreeAccount(double balance, AccountOwner accountOwner) {
        super(balance, accountOwner);
    }

    @Override
    public void withdraw(double amount) {
        if(amount > MAX_FREE_ACCOUNT_WITHDRAW){
            System.out.println("Over max allowed");
            return;
        }
        balance -= amount;
    }
}
