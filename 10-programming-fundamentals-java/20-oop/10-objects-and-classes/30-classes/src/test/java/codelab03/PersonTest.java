package codelab03;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void givenAPositiveAgeInYears_whenCreatingAPerson_thenPersonIsCreated() {
        // GIVEN
        int ageInYears = 18;

        // WHEN
        Person person = new Person(ageInYears);

        // THEN
        Assertions.assertThat(person).isNotNull();
    }

    @Test
    void givenANegativeAgeInYears_whenCreatingAPerson_thenIllegalArgumentExceptionIsThrown() {
        // GIVEN
        int ageInYears = -1;

        // WHEN && THEN
        Assertions.assertThatIllegalArgumentException()
                .isThrownBy(() -> new Person(ageInYears))
                .withMessage("The argument ageInYears must be positive, not " + ageInYears);
    }

    @Test
    void givenAnPersonWithAgeLowerThan13_whenCalculatingAllowance_thenAllowanceIs100() {
        // GIVEN
        Person person = new Person(12);

        // WHEN
        int allowance = person.calculateAllowance();

        // THEN
        Assertions.assertThat(allowance).isEqualTo(100);
    }

    @Test
    void givenAnPersonWithAgeLowerThan18ButHigherThan12_whenCalculatingAllowance_thenAllowanceIsBasedOnItsAgePlusABaseValue() {
        // GIVEN
        Person person = new Person(17);

        // WHEN
        int allowance = person.calculateAllowance();

        // THEN
        Assertions.assertThat(allowance).isEqualTo(125);
    }

    @Test
    void givenAnPersonWithAge18OrHigher_whenCalculatingAllowance_thenAllowanceIs0() {
        // GIVEN
        Person person = new Person(18);

        // WHEN
        int allowance = person.calculateAllowance();

        // THEN
        Assertions.assertThat(allowance).isEqualTo(0);
    }

}
