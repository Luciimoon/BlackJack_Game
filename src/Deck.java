
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

        public static ArrayList<Cards> Deck = new ArrayList<Cards>();
        private final int numCards = 52;
        private final  int numRanks = 14;
        private final int numSuits = 4;
        private int dealt = 0;
        Random generate = new Random();

        public Deck() {

                for (int j = 2; j < numRanks; j++) {
                        for (int k = 1; k <= numSuits; k++) {
                                Cards c = new Cards(j, String.valueOf(k));
                                Deck.add(c);
                        }
                }

        }

        public void shuffle(){
                Collections.shuffle(Deck);
        }

        public Cards dealCard(){
                if(dealt == 52){
                        throw new IllegalStateException("No Cards Left In The Deck");
                }
                else{
                        dealt++;
                        return (Deck.get(dealt-1));
                }
        }

        public ArrayList<Cards> getDeck(){
                return Deck;
        }



}