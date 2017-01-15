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

}