package deck.Game;

import deck.DeckWithJoker;
import deck.Rank;
import deck.Suit;
import deck.Card;

public class BigTwo {

  private Card[] cards;
  
  public static boolean isFourKind(Card[] cards){//4條
    int count = 0;
    for(int i=0 ; i<cards.length ; i++){
      for(int j=0 ; j<cards.length ; j++){
        if(cards[i].getRank() == cards[j].getRank()){
        count++;
      }
    }
    if(count == 4)
    return true;
  }
    return false;
}

  public static boolean isStraight(Card[] cards){//順
    int count = 0;
    for(int i=0 ; i<cards.length ; i++){
      for(int j=0 ; j<cards.length ; j++){
        if(cards[i].getRank().getValue() +1 == cards[j].getRank().getValue()){
          count++;
        }
      }
      if(count == 4)
      return true;
    }
    return false;
  }

  public static boolean isFullHouse(Card[] cards){//葫蘆
    int count = 0;
    int count1 = 0;
    for(int i=0 ; i<cards.length ; i++){
      for(int j=0 ; j<cards.length ; j++){
        if(cards[i].getRank() == cards[j].getRank()){
          count++;
        }
      }
      if(count == 13){
        for(int k=0 ; k<cards.length ; k++){
          for(int o=0 ; o<cards.length ; o++){
            if(cards[k].getRank() == cards[o].getRank() && k != o){
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

  public static boolean isRoyalFlush(Card[] cards){//同花順
    int count = 0;
    for(int i=0 ; i<cards.length ; i++){
      for(int j=0 ; j<cards.length ; j++){
        if(cards[i].getRank().getValue() +1 == cards[j].getRank().getValue() && cards[i].getSuit() == cards[j].getSuit()){
          count++;
        }
      }
      if(count == 4)
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    //Problem 1: how to design/handle the 2 Joker Card in the classes? (Parent Class/interface)
    //rank? Rank.TWO is the highest in Big two.
    DeckWithJoker deck = new DeckWithJoker();
    System.out.println(isFourKind(deck.cards));//true

    Card[] card = new Card[5];
    card[0] = new Card(Suit.CLUB,Rank.ACE);
    card[1] = new Card(Suit.DIAMOND, Rank.ACE);
    card[2] = new Card(Suit.HEART, Rank.ACE);
    card[3] = new Card(Suit.SPADE, Rank.EIGHT);
    card[4] = new Card(Suit.CLUB, Rank.EIGHT);
    System.out.println("FourKind is:" + isFourKind(card));//false

    Card[] card0 = new Card[5];
    card0[0] = new Card(Suit.CLUB,Rank.ACE);
    card0[1] = new Card(Suit.DIAMOND, Rank.ACE);
    card0[2] = new Card(Suit.HEART, Rank.ACE);
    card0[3] = new Card(Suit.SPADE, Rank.EIGHT);
    card0[4] = new Card(Suit.CLUB, Rank.EIGHT);
    System.out.println("FullHouse is:" + isFullHouse(card0));//true

    Card[] card1 = new Card[5];
    card1[0] = new Card(Suit.CLUB,Rank.ACE);
    card1[1] = new Card(Suit.CLUB, Rank.TWO);
    card1[2] = new Card(Suit.CLUB, Rank.THREE);
    card1[3] = new Card(Suit.CLUB, Rank.FOUR);
    card1[4] = new Card(Suit.CLUB, Rank.FIVE);
    System.out.println("Straight is:" + isStraight(card1));//true

    Card[] card2 = new Card[5];
    card2[0] = new Card(Suit.CLUB,Rank.ACE);
    card2[1] = new Card(Suit.CLUB, Rank.TWO);
    card2[2] = new Card(Suit.CLUB, Rank.THREE);
    card2[3] = new Card(Suit.CLUB, Rank.FOUR);
    card2[4] = new Card(Suit.CLUB, Rank.FIVE);
    System.out.println("RoyalFlush is:" + isRoyalFlush(card2));//true

    System.out.println(card2[4].isHigherthanInB2(card2[1]));

  }
}