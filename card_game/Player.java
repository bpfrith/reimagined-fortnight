package card_game;
import java.util.*;

public class Player{

  private String name; 
  private Hand hand;

  public Player(String name) {
    this.name = name;
    this.hand = new Hand();
  }

  public String getName(){
    return this.name;
  }

}