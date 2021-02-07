package basic.codelab02;

public class Pet {

    private final String name;
    private final double priceInEuro;
    private final boolean isHealthy;

    public Pet(String name, double priceInEuro, boolean isHealthy) {
        this.name = name;
        this.priceInEuro = priceInEuro;
        this.isHealthy = isHealthy;
    }

    public boolean buy(double offeredMoneyInEuro) {
        return offeredMoneyInEuro >= priceInEuro && isHealthy();
    }

    public String getName() {
        return name;
    }

    public double getPriceInEuro() {
        return priceInEuro;
    }

    public boolean isHealthy() {
        return isHealthy;
    }
}
