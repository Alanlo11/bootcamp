package deck;

public class Card {

  private String suit;
  private String rank;

  public Card(String suit,String rank){
    this.suit = suit;
    this.rank = rank;
  }

  public String getSuit(){
    return this.suit;
  }

  public String getRank(){
    return this.rank;
  }

  public String toString(){
    return "Card(" + "suit=" + this.suit + " rank=" + this.rank + ")";
  }
 

  public static void main(String[] args) {
    Deck deck = new Deck();
    Card[] cards = deck.getCards();
    
    //deck.shuffle(200);
    new ShuffleManager(deck.getCards()).shuffle(100);

    for(Card card : deck.getCards()){
      System.out.println(card);
    }
  }
}