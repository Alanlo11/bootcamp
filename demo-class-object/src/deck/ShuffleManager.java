package deck;

import java.util.Random;

public class ShuffleManager {

  //Dependency,attribute
  private Card[] cards;

  public ShuffleManager(Card[] cards){
    this.cards = cards;
  }

    public void shuffle(int times){
      if(times >1000)
        times = 1000;
      Card[] newCards = null;
      for(int i=0; i<times ; i++){
      int idx = new Random().nextInt(Deck.length);//0-51
      System.out.println("idx=" + idx);
      newCards = new Card[Deck.length];
      int count = 0;
      for(int j=idx ; j<Deck.length ; j++){
        newCards[count++] = this.cards[j];
      }
      for(int j=0 ; j<idx ; j++){
        newCards[count++] = this.cards[j];
      }
      }
      this.cards = newCards;
    }
  
}
