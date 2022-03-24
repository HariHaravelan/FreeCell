import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GamePlay {

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }

        Grid grid = new Grid(cards);
        String input = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println(grid);
        while (!input.equalsIgnoreCase("exit")) {
            System.out.println("Enter input: ");
            input = scanner.nextLine();
            System.out.println(input);
        }

    }
}
