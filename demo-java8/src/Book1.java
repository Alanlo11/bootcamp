public class Book1 {
  private double price;
  private String author;

  public Book1(double price, String author){
    this.price = price;
    this.author = author;
  }

  // 如果冇get／setter，係封裝左呢個object
  // 咁用係睇要用d咩method，睇點用
  // Type of instance method
  // getter, setter..
  // presentation -> defintion, String.subString
  public boolean isTooExpensive(){
    return this.price > 100;
  }
  // transform (replace)
  public static void main(String[] args) {
    Book book = new Book(99.9, "John");
    System.out.println(book.price());// 99.9
    System.out.println(book.author());// "John"
    Book book2 = new Book(99.9, "John");
    Book book3 = new Book(999.9, "Alan");
    // System.out.println(book.author);// private

    // equals(), hashCode(), toString()
    System.out.println(book.author().equals(book2.author()));// true
    System.out.println(book.price()==book2.price());// true
    System.out.println(book.author().equals(book3.author()));// false
    System.out.println(book.price()==book3.price());// false
    System.out.println(book.hashCode());// 1586360712
    System.out.println(book.author().hashCode());// 2314539
    System.out.println(book.toString());// Book[price=99.9, author=John]
    System.out.println(book2.hashCode());// 1586360712
    System.out.println(book2.author().hashCode());// 2314539


  }
}