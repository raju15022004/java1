
import java.util.ArrayList;
import java.util.List;

public class list {

  public static void main(String[] args) {
      List<Integer> list=new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(3);

      System.out.println(list.get(1));

      list.set(1, 5);
      list.addAll(0,List.of(9,8,7));
      System.out.println(list );


  }
}
