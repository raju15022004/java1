
import java.util.ArrayDeque;
import java.util.Queue;

// package Code__.Queue;

public class first {

  public static void main(String[] args) {
      Queue<Integer> queue=new ArrayDeque<>();

      queue.add(1);
      queue.add(2);
      queue.add(3);

      System.out.println(queue.peek());
      System.out.println(queue.element());
  }

}
