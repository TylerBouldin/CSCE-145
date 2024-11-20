
public class Card {
	
	private String suit;
	private int value;
	
	public Card() 
	{
		this.suit = "Spades";
		this.value = 1;
	}
	
	public Card(String s, int v) 
	{
		this.suit = s;
		this.value = v;
	}
	
	
	public String getSuit() 
	{
		return this.suit;
	}
	
	
	public void setSuit(String s) 
	{
		this.suit = s;
	}
	
	public int getValue() 
	{
		return this.value;
	}
	
	
	public void setValue(int v) 
	{
		if (v>0 && v<11) 
		{
			this.value =v;
		}
		else 
		{
			this.value = 1;
		}
		
		
		this.value = v;
	}
	
	public boolean equals(Card c) 
	{
		return c != null && this.suit.equals(c.getSuit()) && this.value == c.getValue();
	
	}
	
	public String toString() 
	{
		return getValue() + " of " + getSuit();
	}
	
	
	
}
