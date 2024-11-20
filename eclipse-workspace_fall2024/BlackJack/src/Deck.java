import java.util.Random;


public class Deck {

	private Card[] cards;

	public Deck() 
	{
		String [] suits = {"Hearts","Spades","Diamonds","Clubs"};
		int[]values= {1,2,3,4,5,6,7,8,9,10,11,12,13};
		
		cards = new Card [suits.length * values.length] ;
		
		int cardIndex = 0;
		
		for(int i = 0; i < suits.length; i++) 
		{
			for (int j = 0; j < values.length; j++) 
			{
				Card c = new Card(suits[i], values[j]);
				cards[cardIndex] = c;
				cardIndex++;
			}
		}
		
	}
	
	public Card randomDeal() 
	{
		Random r = new Random();
		//System.out.println(r.nextInt(52));
		
		int len = getCards().length;
		int select = r.nextInt(len);
		return getCards()[select];
	}
	
	
	public Card [] getCards() 
	{
		return cards;
	}
	
	public String toString() 
	{
		String returnString = "";
		
		for(int i = 0; i < getCards().length; i++) 
		{
			returnString += getCards()[i] + "\n";
		}
		
		return returnString;
	}
	
	
}
