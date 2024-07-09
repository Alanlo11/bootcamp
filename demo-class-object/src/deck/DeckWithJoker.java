package deck;

import java.util.Random;

public class DeckWithJoker {
  public Card[] cards;
  public JokerCard[] jokerCards;

  public static int cardlength = Suit.values().length * Rank.values().length;
  public static int jokerlength = Joker.values().length;
  public static int length = Suit.values().length * Rank.values().length + Joker.values().length;

  public DeckWithJoker(){
      this.cards = new Card[length];
      int idx = 0;
      for(Suit suit : Suit.values()){
        for(Rank rank : Rank.values()){
          this.cards[idx++] = new Card(suit, rank);
        }
      }
      for(Joker joker : Joker.values()){
        this.cards[idx++] = new Card(joker);
      }
    }

  public void shuffle(int times) {
    JokerCard[] newCards = null;
    for (int i = 0; i < times; i++) {
      int startIdx = new Random().nextInt(DeckWithJoker.length - 1) + 1;
      int endIdx = new Random().nextInt(DeckWithJoker.length - startIdx) + startIdx;
      newCards = new JokerCard[DeckWithJoker.length];
      int count = 0;
      for (int j = startIdx; j <= endIdx; j++) {
        newCards[count++] = this.jokerCards[j];
      }
      for (int j = 0; j < startIdx; j++) {
        newCards[count++] = this.jokerCards[j];
      }
      for (int j = endIdx + 1; j < Deck.length; j++) {
        newCards[count++] = this.jokerCards[j];
      }
      this.jokerCards = newCards;
    }
  }

    public Card[] getCards(){
    return this.cards;
   }

    public JokerCard[] getJokerCards(){
    return this.jokerCards;
    }


    public static void main(String[] args) {
      DeckWithJoker jokerdeck = new DeckWithJoker();
      for(Card jokerCard : jokerdeck.cards){
        System.out.println(jokerCard);
      }
    }
}