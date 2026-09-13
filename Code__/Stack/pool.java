
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class pool {

  public static void main(String[] args) {
      ThreadPoolExecutor executor=new  ThreadPoolExecutor(2, 5, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(5));

      for(int i=1; i<5; i++){
        int taskId=i;

        executor.execute(()->{
          System.out.println("Task"+ taskId +"is perfromed by" +Thread.currentThread().getName());

          try {
               Thread.sleep(200);
          } catch (Exception e) {
          }
        });

      }
      executor.shutdown();

  }

}
