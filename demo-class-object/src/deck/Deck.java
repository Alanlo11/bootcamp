package deck;

public class Deck {

  //Player,Deck,Card
  //attribute
  // public static final String[] suits = new String[]{"Diamond" , "Club" , "Heart" , "Spade"};
  // public static final String[] ranks = new String[]{"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
  public static int length = Suit.values().length * Rank.values().length;
  //Dependency,attribute
  public Card[] cards;
  public JokerCard[] jokerCards;

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
      Deck d = new Deck();
      d.getCards();
    }

    public Card[] getCards(){
      return this.cards;
    }

    public JokerCard[] getJokerCards(){
      return this.jokerCards;
    }

    public void shuffle(int times) {
      ShuffleManager sm = new ShuffleManager(getCards());
      sm.shuffle(times);
      this.cards = sm.getCards();
    }
  
    public static void main(String[] args) {
      // Deck deck = new Deck();
      // deck.shuffle(50);
      // System.out.println("Card[] after shuffle():");
      // for (Card card : deck.getCards()) {
      //   System.out.println(card);
      // }
      
      DeckWithJoker jokerdeck = new DeckWithJoker();
      for(JokerCard jokerCard : jokerdeck.getJokerCards()){
        System.out.println(jokerCard);
      }
      // for (Card card : jokerdeck.getCards()) {
      //   System.out.println(card);
      // }

    }

  }