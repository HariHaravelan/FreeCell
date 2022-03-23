import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Grid {
    private List<Card>[] columns;

    public Grid(List<Card> cards) {
        this.columns = new List[8];
        this.shuffle(cards);
    }

    private void shuffle(List<Card> cards) {
        while (cards.size() > 0) {
            for (int i = 0; cards.size() > 0 && i < columns.length; i++) {
                Card randomCard = cards.remove(new Random().nextInt(cards.size()));
                if (columns[i] == null) {
                    columns[i] = new ArrayList<>();
                }
                columns[i].add(randomCard);
            }
        }
    }

    @Override
    public String toString() {
        int cardCount = 0;
        StringBuilder layOut = new StringBuilder();
        for (int i = 0; i < columns[0].size(); i++) {
            for (int j = 0; j < columns.length && cardCount < 52; j++) {
                layOut.append(columns[j].get(i).toString() + "\t");
                cardCount++;
            }
            layOut.append("\n");
        }
        return layOut.toString();
    }
}
