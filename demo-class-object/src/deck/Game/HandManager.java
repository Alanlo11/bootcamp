package deck.Game;

import deck.Card;
import deck.Rank;
import deck.Suit;
//static method -> instance method
public class HandManager {
  private Card[] cards;

  public HandManager(Card[] cards){
  this.cards = cards;
  }

  public boolean isFullHouse(){
    int count = 0;
    int count1 = 0;
    for(int i=0 ; i<this.cards.length ; i++){
      for(int j=0 ; j<this.cards.length ; j++){
        if(this.cards[i].getRank() == this.cards[j].getRank()){
          count++;
        }
      }
      if(count == 13){
        for(int k=0 ; k<this.cards.length ; k++){
          for(int o=0 ; o<this.cards.length ; o++){
            if(this.cards[k].getRank() == this.cards[o].getRank() && k != o){
              count1++;
            }
          }
        }
        if(count1 == 8)
          return true;
      }
    }
    return false;
  }


  public static void main(String[] args) {
    Card[] card0 = new Card[5];
    card0[0] = new Card(Suit.CLUB,Rank.ACE);
    card0[1] = new Card(Suit.DIAMOND, Rank.ACE);
    card0[2] = new Card(Suit.HEART, Rank.ACE);
    card0[3] = new Card(Suit.SPADE, Rank.EIGHT);
    card0[4] = new Card(Suit.CLUB, Rank.EIGHT);
    HandManager hm = new HandManager(card0);
    System.out.println(hm.isFullHouse());
  }
}