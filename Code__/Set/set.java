// package Set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class set {

  public static void main(String[] args) {
      Set<String> set=new HashSet<>();

      set.add("Raju");
      set.add("Rahul");
      set.add("Raj");

      System.out.println(set.contains("Raju"));

      Map<Integer,String> map=new HashMap<>();

      map.put(101, "Raju");
      map.put(102, "Rahul");
      map.put(103, "Raj");

      System.out.println(map.containsKey(101));
      System.out.println(map.get(102));


  }

}
