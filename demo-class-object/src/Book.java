public class Book {
  private String title;
  private int pages;
  private int weight;
  private String author;


  //instance method(object method)
  public void setTitle(String title){
    this.title = title;
  }
  
  public void setPages(int pages){
    this.pages = pages;
  }

  public void setWeight(int weight){
    this.weight = weight;
  }

  public void setAuthor(String author){
    this.author = author;
  }

  public String gettitle(){
    return this.title;
  }

  public int getpages(){
    return this.pages;
  }

  public int getweight(){
    return this.weight;
  }

  public String getAuthor(){
    return this.author;
  }


  //static method belongs to class
  //the purpose of static method -> produce something by the intput parameters
  public static String hello(){
    return "hello";
  }
  //static method
  public static void main(String[] args) {

    //instance method belong to object
    Book book1 = new Book();
    book1.setAuthor("John");
    book1.setPages(300);
    book1.setTitle("bootcamp");
    



  }
  
}
