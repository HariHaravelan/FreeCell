import org.junit.jupiter.api.Test;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class FreeCellsTest {

    @Test
    public void test() {
        FreeCells freeCells = new FreeCells();
        Card sixClub = new Card(Suit.CLUB, Rank.SIX);
        freeCells.addCard(sixClub);

        System.out.println(freeCells);


    }

    ;

}

