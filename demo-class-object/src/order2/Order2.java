package order2;

import java.math.BigDecimal;
import java.util.Arrays;

public class Order2 {
  private int count;
  private Item2[] item2;

  public Order2(){
    this.count = count++;
    this.item2 = new Item2[0];
  }

  public void addItem2(Item2 item2){
    Item2[] itemlist2 = new Item2[this.item2.length + 1];
    for(int i=0; i<this.item2.length ; i++){
        itemlist2[i] = this.item2[i];
    }
    itemlist2[this.item2.length] = item2;
    this.item2 = itemlist2;
  }
  
  public double total2(){
    BigDecimal total2 = BigDecimal.valueOf(0.0d);
    for(int i=0; i<this.item2.length ; i++){
      total2 = total2.add(BigDecimal.valueOf(this.item2[i].subtol()));
    }
    return total2.doubleValue();
  }

  public static void main(String[] args) {
  Order2 o1 = new Order2();
  Item2 i1 = new Item2(85.5, 3); 
  System.out.println(i1.subtol());
  o1.addItem2(i1);
  System.out.println(o1.total2());

  Item2 i2 = new Item2(56.5, 5);
  System.out.println(i2.subtol());
  o1.addItem2(i2);
  System.out.println(o1.total2());
    
  }
}