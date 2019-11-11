public class BlackJackCard extends Cards {

    // constructors
    public BlackJackCard() {
        super();
    }

    public BlackJackCard(int value, String suit) {
        super(value, suit);
    }

    public int getValue() {

        if (getFace() == 1)
            return 11;
        else if (getFace() >= 10)
            return 10;
        return 0;
    }
}

