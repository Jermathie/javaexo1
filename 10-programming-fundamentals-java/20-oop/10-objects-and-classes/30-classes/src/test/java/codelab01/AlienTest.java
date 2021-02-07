package codelab01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlienTest {

    @Test
    void givenAlienWithFirstNameAndLastName_whenGetFullName_thenReturnConcatenationOfBothFirstNameAndLastName() {
        // GIVEN
        Alien alien = new Alien("Jimmy", "Slim");

        // WHEN
        String actualFullName = alien.getFullName();

        // THEN
        Assertions.assertEquals("Jimmy Slim", actualFullName);
    }
}
