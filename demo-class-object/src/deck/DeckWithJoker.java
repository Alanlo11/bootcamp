package deck;

public class DeckWithJoker {
  private Card[] cards;
  private JokerCard[] jokerCards;
  public static int cardlength = Suit.values().length * Rank.values().length;
  public static int jokerlength = Joker.values().length;
  
  public DeckWithJoker(){
    this.cards = new Card[cardlength];
    this.jokerCards = new JokerCard[jokerlength];
    int idx = 0;
    for(Suit suit : Suit.values()){
      for(Rank rank : Rank.values()){
        this.cards[idx++] = new Card(suit, rank);
      }
  }
  for (int i = 0; i < jokerCards.length; i++) {
    this.jokerCards[i] = new JokerCard(Joker.values()[i]);
}
}

    public Card[] getCards(){
    return this.cards;
   }

    public JokerCard[] getJokerCards(){
    return this.jokerCards;
    }

    @Override
    public String toString(){
      return "Joker is " + this.jokerCards;
    }

}