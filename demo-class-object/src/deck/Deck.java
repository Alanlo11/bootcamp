package deck;

import java.util.Random;

public class Deck {

  //Player,Deck,Card
  private static String[] suits = new String[]{"Diamond" , "Club" , "Heart" , "Spade"};
  private static String[] ranks = new String[]{"A" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K"};
  private String suit;
  private String rank;
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

    public Card[] getCards(){
      return this.cards;
    }


    //Behavior
    public void shuffle(int times){
      if(times >1000)
        times = 1000;
      Card[] newCards = null;
      for(int i=0; i<times ; i++){
      int idx = new Random().nextInt(length);//0-51
      System.out.println("idx=" + idx);
      newCards = new Card[length];
      int count = 0;
      for(int j=idx ; j<length ; j++){
        newCards[count++] = this.cards[j];
      }
      for(int j=0 ; j<idx ; j++){
        newCards[count++] = this.cards[j];
      }
      }
      this.cards = newCards;
    }
  }