package deck;

public class JokerCard {
  private Joker joker;
  private Suit suit;
  private Rank rank;

  public JokerCard(Suit suit,Rank rank){
    this.suit = suit;
    this.rank = rank;
  }

  public JokerCard(Joker joker){
    this.joker = joker;
  }

  public Suit getSuit(){
    return this.suit;
  }

  public Rank getRank(){
    return this.rank;
  }

  public Joker getJoker(){
    return this.joker;
  }

  @Override
  public String toString(){
    // return "Joker is:" + this.joker + " Suit is:" + this.suit + " Rank is:" + this.rank;
    if(this.suit == null)
    return "Card is:" + this.joker;
    return "Suit is:" + this.suit + " Rank is:" + this.rank;
  }

  public static void main(String[] args) {
    JokerCard joker = new JokerCard(Joker.Joker);
    System.out.println(joker);
    JokerCard jokercard = new JokerCard(Suit.CLUB, Rank.ACE);
    System.out.println(jokercard);
  }
}