//Ex4Game.java





/*

 * Title: Farkle Game Class

 * Author: Aayan Samdani

 * Date: March 6, 2024

 */




import java.util.Scanner;



public class ExGame {

	private Ex3Player player1 = new Ex3Player();

	private Ex3Player player2 = new Ex3Player();

	private Scanner scanner = new Scanner (System.in);

	

	public void setup () {

		System.out.println("Welcome to Farkle");

		//Include get player names

		//get victory condition

		//change any other settings

	}

	

	public void run() {

		int turn;

		int points;

		while (this.player1.getScore() < 10000 && this.player2.getScore() <10000) {

			System.out.println("Player 1 Turn");

			turn = 0;

			while (turn < 3 && this.player1.getDiceSize() > 0) {

				this.player1.rollDice();

				this.player1.holdDice();

				turn++;

			}

			System.out.println("Player 1 Points: ");

			points = scanner.nextInt();

			this.player1.addScore(points);

			this.player1.resetDice();

			

			System.out.println("Player 2 Turn");

			turn = 0;

			while (turn < 3 && this.player2.getDiceSize() > 0) {

				this.player2.rollDice();

				this.player2.holdDice();

				turn++;		

			}

			

			System.out.println("Player 2 Points: ");

			points = scanner.nextInt();

			this.player2.addScore(points);

			this.player2.resetDice();

		}

		if(this.player1.getScore() > this.player2.getScore()) {

			System.out.println("Player 1 Wins!");

		} else {

			System.out.println("Player 2 Wins!");

		}

	}



	public static void main(String[] args) {

		ExGame game = new ExGame();

		game.setup();

		game.run();

	}



}