package games;

import java.util.*;
import card_game.*;

public class HighCard implements Score{

  private HashMap<CardValue, Integer> valueMap = new HashMap<CardValue, Integer>();

  public HighCard(){
    valueMap.put(CardValue.ACE, 14);
    valueMap.put(CardValue.TWO, 2);
    valueMap.put(CardValue.THREE, 3);
    valueMap.put(CardValue.FOUR, 4);
    valueMap.put(CardValue.FIVE, 5);
    valueMap.put(CardValue.SIX, 6);
    valueMap.put(CardValue.SEVEN, 7);
    valueMap.put(CardValue.EIGHT, 8);
    valueMap.put(CardValue.NINE, 9);
    valueMap.put(CardValue.TEN, 10);
    valueMap.put(CardValue.JACK, 11);
    valueMap.put(CardValue.QUEEN, 12);
    valueMap.put(CardValue.KING, 13);
  }

  public ArrayList<Card> compare(ArrayList<Card> hand1, ArrayList<Card> hand2){
    Card card1 = hand1.get(0);
    Card card2 = hand2.get(0);
    Integer card1Score = valueMap.get(card1.getValue());
    Integer card2Score = valueMap.get(card2.getValue());
    return card1Score > card2Score ? hand1 : hand2;
  }

}