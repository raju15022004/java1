// package Code__.Stack;

import java.util.ArrayList;
import java.util.List;

public class heap {
  public static void main(String[] args) {
      List<int[]> list=new ArrayList();

      int count=0;

      while (true) {
        list.add(new int[250000]);
        count++;
        System.out.println("Allocate Block : " + count);

      }
  }

}
