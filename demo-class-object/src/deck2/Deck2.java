package deck2;

public class Deck2 {
  
  private static String[] nums = new String[] {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
  private static String[] patt = new String[] {"Heart","Spade","Club","Diamond"};
  public static int length = nums.length * patt.length;
  public Card2[] cards2;

  public Deck2(){
    this.cards2 = new Card2[nums.length * patt.length];
    int idx = 0;
    for(int i=0 ; i<nums.length; i++){
      for(int j=0 ; j<patt.length ; j++){
        this.cards2[idx++] = new Card2(nums[i],patt[j]); 
      }
    }
  }

  public Card2[] getCards2(){
    return this.cards2;
  }

}