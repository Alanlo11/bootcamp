package deck;

public class Card {

  // private String suit;
  // private String rank;
  private Suit suit;
  private Rank rank;

  public Card(Suit suit,Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  @Override
  public String toString(){
    return "Card(suit=" + this.suit + " rank=" + this.rank + ")";
  }

  //Coding Style: Early Return
  public boolean isHigherthan(Card card){//when the method is defined small enough
    //compare rank first,if they are equal,then compare suit.
    //"OR" relationship
    if(this.rank.isHigherthan(card.getRank()))
      return true;//exit method.
    if(this.rank == card.getRank() && this.suit.isHigherthan(card.getSuit()))
    return true;
    return false;
    // }else if(this.rank.equals(card.getRank().getValue()) && this.suit > card.getSuit()){
    //   return true;
    // }else{
    //   return false;
    }
 

  public static void main(String[] args) {
    Deck deck = new Deck();
    deck.getCards();
    
    //deck.shuffle(200);
    new ShuffleManager(deck.getCards());
    

    for(Card card : deck.getCards()){
      System.out.println(card);
    }

    


  }
}