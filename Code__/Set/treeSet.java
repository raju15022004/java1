
import java.util.TreeSet;

// package Set;

public class treeSet {

  public static void main(String[] args) {

    TreeSet<Integer> set=new TreeSet<>();

    set.add(10);
    set.add(20);
    set.add(30);
    set.add(40);
    set.add(50);

    System.out.println("first: " + set.first());
    System.out.println("Last: " + set.last());

    System.out.println("Lower: " + set.lower(30));
    System.out.println("Higher: " + set.higher(30));

    System.out.println("Floor: " + set.floor(35));
    System.out.println("Ceiling: " + set.ceiling(35));
  }

}
