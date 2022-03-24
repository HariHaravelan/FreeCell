import java.util.ArrayList;
import java.util.List;

public class FreeCells {
    private final int MAX_CELLS = 4;
    private List<Card> cells;

    public FreeCells() {
        this.cells = new ArrayList<>();
    }

    public boolean addCard(Card card) {
        if (cells.size() < MAX_CELLS) {
            return this.cells.add(card);
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
            contentBox.append(" ").append(index < this.cells.size() ? this.cells.get(index).toString() : "E ").append(" ").append("|");
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
