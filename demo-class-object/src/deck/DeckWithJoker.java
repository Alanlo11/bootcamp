package deck;

public class DeckWithJoker {
  private Card[] cards;
  public static int length = Suit.values().length * Rank.values().length + Joker.values().length;
  
  public DeckWithJoker(){
    this.cards = new Card[length];
    int idx = 0;
    for(Suit suit : Suit.values()){
      for(Rank rank : Rank.values()){
        this.cards[idx++] = new Card(suit, rank);
      }
  }
  
}
}
