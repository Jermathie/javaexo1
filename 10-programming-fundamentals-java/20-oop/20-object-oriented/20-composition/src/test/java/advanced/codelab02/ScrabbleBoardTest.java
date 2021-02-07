package advanced.codelab02;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScrabbleBoardTest {

    private ScrabbleBoard scrabbleBoard = new ScrabbleBoard();

    @Test
    void getSquareAt() {
        Square square = scrabbleBoard.getSquareAt(1,1);

        assertThat(square).isNotNull();
    }

    @Test
    void toStringRepresentaiton() {
        System.out.println(scrabbleBoard.toString());
    }
}
