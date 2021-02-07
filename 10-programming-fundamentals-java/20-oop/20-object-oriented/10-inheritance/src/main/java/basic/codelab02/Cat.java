package basic.codelab02;

public class Cat extends Pet {

    private final boolean isAggressive;

    public Cat(String name, double priceInEuro, boolean isHealthy, boolean isAggressive) {
        super(name, priceInEuro, isHealthy);
        this.isAggressive = isAggressive;
    }

    @Override
    public boolean buy(double offeredMoneyInEuro) {
        if(!isAggressive) {
            return super.buy(offeredMoneyInEuro);
        } return false;
    }
}
