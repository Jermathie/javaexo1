package basic;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ArraysCodelab07Test {

    @Test
    void getWinnerWillReturnTheFirstElementInTheArray() {
        Assertions.assertThat(ArraysCodelab07.getWinner(new String[]{"Quick","Queck","Quack"})).isEqualTo("Quick");
    }

    @Test
    void getWinnerWillReturnNullWhenTheArrayIsEmpty() {
        Assertions.assertThat(ArraysCodelab07.getWinner(new String[]{})).isNull();
    }

    @Test
    void getLoserWillReturnTheLastElementInTheArray() {
        Assertions.assertThat(ArraysCodelab07.getLoser(new String[]{"Quick","Queck","Quack"})).isEqualTo("Quack");
    }

    @Test
    void getLoserWillReturnNullWhenTheArrayIsEmpty() {
        Assertions.assertThat(ArraysCodelab07.getLoser(new String[]{})).isNull();
    }
}
