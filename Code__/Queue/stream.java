// public package Code__.Queue;

import java.util.ArrayList;
import java.util.List;

public class stream {
  public static void main(String[] args) {
    List<Integer>list=new  ArrayList<>(List.of(1,4,11,13,34));

    list.stream()
        .filter(x -> x > 10)
        .filter(x -> x % 2 == 0)
        .forEach(System.out::println);
  }

}
