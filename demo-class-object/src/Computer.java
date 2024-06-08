public class Computer {
  private int ram;
  private String cpu;
  private String display;
  private int storage;

  public Computer(){

  }

  public Computer(int ram,int storage,String cpu,String display){
    this.ram = ram;
    this.storage = storage;
    this.cpu = cpu;
    this.display = display;
  }

  public void setRam(int ram){
    this.ram = ram;
  }

  public void setCPU(String cpu){
    this.cpu = cpu;
  }

  public void setDisplay(String display){
    this.display = display;
  }

  public void setStorage(int storage){
    this.storage = storage;
  }

  public String getRam(){
    return "Memory:" + this.ram + "Gb Ram";
  }

  public String getCpu(){
    return "Processor:" + this.cpu;
  }
  
  public String getDisplay(){
    return "Graphic Card:" + this.display;
  }

  public String getStorage(){
    return "Storage:" + this.storage + "Gb";
  }

  public String getSpec(){
    return "Processor:" + this.cpu + "  Memory:" + this.ram + "Gb Ram" + "  Graphic Card:" + this.display + "  Storage:" + this.storage + "Gb";
  }

  public static void main(String[] args) {
    Computer c1 = new Computer();
    c1.setRam(16);
    System.out.println(c1.getRam());

    c1.setCPU("i13700K");
    System.out.println(c1.getCpu());

    c1.setDisplay("RTX 4070");
    System.out.println(c1.getDisplay());

    c1.setStorage(512);
    System.out.println(c1.getStorage());
    System.out.println(c1.getSpec());

    Computer c2 = new Computer(128, 256, "i14700K", "RTX 4090");
    System.out.println(c2.getDisplay());
    System.out.println(c2.getRam());
    System.out.println(c2.getStorage());
    System.out.println(c2.getCpu());
    System.out.println(c2.getSpec());
    
  }
}
