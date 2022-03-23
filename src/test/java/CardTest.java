import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    @Test
    public void shouldReturnTrueWhenCardPlacedOverIsOfPreviousRankAndSameSuit() {
        Card fiveClub = new Card(Suit.CLUB, Rank.FIVE);
        Card fourClub = new Card(Suit.CLUB, Rank.FOUR);

        assertTrue(fiveClub.canPlaceOver(fourClub));
    }

    @Test
    public void shouldReturnFalseWhenCardPlacedOverIsOfPreviousRankAndDifferentSuit() {
        Card fiveClub = new Card(Suit.CLUB, Rank.FIVE);
        Card fourDiamond = new Card(Suit.DIAMOND, Rank.FOUR);

        assertFalse(fiveClub.canPlaceOver(fourDiamond));
    }

    @Test
    public void shouldReturnFalseWhenCardPlacedOverIsNotOfPreviousRankAndSameSuit() {
        Card fiveClub = new Card(Suit.CLUB, Rank.FIVE);
        Card eightClub = new Card(Suit.CLUB, Rank.EIGHT);

        assertFalse(fiveClub.canPlaceOver(eightClub));
    }

    @Test
    public void shouldReturnFalseWhenCardPlacedOverIsNotOfPreviousRankAndDifferentSuit() {
        Card fiveClub = new Card(Suit.CLUB, Rank.FIVE);
        Card twoSpade = new Card(Suit.SPADE, Rank.TWO);

        assertFalse(fiveClub.canPlaceOver(twoSpade));
    }
}