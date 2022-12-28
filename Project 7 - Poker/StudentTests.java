package poker;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTests {

	@Test
	public void hasPair() {
		
		Card[] test =new Card[5];
		test[0]=new Card(10,0);
		test[1]=new Card(13,2);
		test[2]=new Card(10,3);
		test[3]=new Card(5,1);
		test[4]=new Card(8,1);
			
		assertTrue(PokerHandEvaluator.hasPair(test));
						
	}
	@Test
	public void hasTwoPair() {
		
		Card[] test =new Card[5];
		test[0]= new Card(13,2);
		test[1] = new Card(10,0);
		test[2] = new Card(10,3);
		test[3] = new Card(8,1);
		test[4] = new Card(13,2);

		assertTrue(PokerHandEvaluator.hasTwoPair(test));

		
	}
	@Test
	public void hasThreeOfAKind() {
		Card[] test =new Card[5];
		test[0]= new Card(10,2);
		test[1] = new Card(10,0);
		test[2] = new Card(10,3);
		test[3] = new Card(8,1);
		test[4] = new Card(13,2);

		assertTrue(PokerHandEvaluator.hasThreeOfAKind(test));
	}
	
	@Test
	public void hasStraight() {
		Card[] test =new Card[5];

		test[0]= new Card(10,2);
		test[1] = new Card(9,0);
		test[2] = new Card(11,0);
		test[3] = new Card(8,1);
		test[4] = new Card(7,2);

		assertTrue(PokerHandEvaluator.hasStraight(test));

		
	}
	@Test
	public void hasFlush() {
		
		Card[] test =new Card[5];

		test[0]= new Card(13,3);
		test[1] = new Card(11,3);
		test[2] = new Card(10,3);
		test[3] = new Card(8,3);
		test[4] = new Card(5,3);

		assertTrue(PokerHandEvaluator.hasFlush(test));

	
	}
	@Test
	public void hasFullHouse() {
		
		Card[] test =new Card[5];
		test[0]= new Card(8,2);
		test[1] = new Card(8,1);
		test[2] = new Card(10,3);
		test[3] = new Card(10,0);
		test[4] = new Card(10,2);

		assertTrue(PokerHandEvaluator.hasFullHouse(test));


	}
	
	@Test
	public void hasFourOfAkind() {
		
		
		Card[] test =new Card[5];
		test[0]= new Card(10,2);
		test[1] = new Card(10,0);
		test[2] = new Card(10,3);
		test[3] = new Card(10,1);
		test[4] = new Card(13,2);

		assertTrue(PokerHandEvaluator.hasFourOfAKind(test));
		
		
	}
	@Test
	public void thasStraightFlush1() {
		
		Card[] test =new Card[5];


		test[0]= new Card(5,2);
		test[1] = new Card(7,2);
		test[2] = new Card(6,2);
		test[3] = new Card(4,2);
		test[4] = new Card(3,2);

		assertTrue(PokerHandEvaluator.hasStraightFlush(test));
		
		
	
		
	}
	@Test
	public void thasStraightFlush2() {
		
		Card[] test =new Card[5];


		test[0]= new Card(5,2);
		test[1] = new Card(7,2);
		test[2] = new Card(6,2);
		test[3] = new Card(4,2);
		test[4] = new Card(3,2);
		
		
		assertTrue(PokerHandEvaluator.hasStraight(test));
		
		
	}
	@Test
	public void thasStraightFlush3() {
		
		Card[] test =new Card[5];


		test[0]= new Card(5,2);
		test[1] = new Card(7,2);
		test[2] = new Card(6,2);
		test[3] = new Card(4,2);
		test[4] = new Card(3,2);

		assertTrue(PokerHandEvaluator.hasFlush(test));
		
		
	}
	@Test
	public void defultConstructor1() {
		
		

		Card card1 = new Card(10, 3);
		

		assertTrue(card1.getValue() ==10 && card1.getSuit() ==3);
		
		
		
	}
	@Test
	public void defultConstructor2() {
		
		Card card2 = new Card(6, 2);
		
		assertTrue(card2.getValue() ==6 && card2.getSuit() ==2);
	}
	@Test
	public void defultConstructor3() {
		Deck deck = new Deck();
		Deck deck2 = new Deck();

		
		
		assertTrue(deck.getNumCards()== deck2.getNumCards());	
	}
	
	@Test
	public void CopyConstructor() {
		
		Deck test = new Deck();
		Deck copy = new Deck(test);
		for(int count = 0; count < test.getNumCards(); count++)
		
		{
			assertEquals(test.getCardAt(count), copy.getCardAt(count));


		}
		
		
	}
	@Test
	public void getCardAt() {
		
		Deck deck = new Deck();

		assertTrue(deck.getCardAt(1).getValue()==2);
				
		
	}
	@Test
	public void getNumOfCards() {
		
		
		Deck deck = new Deck();
		Card[] cards = deck.deal(3);
		assertTrue(cards.length == 3);
		
	}

	@Test
	public void shuffle() {
		Deck deck = new Deck();
		
		deck.shuffle();
		assertTrue(deck.getCardAt(2).getValue()==0 && deck.getCardAt(2).getSuit()==1);

		
	}
	@Test
	public void cut() {
		Deck deck = new Deck();
		deck.cut(4);
		Card[] test = deck.deal(4);
		for(int count =0; count<test.length;count++)
		{
			assertTrue(test[count].equals(deck.getCardAt(count)));
		}
	}
	@Test
	public void deal() {
		Deck deck = new Deck();
		
		assertTrue(deck.getCardAt(0)==deck.getCardAt(0));

		
	}

}