package com.switchfully.deepening.focusedexercises.maps.codelab02;

import org.junit.jupiter.api.Nested;

/**
 * This time you'll need to write the tests yourself!
 *
 * Write the test first based on the specifications
 * Run the test and watch it fail
 * Write the code to make the test succeed
 * Write the next test and repeat
 */
class ExtensibleCalculatorTest {

    private ExtensibleCalculator extensibleCalculator = new ExtensibleCalculator();

    @Nested
    public class Calculate {
        /*
         * TEST 1
         */

        //GIVEN "add" "1" and "3" as parameters

        //WHEN executing "calculate" on the calculator with these parameters

        //THEN will return the correct number 4

        /*
         * TEST 2
         */

        //GIVEN "null" "1" and "3" as parameters

        //WHEN executing "calculate" on the calculator with these parameters

        //THEN will throw an exception "Please provide a function name"

        /*
         * TEST 3
         */

        //GIVEN "foo" "1" and "3" as parameters

        //WHEN executing "calculate" on the calculator with these parameters

        //THEN will throw an exception "foo is not a known function"
    }

    @Nested
    public class AddFunction {
        /*
         * TEST 4
         */

        //GIVEN A Multiply function

        //WHEN executing addFunction with the name "multiply" and the Multiply function

        //THEN executing "calculate" with the parameters "multiply" "2" and "3" will return the correct answer 6

        /*
         * TEST 5
         */

        //GIVEN A function (multiply, divide, difference, square, ...)

        //WHEN executing addFunction with the name "add" and the new function

        //THEN executing "calculate" with the parameters "add" "2" and "3" will execute the new function instead of the Add function

        /*
         * TEST 6
         */

        //GIVEN A function

        //WHEN executing addFunction with a name null and the new function

        //THEN will throw an exception "Please provide a function name"

        /*
         * TEST 7
         */

        //GIVEN

        //WHEN executing addFunction with a name and null as a function

        //THEN will throw an exception "Please provide a correct function"
    }
}
