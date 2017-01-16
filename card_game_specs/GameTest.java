import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class GameTest {

  Game game;
  Deck deck;
  Card card1;
  Card card2;
  Player player1, player2;

  @Before
  public void before(){
    game = new Game();
    deck = new Deck();
    player1 = new Player("Ben");
    player2 = new Player("Ramsay");
    card1 = new Card(CardValue.ACE, CardSuit.SPADES);
    card2 = new Card(CardValue.SIX, CardSuit.HEARTS);
  }

  @Test
  public void gameStartsWithNoPlayers(){
    assertEquals(0, game.numberOfPlayers());
  }

  @Test
  public void canAddPlayer(){
    game.addPlayer(player1);
    assertEquals(1, game.numberOfPlayers());
  }

  @Test
  public void turnLogStartsZero() {
    assertEquals(0, game.turnLog());
  }


  @Test
  public void canIncreaseTurnLog() {
    game.increaseTurnLog();
    assertEquals(1,game.turnLog());
  }

}