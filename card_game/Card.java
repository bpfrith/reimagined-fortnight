package card_game;

public class Card{

  private CardValue value;
  private CardSuit suit;

  public Card(CardValue value, CardSuit suit){
    this.value = value;
    this.suit = suit;
  }

  public CardValue getValue(){
    return this.value;
  }

  public CardSuit getSuit(){
    return this.suit;
  }

  public String cardType(){
    return this.value + " of " + this.suit;
  }

}