package deck;

public class Deck {

  //Player,Deck,Card
  //attribute
  private static String[] suits = new String[]{"Diamond" , "Club" , "Heart" , "Spade"};
  private static String[] ranks = new String[]{"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
  public static int length = suits.length * ranks.length;
  //Dependency,attribute
  public Card[] cards;

  //construstor
  public Deck(){
    this.cards = new Card[suits.length * ranks.length];
    int idx = 0;
    for(String suit : suits){
      for(String rank : ranks){
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