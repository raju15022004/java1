import java.util.TreeSet;

public class tree1{

  public static void main(String[] args) {

    TreeSet<Integer> set=new TreeSet<>();

    set.add(80);
    set.add(23);
    set.add(10);
    set.add(80);
    set.add(50);

    System.out.println(set.first());
  }
}
