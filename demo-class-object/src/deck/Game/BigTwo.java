package deck.Game;

import deck.Deck;
import deck.DeckWithJoker;
import deck.Suit;
import deck.Card;

public class BigTwo {
  
  public static boolean isFourKind(Card[] cards){//4條
    int count = 0;
    for(int i=0 ; i<cards.length ; i++){
      for(int j=0 ; j<cards.length ; j++){
        if(cards[i].getRank() == cards[j].getRank()){
        count++;
      }
    }
    if(count==4)
    return true;
  }
    return false;
  }

  public static boolean isStraight(Card[] cards){//
    return false;
  }

  public static boolean isFullHouse(Card[] cards){
    return false;
  }

  public static boolean isRoyalFlush(Card[] cards){
    return false;
  }

  public static void main(String[] args) {
    //Problem 1: how to design/handle the 2 Joker Card in the classes? (Parent Class/interface)
    //rank? Rank.TWO is the highest in Big two.
    DeckWithJoker deck = new DeckWithJoker();
    System.out.println(isFourKind(deck.cards));
  }
}