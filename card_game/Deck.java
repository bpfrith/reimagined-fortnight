package card_game;
import behaviours.*;
import java.util.*;

public class Deck implements Deckable{

  int totalCards;
  ArrayList<Deckable> pack;

  public Deck(int totalCards){
    this.totalCards = totalCards;
    this.pack = new ArrayList<Deckable>();
  }

  public int getTotalCards(){
    return this.totalCards;
  }
}