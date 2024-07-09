package deck;

public class Test {
  private Suit suit;
  private Joker joker;

  public Test(Suit suit){
    this.suit = suit;
  }

  public Test(Joker joker){
    this.joker = joker;
  }

  @Override
  public String toString(){
    return "Suit" + this.suit + "Joker" + this.joker;
  }
  

  public static void main(String[] args) {
    Test t = new Test(Suit.CLUB);
    System.out.println(t);
    Test t1 = new Test(Joker.Joker2);
    System.out.println(t1);
  }
}
