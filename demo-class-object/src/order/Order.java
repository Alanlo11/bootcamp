package order;

import java.math.BigDecimal;

public class Order {
    
    private static int count;
    private int id;
    private Item[] items;//object ref
    private String coupon;

    public Order(String coupon){
      this.id = ++count;
      items = new Item[0];
    }

    public int getId(){
      return this.id;
    }

    public Item[] getItems(){
      return this.items;
    }

    public String getCoupon(){
      return this.coupon;
    }

    public double getDiscount(){
      if (isCouponValid())
      return 0.2d;
      return 0.0d;
    }

    public boolean isCouponValid(){
      return true;
    }


    public void addItem(Item item){
      Item[] items = new Item[this.items.length + 1];
      for(int i=0 ; i<this.items.length ; i++){
        items[i] = this.items[i];
      }
      items[items.length-1] = item;
      this.items = items;
    }

    //double + double = 出事
    public double total(){
      BigDecimal amount = BigDecimal.valueOf(0L);
      //add,subtracy,mutiply,divide method return new Object
      for(int i=0 ; i<this.items.length ; i++){
        amount = amount.add(BigDecimal.valueOf(this.items[i].subtotal()));//return new Biddec,所以左邊一定要有object reference
      }
      //calculate Discount
      amount = amount.multiply(BigDecimal.valueOf(1.0 - getDiscount()));
      return amount.doubleValue();//convert from BigDecimal Object to double primitive value
    }


    public static void main(String[] args){
      Order order = new Order("ABC");

      Item item = new Item(96.0,2);
      System.out.println(item.subtotal());
      order.addItem(item);

      Item item2 = new Item(10.0d , 3);
      order.addItem(item2);
      System.out.println(order.total());


    }
  }
