import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class CardTest {

  Card card;
  
  @Before 
  public void before(){
    card = new Card(CardValue.ACE, CardSuit.SPADES);
  }

  @Test
  public void canGetValue(){
    assertEquals(CardValue.ACE,card.getValue());
  }

  @Test
  public void canBeClubs(){
    card = new Card(CardValue.ACE, CardSuit.CLUBS);
    assertEquals(CardSuit.CLUBS,card.getSuit());
  }

  @Test
  public void canGetSuit(){
    assertEquals(CardSuit.SPADES,card.getSuit());
  }

  @Test
  public void canBeFive(){
    card = new Card(CardValue.FIVE, CardSuit.SPADES);
    assertEquals(CardValue.FIVE,card.getValue());
  }

}