package poker;
public class PokerHandEvaluator {
	
	public static boolean hasPair(Card[] cards) {
	
		for(int count1=0; count1<cards.length-1; count1++)
		{
			
			for( int count2=count1+1; count2<cards.length;count2++)
			{
				if(cards[count2].getValue()==cards[count1].getValue())
				{
					
					return true;
					
				}
			}									
		}
				
		return false;
		
		
	}
	
	public static boolean hasTwoPair(Card[] cards) {
		
		
		int index=0; 
		int pairValue= 0;
		boolean first = false;
		boolean second = false;


		for(int count = 0; count < cards.length; count++)
		{

			if(cards[count].getValue()==cards[index].getValue() && count != index) 
			{

				first = true;
				pairValue = count; 
				index++;
			}
		} 
		
		for(int count = 0; count < cards.length; count++)
		{

			if(cards[count].getValue() == cards[index].getValue() && count != index && pairValue != count) 
			{

				second = true;
				 
				index++;
			}
		}

		
		if(first == true && second == true)
		{
			return true;
		}
		else
		{
			return false; 
		}
		
		
	}
	
	public static boolean hasThreeOfAKind(Card[] cards) 
	{
	
		int first = cards[0].getValue();
		int second = -1;
		int third = -1;
		int numberOfFirstCards = 1;
		int numberOfSecondCards = 0;
		int numberOfThirdCards = 0;
		boolean answer;

		for (int count = 1; count < 5; count++)
		{
			if (first == cards[count].getValue())
			{
				numberOfFirstCards++;
			}
			else if(second == -1)
			{
				second = cards[count].getValue();
				numberOfSecondCards++;
			} 
			else if (second == cards[count].getValue())
			{
				numberOfSecondCards++;
			} 
			else if(third == -1)
			{
				third = cards[count].getValue();
				numberOfThirdCards++;
			}
			else if (third == cards[count].getValue())
			{
				numberOfThirdCards++;
			}
		}

		if (numberOfFirstCards >=3 || numberOfSecondCards >= 3 || numberOfThirdCards >= 3 )
		
		{
			answer=true;
		}
		else
		{
			answer=false;
		}

		return answer;
	}
	
	public static boolean hasStraight(Card [] cards) {

		Card[] card = new Card[5];
		boolean changeCard = true;
		boolean answer;
		
		for( int count =0; count<5; count++)
		{
			card[count] = cards[count];
			
		}
		
		while (changeCard)
		{

			changeCard= false;
			
			for(int count=0;  count < card.length -1; count++)
			
			{

				if (card[count].getValue() < card[count+1].getValue())
				{
					Card temp = card[count];
					card[count] = card[count+1];
					card[count+1] = temp;
					changeCard = true;
				}
			} 
		}
		

		if( (card[0].getValue() - 1 == card[1].getValue() && 
				card[1].getValue() - 1 == card[2].getValue() &&
				card[2].getValue() - 1 == card[3].getValue() &&
				card[3].getValue() - 1 == card[4].getValue())||(card[4].getValue() == 1 &&
				card[3].getValue() == 10 &&
				card[2].getValue() == 11 &&
				card[1].getValue() == 12 &&
				card[0].getValue() == 13))
		
		{
			answer=true;
		}
		
		else
		{
			answer=false;
		}
		
		return answer;


		
	}
	
	public static boolean hasFlush(Card[] cards) {
		
		int index =0;
		
		int card=cards[0].getSuit();
		
		for(int count = 1; count < cards.length; count++)
		
		
		{
			if(card==cards[count].getSuit())
			{
				index++;
			}
			
			if(index==4)
			{
				return true;
			}
			
		}
		
		return false;
	
		
	}
	
	public static boolean hasFullHouse(Card[] cards) {

		int Card1 = cards[0].getValue();
		int Card2 = -1;
		int numfCards = 1;
		int numsCards = 0;
		boolean answer;

		for (int count = 1; count < 5; count++)
		{
			if (Card1 == cards[count].getValue())
			{
				numfCards++;
			} 
			else
			{
				if (Card2 == -1)
				{
					Card2 = cards[count].getValue();
					numsCards++;
				} 
				else if	(Card2 == cards[count].getValue())
				{
					numsCards++;
				}
			}
		}

		if ((numfCards == 3 && numsCards == 2)||(numfCards == 2 && numsCards == 3))
		{
			answer= true;
		} 
		else
		{
			answer=false;
		}
		
		
		
		return answer;
		
		
		
	}
	
	public static boolean hasFourOfAKind(Card[] cards) {
		
		
		int firstCard=cards[0].getValue();
		int secondCard=-1;
		int numberOfFirstCard=1;
		int numberOfSecondCards=0;
		boolean answer;
		
		for(int count=1; count<5; count++)
		{
			if(firstCard==cards[count].getValue())
			{
				numberOfFirstCard++;
			}
			else
			{
				if(secondCard==-1)
				{
					secondCard=cards[count].getValue();
					numberOfSecondCards++;
				}
				else if (secondCard == cards[count].getValue())
				{
					numberOfSecondCards++;
				}
			}
			
		}

		
		if (numberOfFirstCard == 4||numberOfSecondCards == 4)
		{
			answer= true;
		} 
		
		else
		{
			answer= false;
		}

		return answer;
				
		
	}
	
	public static boolean hasStraightFlush(Card[] cards)
	{

		
		if(hasStraight(cards)&&hasFlush(cards))
		{
			return true;
		}
		
		
		return false;
		
		
	}
	
}

