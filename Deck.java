class Deck{
  private Stack<Card> card = new Stack<Card>();

  public Deck(){}

  public Deck(int numberOfCards){
    for (int i=0; i<numberOfCards; i++){
      cards.push(CardFactory.createCard(i));
    }
  }

  private void shuffle(){
    Collections.shuffle(this.cards);
  }

  public void sort(){
    Collections.sort(this.cards);
  }

  public void removeAllCards(){
    this.cards.removeAllElements();
  }

  public void removeCard(Card card){
    int i = this.cards.search(card);
    this.cards.remove(i);
  }

  public Card getCard(Card card){
    int i - this.cards.search(card);
    this.cards.remove(i);
  }

  public Card getCard(Card card){
    int i = this.cards.search(card);
    return this.cards.get(i);
  }

  public Card getTopCard(){
    return this.cards.pop();
  }

  public Card getNthCard(int i){
    return this.cards.get(i);
  }

  public Card addCard(Card card){
    this.cards.push(card);
  }

}