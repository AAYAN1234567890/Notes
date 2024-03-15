// Ex8 Blackjack



/*

 * Title: Blackjack

 * Author: Daniel Dobson

 * Date, March 13, 2024

 */


 import java.util.Scanner;
 
 
 
 public class Ex8Blackjack {
 
     public Ex7Player player1 = new Ex7Player();
 
     public Ex7Player player2 = new Ex7Player();
 
     public Ex6Deck deck = new Ex6Deck();
 
     public Scanner scanner = new Scanner(System.in); 
 
     
 
     // --- Inputs ---
 
     // Asks the user if they would like to Hit or Stand
 
     public int menu() {
 
         System.out.println("""
 
                 
 
                 Would you like to
 
                 1. Hit
 
                 2. Stand
 
                 """);
 
         return scanner.nextInt();
 
     }
 
     
 
     // --- Processing ---
 
     // Displays a welcome message and sets up any necessary game components
 
     public void setup() {
 
         System.out.println("""
 
                 Welcome to Blackjack!
 
                 Try and get as close to 21 as possible!
 
                 """);
 
         this.deck.shuffle();
 
     }
 
     
 
     /*
 
      * Performs Player 1's turn
 
      * Ideally, player 1 and player 2 would be able to function off of the same function
 
      */
 
     public void player1Turn() {
 
         int choice;
 
         if (!this.player1.isHolding()) {
 
             System.out.println("\nPlayer 1's Turn: ");
 
             this.player1.showHand();
 
             System.out.println("Score: " + this.player1.getHandValue());
 
             choice = menu();
 
             if (choice == 1) {
 
                 this.player1.takeCard(this.deck.drawCard());
 
                 this.player1.showHand();
 
                 System.out.println("Score: " + this.player1.getHandValue());
 
             } else if (choice == 2) {
 
                 this.player1.setHold(true);
 
             }
 
         }
 
     }
 
     
 
     // Performs Player 2's turn
 
     public void player2Turn() {
 
         int choice;
 
         if (!this.player2.isHolding()) {
 
             System.out.println("\nPlayer 2's Turn: ");
 
             this.player2.showHand();
 
             System.out.println("Score: " + this.player2.getHandValue());
 
             choice = menu();
 
             if (choice == 1) {
 
                 this.player2.takeCard(this.deck.drawCard());
 
                 this.player2.showHand();
 
                 System.out.println("Score: " + this.player2.getHandValue());
 
             } else if (choice == 2) {
 
                 this.player2.setHold(true);
 
             }
 
         }
 
     }
 
     
 
     // Runs the main game logic
 
     public void run() {
 
         // Give everyone 2 cards at the start of the round
 
         this.player1.takeCard(this.deck.drawCard());
 
         this.player1.takeCard(this.deck.drawCard());
 
         this.player2.takeCard(this.deck.drawCard());
 
         this.player2.takeCard(this.deck.drawCard());
 
         
 
         // Prints out player values
 
         System.out.println("Player 1's hand: ");
 
         this.player1.showHand();
 
         System.out.println("Score: " + this.player1.getHandValue());
 
         System.out.println("\nPlayer 2's hand: ");
 
         this.player2.showHand();
 
         System.out.println("Score: " + this.player2.getHandValue());
 
         
 
         while (!this.player1.isHolding() || !this.player2.isHolding()) {
 
             player2Turn();
 
             player1Turn();
 
             // Break if one of the players has busted
 
             // Player 1 turn
 
             if (this.player1.getHandValue() > 21 || this.player2.getHandValue() > 21) {
 
                 break;
 
             }
 
         }
 
         gameOver();
 
     }
 
     
 
     // --- Outputs ---
 
     // Determines who wins and prints out a congratulatory message. Does not work if a player busts
 
     public void gameOver() {
 
         if (this.player1.getHandValue() > this.player2.getHandValue()) {
 
             System.out.println("\nPlayer 1 Wins!");
 
         } else if (this.player1.getHandValue() < this.player2.getHandValue()) {
 
             System.out.println("\nPlayer 2 Wins!");
 
         } else {
 
             System.out.println("\nDraw!");
 
         }
 
     }
 
     
 
     public static void main(String[] args) {
 
         Ex8Blackjack game = new Ex8Blackjack();
 
         game.setup();
 
         game.run();
 
 
 
     }
 
 
 
 }
 
 