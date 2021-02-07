package basic.codelab02;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PetTest {

    @Test
    void givenAPet_whenBuyWithEnoughMoney_thenReturnTrue() {
        // GIVEN
        Pet pet = new Pet("Jim", 49.99, true);

        // WHEN
        boolean isBought = pet.buy(50);

        // THEN
        Assertions.assertThat(isBought).isTrue();
    }

    @Test
    void givenAPet_whenBuyWithNOTEnoughMoney_thenReturnFalse() {
        // GIVEN
        Pet pet = new Pet("Jim", 49.99, true);

        // WHEN
        boolean isBought = pet.buy(45);

        // THEN
        Assertions.assertThat(isBought).isFalse();
    }



}
