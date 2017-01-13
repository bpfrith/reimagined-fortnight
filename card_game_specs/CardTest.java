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

  // @Test
  // public void canBeSilver(){
  //   ring = new Ring(MetalType.SILVER, GemType.SAPHIRE);
  //   assertEquals(MetalType.SILVER,ring.getMetal());
  // }

  // @Test
  // public void canGetGem(){
  //   assertEquals(GemType.RUBY,ring.getGem());
  // }

  // @Test
  // public void canBeSaphire(){
  //   ring = new Ring(MetalType.SILVER, GemType.SAPHIRE);
  //   assertEquals(GemType.SAPHIRE,ring.getGem());
  // }

}