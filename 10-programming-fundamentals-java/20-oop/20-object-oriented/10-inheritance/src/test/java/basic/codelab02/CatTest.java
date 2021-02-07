package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CatTest {

    @Test
    void givenAnAggressiveCat_whenBuy_thenReturnFalseAsAggressiveCatsAreNotSold() {
        // GIVEN
        Cat cat = new Cat("Jim", 149.99, true, true);

        // WHEN
        boolean isBought = cat.buy(195.50);

        // THEN
        Assertions.assertThat(isBought).isFalse();
    }

    @Test
    void givenANonAggressiveCat_whenBuyingWithEnoughMoney_thenReturnTrue() {
        // GIVEN
        Cat cat = new Cat("Tim", 149.99, true, false);

        // WHEN
        boolean isBought = cat.buy(195.50);

        // THEN
        Assertions.assertThat(isBought).isTrue();
    }
}
