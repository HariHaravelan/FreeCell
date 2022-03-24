public class Board {
    private FreeCells freeCells;
    private Home home;
    private Grid grid;

    public Board(FreeCells freeCells, Home home, Grid grid) {
        this.freeCells = freeCells;
        this.home = home;
        this.grid = grid;
    }

    @Override
    public String toString() {
        StringBuilder boardLayout = new StringBuilder();
        boardLayout.append(freeCells.toString()).append("\n").append(home.toString());
        boardLayout.append("\n");
        boardLayout.append(grid.toString());
        return boardLayout.toString();
    }
}
