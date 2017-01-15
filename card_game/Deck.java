package card_game;
import behaviours.*;
import java.util.*;

public class Deck implements Dealable{

  int totalCards;
  ArrayList<Card> deck;

  public Deck(int totalCards){
      this.totalCards = totalCards;
      this.deck = new ArrayList<Card>();
    }

    // public void createDeck(){
    //     for(CardValue value : CardValue.values()){
    //       for(CardSuit suit : CardSuit.suits()){
    //         Card card = new Card(value, suit);
    //         deck.add(card);
    //         totalCards += 1;
    //       }
    //     }
    //   }

  public int getTotalCards(){
    return this.totalCards;
  }

  public int packCount(){
    return deck.size();
  }

  

}