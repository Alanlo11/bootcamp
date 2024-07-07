package deck;

public class JokerCard {
  private Joker joker;

  public JokerCard(Joker joker){
    this.joker = joker;
  }

  @Override
  public String toString(){
    return "Joker " + this.joker;
  }

}