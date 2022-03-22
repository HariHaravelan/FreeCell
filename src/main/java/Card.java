public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public boolean canPlaceOver(Card card) {
        return this.suit.equals(card.suit) && (this.rank.isPrevRank(card.rank));
    }

    @Override
    public String toString() {
        return this.rank.toString() + this.suit.toString();
    }
}
