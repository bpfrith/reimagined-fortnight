import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Deck deck;
  // Card card;

  @Before
  public void before(){
    deck = new Deck(52);
  }

  @Test
  public void canGetTotalCards(){
  assertEquals(52, deck.getTotalCards());
  }

}