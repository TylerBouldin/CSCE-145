import java.util.Scanner;

public class Main {

	//	public static String cardToString(Card c)
	//	{
	//		return c.getValue() + " of " + c.getSuit();
	//	}

	public static void printHand(Card[] hand, int amountOfCards)
	{
		for(int i = 0; i < amountOfCards; i++)
		{
			System.out.println(hand[i]);
		}

		/*
		 * for(int i = 0; i < hand.length; i++)
		 * {
		 * 		if(hand[i] == null)
		 * 			break;
		 * 		System.out.println(hand[i]);
		 * }
		 */
	}
	
	public static int scoreHand(Card[] hand, int amountOfCards)
	{
		int returnVal = 0;
		
		boolean hasAce = false;
		
		for(int i = 0; i < amountOfCards; i++)
		{
			returnVal += hand[i].getValue();
			if(hand[i].getValue() == 1)
				hasAce = true;
		}
		
		if(hasAce && returnVal <= 11)
		{
			returnVal += 10;
		}
		
		return returnVal;
	}

	public static void main(String[] args)
	{
		//TODO List:
		//Welcome the player
		//Show the player their hand
		//Show the player the dealers visible card
		//Ask the user if they want to hit or stay
		//If the user goes over 21, they lose
		//Otherwise, deal cards to the dealer until they are 17 or over
		//If the dealer goes over, they lose
		//If neither lost, compare scores

		System.out.println("Welcome to Blackjack!");

		//Make a new deck object
		Deck d = new Deck();

		//This index is keeping track of where we are putting the next card
		//And it is keeping track of how many cards we have
		int playerIndex = 0;
		Card[] playerHand = new Card[10];
		int dealerIndex = 0;
		Card[] dealerHand = new Card[10];

		//Deal 1 card to the player and dealer
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;

		//Deal another card to the player and dealer
		playerHand[playerIndex] = d.randomDeal();
		playerIndex++;
		dealerHand[dealerIndex] = d.randomDeal();
		dealerIndex++;

		System.out.println("Player Hand: ");
		printHand(playerHand, playerIndex);
		System.out.println();
		System.out.println("Dealer shown card: ");
		System.out.println(dealerHand[dealerIndex-1]);

		Scanner k = new Scanner(System.in);

		do
		{
			System.out.println("Do you want to Hit or Stay? ");
			String input = k.nextLine();

			if(input.toLowerCase().equals("hit"))
			{
				playerHand[playerIndex] = d.randomDeal();
				playerIndex++;
				
				System.out.println("Player hand: ");
				printHand(playerHand, playerIndex);
				
				if(scoreHand(playerHand, playerIndex) > 21)
					break;
				//if player went over 21, break
			}
			else if(input.toLowerCase().equals("stay"))
			{
				break;
			}
		} while(true);
		
		if(scoreHand(playerHand, playerIndex) <= 21)
		{
			while(scoreHand(dealerHand, dealerIndex) < 17)
			{
				dealerHand[dealerIndex] = d.randomDeal();
				dealerIndex++;
			}
			System.out.println("Dealer final hand: ");
			printHand(dealerHand, dealerIndex);
			
			int playerScore = scoreHand(playerHand, playerIndex);
			int dealerScore = scoreHand(dealerHand, dealerIndex);
			
			if(dealerScore > 21)
			{
				System.out.println("Player wins!");
			}
			else if(dealerScore >= playerScore)
			{
				System.out.println("Dealer wins!");
			}
			else
			{
				System.out.println("Player wins!");
			}
		}
		else
		{
			System.out.println("Player lost :(");
		}
	}

}