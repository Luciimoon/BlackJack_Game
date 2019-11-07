public class Deck {}
public static final int NUMFACES = 13;
public static final int NUMSUITS = 4;
public static final int NUMCARDS = 52;

public static final String SUITS[] = {"CLUBS","SPADES","DIAMONDS","HEARTS"};

private int topCardIndex;
private ArrayList<Card> stackOfCards;

// constructor
public Deck()
        {
        {
        //initialize the instance variables

        //one loop to go through all SUITS
        //one loop to go through all FACES
        //add in each new Card() to the Deck
        }

public int size()  {   return 0;	}

public int numCardsLeft(){
        return 0;
        }

public void shuffle(){
        //add code to shuffle deck – Collections has a shuffle
        }

public Card nextCard(){   return stackOfCards.get(topCardIndex--);  }

public String toString(){
        return stackOfCards + "   topCardIndex = " + topCardIndex;
        }
        }
}