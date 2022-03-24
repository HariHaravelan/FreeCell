import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {


    @Test
    public void add() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        Home home = new Home();
        Card aceClub = new Card(Suit.CLUB, Rank.ACE);
        Card twoClub = new Card(Suit.CLUB, Rank.TWO);
        home.addACard(aceClub);
        home.addACard(twoClub);

        FreeCells freeCells = new FreeCells();
        Card sixClub = new Card(Suit.CLUB, Rank.SIX);
        freeCells.addCard(sixClub);

        Board board = new Board(freeCells, home, new Grid(cards));
        System.out.println(board);
    }

}