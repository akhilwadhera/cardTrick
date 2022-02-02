package cardgame;
/**
 *
 * @author Akhil Wadhera
 */
public class Card {
    private String suit; //clubs, spades, diamonds, hearts
    private int value;//1-13

    public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    printfo(){
    System.out.println("My name is Akhil wadhera and i am from India. I like to watch anime and listen to songs in my spare time.")
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit='" + suit + '\'' +
                ", value=" + value +
                '}';
    }
}
