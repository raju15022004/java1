
import java.util.ArrayList;
import java.util.List;

public class terminal {
  public static void main(String[] args) {
      List<Integer> list = new ArrayList<>(List.of(1,13,11,9));

      List<Integer> list2=list.stream()
          .map(x -> x + 2)
          .toList();

          System.out.println(list2);
  }

}
