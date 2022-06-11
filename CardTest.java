import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.*;

public class CardTest {
    public static void main(String[] args) {
        Card card1 = new Card(1, "Blue", Rank.COMMON);
        Card card2 = new Card(2, "Red", Rank.UNCOMMON);
        Card card3 = new Card(3, "Bluish", Rank.UNIQUE);
        Card card4 = new Card(7, "Redish", Rank.RARE);

        HashSet<Card> set = new HashSet<Card>();
        set.add(card3);
        set.add(card2);
        set.add(card1);
        set.add(card4);

        TreeSet tSet = new TreeSet<Card>();
        tSet.add(card1);
        tSet.add(card2);
        tSet.add(card3);
        tSet.add(card4);

        System.out.println(set);
    }
}