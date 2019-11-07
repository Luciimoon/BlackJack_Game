

public class Cards {
    public static final String FACES[] = {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT",
            "NINE", "TEN", "JACK", "QUEEN", "KING" };
    public static final String SUITS[] = { "SPADES", "DIAMONDS", "HEARTS", "CLUBS"};

    private String suit;
    private int face;

    public Cards(int f, String s) {
        suit = s;
        face = f;
    }

    public Cards() {

    }


    public void setFace(int f) {
        face = f;
    }

    // add more set methods
    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getSuit() {
        return suit;
    }

    public int getFace() {
        return face;
    }

    public int getValue() {
        return 0;
    }


    //equals method



        public String toString()
        {
            return FACES[face] + " of " + getSuit() + " | value = " + getValue();
        }
    }





