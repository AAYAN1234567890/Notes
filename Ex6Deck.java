/*



 * Title: Deck class



 * Author: Aayan Samdani



 * Date: Friday, March 8



 */


 import java.util.ArrayList;
 
 
 
 import java.util.Collections;
 
 
 
 //same as import java.util.*; which imports EVERYTHING
 
 
 
 public class Ex6Deck {
 
 
 
     private ArrayList<Ex5Card> deck = new ArrayList<Ex5Card>();
 
 
 
     
 
     //Constructor
 
     public Ex6Deck() {
 
 
 
         for( int i = 0; i < 4; i++) {
 
 
 
             for (int j = 0; j < 14; j++) {
 
 
 
                 this.deck.add(new Ex5Card(i, j));
 
 
 
             }
 
 
 
         }
 
 
 
     }
 
     
 
     // --- Getter ---
 
     /*
 
      * Draws a card, removing it from the deck
 
      * @return object: card
 
      */
 
     public Ex5Card drawCard() {
 
 
 
         Ex5Card temp = this.deck.get(0);
 
 
 
         this.deck.remove(0);
 
 
 
         return temp;
 
 
 
     }
 
     
 
     // --- processing ---
 
     //Shuffles contents of deck
 
     
 
     public void shuffle() {
 
 
 
         Collections.shuffle(this.deck);
 
 
 
     }
 
 
 
     
 
 
 
     
 
 
 
     
 
 
 
     public static void main(String[] args) {
 
 
 
         Ex6Deck deckObj = new Ex6Deck();
 
 
 
         deckObj.shuffle();
 
         //for (Ex5Card card: deckObj.deck) {
 
         //	System.out.println(card.toString());
 
         //}
 
 
 
         Ex5Card test = deckObj.drawCard();
 
         System.out.println(test.toString());
 
         System.out.println(test.getValue());
 
 
 
 
 
     }
 
 
 
 
 
 
 
 }