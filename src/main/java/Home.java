import java.util.HashMap;
import java.util.Stack;

public class Home {
    private HashMap<Suit, Integer> suitToPlacements;
    private Stack<Card>[] homeCells;

    public Home() {
        this.suitToPlacements = new HashMap<>();
        this.homeCells = new Stack[4];
    }


    public boolean addACard(Card card) {
        if (card.getRank().equals(Rank.ACE)) {
            suitToPlacements.put(card.getSuit(), suitToPlacements.size());
            homeCells[suitToPlacements.get(card.getSuit())].add(card);
            return true;
        }

        if (!suitToPlacements.containsKey(card.getSuit())) {
            return false;
        }

        Card lastCard = homeCells[suitToPlacements.get(card.getSuit())].peek();
        if (lastCard.getRank().isNextRank(card.getRank())) {
            homeCells[suitToPlacements.get(card.getSuit())].add(card);
            return true;
        }
        return false;
    }

}
