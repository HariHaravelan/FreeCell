import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HomeTest {

    @Test
    public void test() {
        Home home = new Home();
        Card aceClub = new Card(Suit.CLUB, Rank.ACE);
        Card twoClub = new Card(Suit.CLUB, Rank.TWO);
        home.addACard(aceClub);
        home.addACard(twoClub);

        System.out.println(home);
    }

}