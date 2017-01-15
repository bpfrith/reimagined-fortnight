import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest {

  Deck deck;
  Card card;

  @Before
  public void before(){
    deck = new Deck();
    card = new Card(CardValue.ACE, CardSuit.SPADES);
  }

  // @Test
  // public void canGetTotalCards(){
  //   assertEquals(52, deck.getTotalCards());
  // }

  @Test
  public void packStartsEmpty(){
    assertEquals(0, deck.packCount());
  }

  @Test
  public void canGetCard(){
    deck.getCard(card);
    assertEquals(1, deck.packCount());
  }

  @Test
  public void canDealACard() {
    Card result = deck.dealCard();
    assertEquals(51, deck.packCount());
  }

}