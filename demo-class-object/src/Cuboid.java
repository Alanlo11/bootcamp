public class Cuboid {
  private int Long;
  private int wide;
  private int tall;

  public Cuboid(){

  }

  public Cuboid(int Long,int wide,int tall){
    this.Long = Long;
    this.wide = wide;
    this.tall = tall;
  }

  public void setLong(int Long){
    this.Long = Long;
  }

  public void setWide(int wide){
    this.wide = wide;
  }

  public void setTall(int tall){
    this.tall = tall;
  }

  public String getLong(){
    return "Long is:" + this.Long;
  }

  public String getWide(){
    return "Wide is:" + this.wide;
  }

  public String getTall(){
    return "Tall is:" + this.tall;
  }

  public String getSize(){
    return "Long is:" + this.Long + " Wide is:" + this.wide + " Tall is:" + this.tall;
  }

  public String getSurfaceArea(){
    return "Surface Area is:" + (this.Long * this.wide + this.wide * this.tall + this.Long * this.tall) * 2;
  }

  public String getVolume(){
    return "Volume is:" + this.wide * this.Long * this.tall;
  }

  public static void main(String[] args) {
    
    Cuboid c1 = new Cuboid();
    c1.setLong(20);
    c1.setWide(17);
    c1.setTall(30);
    System.out.println(c1.getLong());//20
    System.out.println(c1.getWide());//17
    System.out.println(c1.getTall());//30
    System.out.println(c1.getSize());//20,17,30
    System.out.println(c1.getSurfaceArea());//340,510,600 * 2 = 2900
    System.out.println(c1.getVolume());//10200

    Cuboid c2 = new Cuboid(10, 5, 15);
    System.out.println(c2.getLong());
    System.out.println(c2.getWide());
    System.out.println(c2.getTall());
    System.out.println(c2.getSize());
    System.out.println(c2.getSurfaceArea());
    System.out.println(c2.getVolume());
  }
  
}
