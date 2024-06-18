package order2;

public class Item2 {
  private double pri;
  private int qua;

  public Item2(double pri,int qua){
    this.pri = pri;
    this.qua = qua;
  }

  public double getPri(){
    return this.pri;
  }

  public int getQua(){
    return this.qua;
  }

  public double subtol(){
    return this.pri * this.qua;
  }



  
}
