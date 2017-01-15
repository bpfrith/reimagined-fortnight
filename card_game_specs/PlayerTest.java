import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest {

  Player player;
  Hand hand;
  Card card;

  @Before
  public void before(){
    player = new Player("Ben");
    hand = new Hand();
    card = new Card(CardValue.ACE, CardSuit.SPADES);
  }

  @Test
  public void canGetName(){
    assertEquals("Ben",player.getName());
  }

  @Test
  public void playerHasHand(){
    assertNotNull(hand);
  }

}