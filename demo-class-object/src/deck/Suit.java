package deck;

public enum Suit {
  DIAMOND(1),
  CLUB(2),
  HEART(3),
  SPADE(4),
  ;

  private int rank;

  public int getRank(){
    return this.rank;
  }

  public static int suitNumber(){
    return Suit.SPADE.rank;
  }

  private Suit(int rank){
    this.rank = rank;
  }

  //most of the instance methods should refer to "this"
  //if there is no "this" keyword in your method,then probably you should consider to use "Static method"
  public boolean isHigherthan(Suit suit){
    return this.rank > suit.rank;
  }

  public Suit bigger(Suit suit){
    if(this.rank > suit.rank){
      return this;
    }else{
      return suit;
    }
  }

  public static Suit whichOneHigher(Suit a,Suit b){
    if(a.rank > b.rank){
      return a;
    }else{
      return b;
    }
  }

  public static void main(String[] args) {
    System.out.println(Suit.CLUB.isHigherthan(Suit.SPADE));
    System.out.println(Suit.SPADE.bigger(Suit.CLUB));
    System.out.println(Suit.whichOneHigher(Suit.DIAMOND, Suit.CLUB));

    Suit targetSuit = Suit.DIAMOND;
    Suit currentSuit = Suit.CLUB;

    //Meaning: comparing their ranking
    //1.not good enough
    if(currentSuit.getRank() > targetSuit.getRank()){
      
    }

    //2. this one is better than 1.
    if(currentSuit.isHigherthan(targetSuit)){

    }

  }
}
