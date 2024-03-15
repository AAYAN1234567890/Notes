/*



 * Title: Black Jack

 * Author: Aayan Samdani



 * Date: Friday, March 8



 */


public class Ex5Card {



	private int suit;



	private int value;



	String[] suits = {



			"Diamonds ◆",



			"Clubs ♣",



			"Hearts ♥",



			"Spades ♠",



	};



	String[] values = {



			"BLANK",

			

			"Ace",



			"1",



			"2",



			"3",



			"4",



			"5",



			"6",



			"7",



			"8",



			"9",



			"10",



			"Jack",



			"Queen",



			"King",



	};



	

	//Constructor

	public Ex5Card(int newSuit, int newValue) {



		this.suit = newSuit;

		this.value = newValue;



	}



	// ---Getter---

	/*

	 * Prints out a readable version of the card

	 * @return int

	 */



	public String toString() {



		return values[this.value] + " of " + suits[this.suit];



	}



	/*

	 * Gets the card's value

	 * @return int

	 */

	

	public int getValue() {

		return this.value;

	}





	public static void main(String[] args) {



		Ex5Card card = new Ex5Card (1,1);



		System.out.println(card.suit + ", " + card.value);



		System.out.println(card.toString());



	}







}

