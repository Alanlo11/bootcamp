package deck2;

public class Card2 {
  
  private String nums2;
  private String patt2;

  public Card2(String nums2,String patt2){
    this.nums2 = nums2;
    this.patt2 = patt2;
  }

  public String getNums2(){
    return this.nums2;
  }

  public String getPatt2(){
    return this.patt2;
  }

  public String toString(){
    return "(" + this.nums2 + " " + this.patt2 +")";
  }
  

  public static void main(String[] args) {
    Deck2 d2 = new Deck2();
    
    
    
    Shuffle sh = new Shuffle(d2.getCards2());
    sh.shuffle(5);
   
    for(Card2 card2 : d2.getCards2()){
      System.out.println(card2);
    }
    

  }
}