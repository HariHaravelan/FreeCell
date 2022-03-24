import java.util.HashMap;
import java.util.Stack;

public class Home {
    private final int MAX_CELLS = 4;
    private HashMap<Suit, Integer> suitToPlacements;
    private Stack<Card>[] homeCells;

    public Home() {
        this.suitToPlacements = new HashMap<>();
        this.homeCells = new Stack[4];
    }


    public boolean addACard(Card card) {
        if (card.getRank().equals(Rank.ACE)) {
            suitToPlacements.put(card.getSuit(), suitToPlacements.size());
            homeCells[suitToPlacements.get(card.getSuit())] = new Stack<>();
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

    @Override
    public String toString() {
        StringBuilder box = new StringBuilder();
        box.append(buildHorizontalBorder());
        box.append("\n");
        box.append(buildContent());
        box.append("\n");
        box.append(buildHorizontalBorder());
        return box.toString();
    }

    private String buildContent() {
        StringBuilder contentBox = new StringBuilder();
        contentBox.append("|");
        for (int index = 0; index < MAX_CELLS; index++) {
            contentBox.append(" ").append(this.homeCells[index] == null ? "E " : this.homeCells[index].peek().toString()).
                    append(" ").append("|");
        }
        return contentBox.toString();
    }

    private String buildHorizontalBorder() {
        StringBuilder border = new StringBuilder();
        border.append("+");
        for (int i = 0; i < MAX_CELLS; i++) {
            border.append("----").append("+");
        }
        return border.toString();
    }
}
