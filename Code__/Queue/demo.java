
import java.util.PriorityQueue;

// package Code__.Queue;

public class demo {

  public static void main(String[] args) {
      PriorityQueue<Integer> pq=new PriorityQueue<>();

      pq.add(10);
      pq.add(20);
      pq.add(30);
      pq.add(40);
      pq.add(50);

      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());
      System.out.println(pq.poll());

      PriorityQueue<Integer> pq2=new PriorityQueue<>((a,b)->b-a);

      pq2.add(10);
      pq2.add(20);
      pq2.add(30);
      pq2.add(40);
      pq2.add(50);

      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());
      System.out.println(pq2.poll());

  }

}
