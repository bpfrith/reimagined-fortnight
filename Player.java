class Player(){
  protected String name;
  protected Deck hand = new Deck();

public void addCard(Card c){
  this.hand.addCard(c);
}