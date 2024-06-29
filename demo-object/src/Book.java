import java.time.LocalDate;
import java.util.Objects;

public class Book {//implicitly inherit Object.class
  //public class Book extends Object
  private String author;
  private LocalDate publishDate;

  public Book(String author,LocalDate publishDate){
    this.author = author;
    this.publishDate = publishDate;
  }

  public String getAuthor(){
    return this.author;
  }

  public LocalDate getPublishDate(){
    return this.publishDate;
  }

  //if you do not @Override,the hashCode() method by default representing the object address
  @Override
  public int hashCode(){
    return Objects.hash(this.author,this.publishDate);
  }

  //if you override it,your purpose is to make it become ture
  //even if they are 2 different object in heap memory
  @Override
  public boolean equals(Object obj){
    if (this == obj)
      return true;
    if(!(obj instanceof Book))//"instanceof" is checking if the object pointing by reference an object by.Book.class
      return false;
    Book book = (Book) obj;
    return Objects.equals(this.author, book.getAuthor())//唔可以直接用obj.getauthor係因為equals(Object obj){呢到佢係belongs Object
        && Objects.equals(this.getPublishDate(), book.getPublishDate());
    // if(book.getAuthor().equals(this.author)&&book.getPublishDate().compareTo(this.publishDate)==0){
    //   return true;
    // }
    // return false;
  }
  

  public static void main(String[] args) {
    Book b1 = new Book("John", LocalDate.of(2000, 12, 12));//75848450
    Book b2 = new Book("John", LocalDate.of(2000, 12, 12));//75848450

    System.out.println(b1.hashCode());
    System.out.println(b2.hashCode());

    Book b3 = new Book("John", LocalDate.of(2000, 12, 15));//75848453
    System.out.println(b3.hashCode());

    System.out.println(System.identityHashCode(b1));//1933863327,because b1 & b2 object are different objects
    System.out.println(System.identityHashCode(b2));//112810359


    //Object.class has equals() method
    //唔override既情況下，equals() by default checking object address
    //System.out.println(b1.equals(b2));//false,if you do not override
    System.out.println(b1.equals(b2));//after override,that is true
    System.out.println(b1.equals(b3));//false

    //if both objects are located in different address,equals() must return false (no override)
    System.out.println(b1.equals(new Cat()));//false

    String str = "abc";
    System.out.println(str.hashCode());//96354
    System.out.println(97 * (int)Math.pow(31,2) + 98 * 31 +99);//96354

    //Implication
    //there will be another String value with same hash code.
    //2 different String potentially can be with same hash code.
    //因為會overflow,所以有機會會有一樣既hashcode.
    String str2 = "abcdefghijklxy";
    System.out.println(str2.hashCode());
    String str3 = "bbcdefghijklxy";
    System.out.println(str3.hashCode());//overflow

    Integer i3 = 365;
    System.out.println(i3.hashCode());

    System.out.println(new String("abc").equals(new String("abc")));//true

    //compile time determine if s1 is able to call equals()
    //"Run time" determine the implementatuib (method content)of equals() method
    Object s1 = new String("abcd");
    Object s2 = new String("abcd");
    System.out.println(s1.equals(s2));//true (Runtime:called String.equals() )

    Object s3 = new Object();
    Object s4 = new Object();
    System.out.println(s3.equals(s4));//false (Runtime:called Object.equals() )

  }
}