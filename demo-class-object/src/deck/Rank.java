package deck;

public enum Rank{
  ACE(1,12),
  TWO(2,13),
  THREE(3,1),
  FOUR(4,2),
  FIVE(5,3),
  SIX(6,4),
  SEVEN(7,5),
  EIGHT(8,6),
  NINE(9,7),
  TEN(10,8),
  JACK(11,9),
  QUEEN(12,10),
  KING(13,11),
  ;

  private int value;
  private int bigTwoValue;
  
  private Rank(int value,int bigtwovalue){
    this.value = value;
    this.bigTwoValue = bigtwovalue;
  }

  public int getValue(){
    return this.value;
  }

  public int getBigTwoValue(){
    return this.bigTwoValue;
  }

  public boolean isHigherthan(Rank rank){
   return this.value > rank.getValue();
  //  if(this.value > rank.getValue())
  //  return true;
  //  return false;
  }

  public boolean isHigherthanInB2(Rank rank){
    return this.bigTwoValue > rank.bigTwoValue;
  }

  public static void main(String[] args) {
    System.out.println(Rank.values().length);//13
  }
}
