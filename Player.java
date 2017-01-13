class Player(){
  protected String name;
  protected Deck hand = new Deck();

public void addCard(Card card){
  this.hand.addCard(card);
}