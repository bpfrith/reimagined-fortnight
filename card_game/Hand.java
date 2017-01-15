package card_game;
import java.util.*;

public class Hand{

  private ArrayList<Card> hand;

  public Hand(){
    hand = new ArrayList<Card>();
  }

  public void addCard(Card card){
    hand.add(card);
  }

  public Card getCard(int position){
    return (Card)hand.get(position);
  }

  public int cardCount(){
    return hand.size();
  }

  public void clear(){
    hand.clear();
  }

}