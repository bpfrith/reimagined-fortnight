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

  // public void sortByValue() {
  //     ArrayList sortedValueHand = new ArrayList();
  //     while (hand.size() > 0) {
  //          int pos = 0;
  //          Card sortCard = (Card)hand.get(0);
  //          for (int i = 1; i < hand.size(); i++) {
  //           Card sortCardNext = (Card)hand.get(i);
  //           if (( sortCard.cardValue().compareTo(sortNextCard.cardValue()) <0) ||
  //             ((sortCard.cardValue() == sortCard.cardValue()) && (sortNextCard.getSuit().compareTo(sortCard.getSuit()))<0)) {
  //             pos = i;
  //           sortCard = sortNextCard;
  //         }
  //       }
  //       hand.remove(pos);
  //       sortedHand.add(hcard);
  //     }
  //     hand = sortedValueHand;
  //   }

}