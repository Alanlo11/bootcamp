import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import sorting.Customer;

public class ArrayListDemo {
    public static void main(String[] args) throws Exception {
    Integer[] integers = new Integer[] {2,10,-4};//autobox
    //for-each
    int sum = 0;
        for(Integer i : integers){
            sum += i;
        }
        System.out.println(sum);

        //remove 10,and re-create array -> [2,-4]
        // Integer[] temp = new Integer[integers.length - 1];

        //ArrayList
        ArrayList<Integer> integers2 = new ArrayList<Integer>(); //call constructor of ArrayList.class
        integers2.add(2);
        integers2.add(10);
        integers2.add(-4);
        sum = 0;
        for(Integer i : integers2){
            sum += i;
        }
        System.out.println(sum);//8

        //Difference between Integer[] and ArrayList<Integer>
        //1.Initialization: Array (fixed length),ArrayList (variable length)
        //2.Underlying structure: Array already a raw DS(data structure) in JAVA,ArrayList is a class(array)

        System.out.println(integers2.size());//3
        integers2.remove(1);//10
        System.out.println(integers2);//2,-4

        integers2.set(1, -100);
        System.out.println(integers2);//2,-100

        System.out.println(integers2.contains(2));//true

        System.out.println(integers2.indexOf(-100));//1
        System.out.println(integers2.indexOf(-1000));//-1

        integers2.add(2);//[2, -100, 2]
        System.out.println(integers2.indexOf(2));//0,只會show第一個2位置

        System.out.println(integers2.lastIndexOf(2));//2,呢個係show最後一個2位置

        System.out.println(integers2.subList(1, 3));//from index 1 to index 2 (3-1) -> [-100, 2]
        System.out.println(integers2);//[2, -100, 2]

        //addAll()
        ArrayList<Integer> integers3 = new ArrayList<Integer>();
        System.out.println(integers3.isEmpty());//true
        integers3.addAll(integers2);
        System.out.println(integers3.isEmpty());//false
        integers3.removeAll(integers3);
        System.out.println(integers3.isEmpty());//true

        //get(), get by index
        System.out.println(integers2.get(0));//2

        //Q1.Given String[],remove those string with length > 3
        String[] stringArray = new String[]{"anc","a","",null,"aaaa"};

        ArrayList<String> result = new ArrayList<>();
        for(String x : stringArray){
            if(x!=null && x.length() > 3 )
                result.add(x);
        }
        System.out.println(result);//[aaaa]

        //Q2.Given Person[],retrieve all person object with age > 30 or name start with "J"
        Customer[] customers = new Customer[]{new Customer(40, "Mary"),new Customer(31, "John"),new Customer(29, "Jason"),new Customer(29, "Cindy")};
        ArrayList<Customer> customersList = new ArrayList<>();
        for(Customer c : customers){
            if(c.getName() != null && c.getAge() > 30 || c.getName().startsWith("J"))
            customersList.add(c);
        } 
        System.out.println(customersList);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add("abc");
        objects.add(1);
        objects.add(LocalDate.of(2024, 5, 22));
        objects.add(new HKID("A1234567"));

        //Polymorephism Part 2: runtime -> implementation
        for(Object obj : objects){
            if (obj.equals(new String("abc"))){//call String object equals(),so it's true
                System.out.println("hello");
            } else if (obj.equals(new HKID("A1234567"))){//HKID object equals()
                System.out.println("hello2");
            } else if (obj.equals(new Integer(1))){//Integer object equals()
                System.out.println("hello3");
            } else if (obj.equals(LocalDate.of(2024, 5, 22))){//LocalDate equals()
                System.out.println("hello4");
            }
        }

        //print
        //check if  the object equals to xxx...
        //Compare the difference between ArrayList<Object> and ArrayList<String>



    }
}