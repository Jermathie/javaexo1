package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysCodelab04Test {


    @Test
    void plusOneWillReturnTheGivenNumberPlusOne() {
        Assertions.assertThat(ArraysCodelab04.plusOne(4)).isEqualTo(5);
    }

    @Test
    void firstElementPlusOneWillReturnTheNumberAtIndex1PlusOne() {
        Assertions.assertThat(ArraysCodelab04.firstElementPlusOne(new int[]{5,78,56,3165,45})).isEqualTo(6);
    }

    @Test
    void elementAtIndexPlusOneWillReturnTheNumberAtIndex1PlusOne() {
        Assertions.assertThat(ArraysCodelab04.elementAtIndexPlusOne(4, new int[]{5,78,56,3165,45})).isEqualTo(46);
    }

    @Test
    void elementAtIndexPlusOneWillReturnZeroWhenIndexIsNegative() {
        Assertions.assertThat(ArraysCodelab04.elementAtIndexPlusOne(-1, new int[]{5,78,56,3165,45})).isEqualTo(0);
    }

    @Test
    void elementAtIndexPlusOneWillReturnZeroWhenIndexIsBiggerThanArraySize() {
        Assertions.assertThat(ArraysCodelab04.elementAtIndexPlusOne(10, new int[]{5,78,56,3165,45})).isEqualTo(0);
    }
}
