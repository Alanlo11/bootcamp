package deck2;

import java.util.Random;
import deck.Deck;

public class Shuffle {
  
  private Card2[] cards2;

public Shuffle(Card2[] cards2){
  this.cards2 = cards2;
}

public Card2[] getCard2(){
  return this.cards2;
}

public void shuffle(int time2){
  if(time2>1000)
  time2 = 1000;
  Card2[] shuf = null;
  for(int i=0 ; i<time2 ; i++){
    int idx = new Random().nextInt(Deck.length);//0-51
      shuf = new Card2[Deck2.length];
      int count = 0;
      for(int j=idx ; j<Deck2.length ; j++){
        shuf[count++] = this.cards2[j];
      }
      for(int j=0 ; j<idx ; j++){
        shuf[count++] = this.cards2[j];
      }
  }
    this.cards2 = shuf;
  }



}
