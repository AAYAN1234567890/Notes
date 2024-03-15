// Ex7Player

/*
 * Title: Player Class for Blackjack
 * Author: Daniel Dobson
 * Date: March 12, 2024
 */

 import java.util.ArrayList;
 
 public class Ex7Player {
 private ArrayList<Ex5Card> hand = new ArrayList<Ex5Card>();
 private int handValue = 0;
 private boolean hold = false;
 
 // --- Getter ---
 /*
 * The players current hand value
 * @return int
 */
 public int getHandValue() {
 return this.handValue;
 }
 
 /*
 * Is the player holding?
 * @return Boolean
 */
 public boolean isHolding() {
 return this.hold;
 }
 
 // --- Setter ---
 // Sets if the player is holding or not
 public void setHold(Boolean stand) {
 this.hold = stand;
 }
 
 /*
 * Adds a card to the players hand and then recalculates their hand's total value
 * @param card: Card
 */
 public void takeCard(Ex5Card card) {
 // Take card
 this.hand.add(card);
 
 // Update score
 int cardValue;
 int aces = 0;
 this.handValue = 0;
 for (Ex5Card iCard: this.hand) {
 cardValue = iCard.getValue();
 if (cardValue == 11) { // Jack
 cardValue = 10;
 } else if (cardValue == 12) { // Queen
 cardValue = 10;
 } else if (cardValue == 13) { // King
 cardValue = 10;
 } else if (cardValue == 1) { // Ace
 aces++;
 cardValue = 11;
 }
 handValue += cardValue;
 }
 // Did we bust?
 if (handValue > 21) {
 while (aces > 0 && handValue > 21) {
 handValue -= 10;
 aces--; // Changes aces from 11 to 1
 }
 }
 }
 
 // --- Outputs ---
 // Displays all of the cards in the Players hand
 public void showHand() {
 for (Ex5Card card: this.hand) {
 System.out.println(card.toString());
 }
 }
 
 public static void main(String[] args) {
 // code
 
 }
 
 }