
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class future {

  public static void main(String[] args) {

    ExecutorService executor=Executors.newFixedThreadPool(2);

    Future<Integer> f1=executor.submit(()-> 10);

    try {
        System.out.println(f1.get());
    } catch (Exception e) {
    }
  }

}
