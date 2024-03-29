/*

 * Title: Farkle Player

 * Author: Aayan Samdani

 * March 5, 2024

 */


import java.util.Scanner;

import java.util.ArrayList;



public class Ex3Player {

	private ArrayList<A_Die> dice = new ArrayList<A_Die>();

	private ArrayList<A_Die> held = new ArrayList<A_Die>();

	private int score = 0;

	private Scanner scanner = new Scanner (System.in);

	

public Ex3Player() {

	for (int i = 0; i < 6; i++) {

		dice.add(new A_Die());

	}

}

	

public void rollDice() {

	for (A_Die die: this.dice) {

		die.rollDie();

	}

}	

	

	public void getDice() {

		for (A_Die die: this.dice) {

			die.display();

		}

	}

	

	public void getHeld() {

		for (A_Die die: this.held) {

			die.display();

		}

		

	}

	

	void holdDice() {

		System.out.println("Select a dice to hold:");

		for (int i = 0; i < this.dice.size(); i++) {

			System.out.println(i+1 + ". " + this.dice.get(i).getDieNum());

		}

		}

	

	int choice = scanner.nextInt() - 1;{

		

	

	this.held.add(this.dice.get(choice));

	this.dice.remove(choice);

	System.out.println("Dice Remaining:");

	this.getDice();

	System.out.println("Dice Held");

	this.getHeld();

	

	System.out.println("Hold more? (y/N)");

	String again= scanner.next();

	if (again.toUpperCase().equals("Y")) {

		this.holdDice();

	}

}

	public void resetDice() {

		this.dice.addAll(held);

		this.held.clear();

	}

	

	public void addScore(int points) {

		this.score += points;

	}

	

	public void printScore() {

		System.out.println("Score: " + this.score);

	}

	

	public int getScore() {

		return this.score;

	}

	

	public int getDiceSize() {

		return this.dice.size();

	}

		

	public static void main(String[] args) {

		Ex3Player Aayan = new Ex3Player();

		Aayan.getDice();

		System.out.println();

		Aayan.holdDice();

		Aayan.resetDice();

		Aayan.rollDice();

		System.out.println("Current Dice: ");

		Aayan.getDice();

		System.out.println("Held Dice: ");

		Aayan.getHeld();

		

		Aayan.addScore(10000);

		Aayan.addScore(450);

		Aayan.printScore();

	}



}