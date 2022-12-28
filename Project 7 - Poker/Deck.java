package poker;

public class Deck {

	private Card[] cards;

	public Deck() {
		
		cards = new Card[52]; 
		 
        int index = 0;
        
        
        for (int count1 = 0; count1 <= 3; count1++)
        {
            for (int count2 = 1; count2 <= 13; count2++, index++)
            {
            	            	
                cards[index] = new Card(count2, count1);               
                
            }
        }
		
	}
	
	public Deck(Deck other) {
			        
	    cards=new Card[other.getNumCards()];
	        
	        for (int count = 0; count <cards.length; count++)
	        {
	            cards[count]=other.getCardAt(count);
	        }
	        
	     
		
	}

	public Card getCardAt(int position) 
	{
	
	
		return cards[position];
		
	}

	public int getNumCards() {
				
		
		return cards.length;
				
		
	}

	public void shuffle() {
		
		
		Card[] upper;	    
		Card[] bottom = new Card[cards.length/2];
		
		
		int bottomNumber = 0;
	    int upperNumber = 0;
	    int index=0;
		
		if (cards.length % 2 == 0 )
	    {
	      upper = new Card[cards.length/2];
	      index = upper.length;
	    }
	    else 
	    
	    {
	      upper = new Card[(cards.length/2) + 1];
	      index = upper.length;
	      
	    }
		

	    
	    for (int count = 0; count < upper.length; count++)
	    {
	      upper[count] = cards[count];
	    }
	    
	    
	    
	    
	    for (int count = 0; count < bottom.length; count++, index++) 
	    {
	      bottom[count] = cards[index];
	     
	    }
	    
	    
	    
	    for (int count = 0; count < cards.length; count++)
	    {
	      if (count % 2 != 0)
	      {
	        	        
	        
	        cards[count] = bottom[upperNumber];
	        upperNumber++;
	        
	      }
	      else if(count % 2 == 0)
	      
	      {
	    	  cards[count] = upper[bottomNumber];
	    	  
		      bottomNumber++;
	      }
	         
	    }						
		
	}

	public void cut(int position) {
		
		Card[] upper = new Card[position];
		Card[] lower = new Card[cards.length - upper.length];
		int index = position;
		int number = 0;
		
	    for (int count = 0; count < upper.length; count++)
	    {
	    	
	      upper[count] = cards[count];
	      
	    }
	    
	    
	    
	    for (int count = 0; count < lower.length; count++,index++)
	    
	    {
	    	
	      lower[count] = cards[index];
	      
	    }
	    
	    
	    for (int count = 0; count < cards.length; count++)
	    {
	      if (count < lower.length)
	      {
	    	  
	        cards[count] = lower[count];
	        
	      }
	      else 
	      {
	    	  
	        cards[count] = upper[number];
	        
	        number++;
	        
	      }
	    }		
		
	}

	public Card[] deal(int numCards) {
	
		
		Card [] array = new Card[numCards];
		Card [] smaller = new Card[cards.length - numCards];


		for (int count = 0; count < numCards; count++)
		
		{
			
			array[count] = cards[count];
		
		
		}

	
		for (int count = 0; count < smaller.length; count++, numCards++)
		
		{
			smaller[count] = cards[numCards];
		}

		cards = smaller;

		return array;
	}
		
}
