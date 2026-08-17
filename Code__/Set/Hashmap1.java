// package Set;

import java.util.HashMap;

public class Hashmap1 {

  public static void main(String[] args) {

    HashMap<Integer,String> map=new HashMap<>();

    map.put(101,"Raju");
    map.put(102, "Amit");
    map.put(103, "Rahul");

    // System.out.println(map);

    // System.out.println(map.get(101));
    // System.out.println(map.containsKey(102));
    // System.out.println(map.containsValue("Rahul"));

    // map.remove(103);
    // map.get(102);
    // map.size();
    // map.isEmpty();
    map.clear();
    System.out.println(map);
  }

}
