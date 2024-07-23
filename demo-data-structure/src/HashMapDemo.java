import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main(String[] args) {
    
    //key & value pair
    HashMap<Integer,String> nameMap = new HashMap<>();//key -> Integer,value -> String
    nameMap.put(100, "Vincent");
    // nameMap.put("Alan", 100);//NOT OK,violate the hashmao definition

    //We can get value by key
    System.out.println(nameMap.get(100));//Vincent

    //CANNOT get key by value
    // System.out.println(nameMap.get("Vincent"));

    //No ordering
    nameMap.put(1010, "Cindy");
    nameMap.put(-45, "Sally");
    System.out.println(nameMap.get(-45));//"Sally"

    //Key + Value -> Entry
    //A map consists of many entries

    //For LOOP -> HashMap.class
    //LOOP for entries
    for(Map.Entry<Integer , String> entry: nameMap.entrySet()){
      System.out.println("Key=" + entry.getKey() + " Value=" + entry.getValue());
    }

    //Handle duplicated key -> overwrite the value if the ket exists
    nameMap.put(1010, "Peter");//Cindy -> Peter
    System.out.println(nameMap);//{1010=Peter, 100=Vincent, -45=Sally}
    
    //null key
    nameMap.put(null, "Alan");
    System.out.println(nameMap);//{null=Alan, 1010=Peter, 100=Vincent, -45=Sally}
    //null also is a key

    nameMap.put(-45, null);
    System.out.println(nameMap);//{null=Alan, 1010=Peter, 100=Vincent, -45=null}

    //remove() 可以接住
    String oldValue = nameMap.remove(1010);//remove entry by key,然後會成個 1010=Peter delete左
    System.out.println(nameMap);//{null=Alan, 100=Vincent, -45=null}
    System.out.println(oldValue);//Peter

    System.out.println(nameMap.containsKey(-45));//true
    
    //Loop Keyset()
    for(Integer x : nameMap.keySet()){
      System.out.println(x);
    }

    for(String x : nameMap.values()){
      System.out.println(x);
    }

    System.out.println(nameMap.size());//3, entry

    System.out.println(nameMap.containsValue("Oscar"));//false
    System.out.println(nameMap.containsValue("Vincent"));//true

    System.out.println(nameMap.get(-45));//null
    //put get forloop 要練多d

  }
}