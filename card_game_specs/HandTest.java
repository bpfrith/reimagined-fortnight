import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class HandTest {
  Hand hand;

  @Before
  public void setup() {
    hand = new Hand();
  }

  @Test
  public void canCreateHand(){
    assertNotNull(hand);
  }

  @Test
  public void canGetCard(){
    Card card = new Card(CardValue.ACE, CardSuit.SPADES);
    hand.addCard(card);
    assertEquals(card, hand.getCard(0));
  }

  @Test
  public void canGetCardCount() {
    Card card1 = new Card(CardValue.ACE, CardSuit.SPADES);
    Card card2 = new Card(CardValue.SIX, CardSuit.HEARTS);
    hand.addCard(card1);
    hand.addCard(card2);
    assertEquals(2,hand.cardCount() );
  }

  @Test
  public void canRemoveCard() {
    Card card = new Card(CardValue.ACE, CardSuit.SPADES);
    hand.addCard(card);
    hand.clear();
    assertEquals(0,hand.cardCount() );
  }

  // @Test 
  // public void canGetValueOfHand(){
  //   Card card = new Card(CardValue.ACE, CardSuit.SPADES);
  //   hand.addCard(card);
  //   assertEquals(ACE, player.getValue());
  // }

}