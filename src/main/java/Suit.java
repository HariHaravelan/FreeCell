public enum Suit {
    SPADE('♠'), DIAMOND('♦'), CLUB('♣'), HEART('♥');

    private final char symbol;
    Suit(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return String.valueOf(this.symbol);
    }
}
