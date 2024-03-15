//Ex2Dice.java





/*

 * Title: A simple Dice Class

 * Author: Aayan Samdani

 * Date: March 4, 2024

 */



import java.util.Scanner;

import java.util.Random;

public class A_Die {

	private int DIE_MAX = 6;

	private int DIE_Num;

	Random rand = new Random ();

	

	public A_Die() {

		this.rollDie();

	}



	public A_Die(int SIZE) {

		this.DIE_MAX = SIZE;

		this.rollDie();

	}

	

	public void display() {

		System.out.println(this.DIE_Num);

	}

	

	public void rollDie() {

		this.DIE_Num = rand.nextInt(this.DIE_MAX) + 1;

	}

	

	public boolean getEven() {

		if (this.DIE_Num % 2 == 0) {

			return true;

		} else {

			return false;

		}

	}

	

	public int getDieNum() {

		return this.DIE_Num;

	}

	

	public static void main(String[] args) {

		A_Die die1 = new A_Die();

		A_Die die2 = new A_Die(20);		

		

		//die1.display();

		//die2.display();

			

		Scanner scanner = new Scanner (System.in);

		int score = 0;

		

		System.out.println("""

				Welcome to Dice Roll!

				Get points by correctly choosing both odd, both even, or odd and even

				Lose points of you're wrong.

				""");

		

		while (true) {

			System.out.println("""

					1. Guess dice will be odd

					2. Guess dice will be even

					3. Guess one die odd, one die even

					""");

		

		int choice = scanner.nextInt();

		

		die1.rollDie();

		die2.rollDie();

		

		int result;

		if (die1.getEven() && die2.getEven()) {

			result = 2;

		} else if (!die1.getEven() && !die2.getEven()) {

			result = 1;

		} else {

			result = 3;

		}

		

		if (choice == result) {

			score += 10;

			System.out.println("Right On!");

		} 	else {

			score -= 5;

			System.out.println("Better luck next time.");



		}

		

		System.out.println("Score: " + score);

		scanner.close();

	}

	

}

}