package deck;

public class Deck {

  //Player,Deck,Card
  //attribute
  // public static final String[] suits = new String[]{"Diamond" , "Club" , "Heart" , "Spade"};
  // public static final String[] ranks = new String[]{"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
  public static int length = Suit.suitNumber() * Rank.rankNumber();
  //Dependency,attribute
  public Card[] cards;

  //construstor
  public Deck(){
    this.cards = new Card[length];
    int idx = 0;
    for(Suit suit : Suit.values()){
      for(Rank rank : Rank.values()){
        this.cards[idx++] = new Card(suit, rank);
      }
    }
  }

    //for(int i=0 ; i<suits.length ; i++){
      //for(int j=0 ; j<ranks.length ; j++){
        //this.cards[cardnumber] = new Card(suits[i],ranks[j]);
        //cardnumber++;

        //static method can not use this.
    public static void test(){
      System.out.println("hello");
      Deck d = new Deck();
      d.getCards();
    }

    public Card[] getCards(){
      return this.cards;
    }

  }