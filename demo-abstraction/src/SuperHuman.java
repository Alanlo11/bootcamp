public abstract class SuperHuman {
  private double height;

  //Why abstract class has constructor we
  public SuperHuman(double height){
    this.height = height;
  }

  public SuperHuman(){

  }

  public double getHeight(){
    return this.height;
  }
}