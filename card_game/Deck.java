package card_game;
import java.util.*;

public class Deck{

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();

    for (int s=0; s<4; s++){
      CardSuit suit = CardSuit.values()[s];
      for (int v=0; v<13; v++){
        Card card = new Card(CardValue.values()[v], suit);
      }
    }
  }

  // public int getTotalCards(){
  //   return this.totalCards;
  // }

  public int packCount(){
    return deck.size();
  }

  public void getCard(Card card){
    deck.add(card);
  }

  public Card dealCard(){
    return deck.remove(0);
  }

  public void shuffleDeck() {
    Collections.shuffle(deck);
  }

}