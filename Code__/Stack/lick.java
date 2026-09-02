
import java.util.concurrent.atomic.AtomicReference;

public class lick {

  public static void main(String[] args) {

    LikeCounter likeCounter=new LikeCounter();

    Thread t1=new Thread(()-> likeCounter.like());
    Thread t2=new Thread(()-> likeCounter.like());
    Thread t3=new Thread(()-> likeCounter.like());
    Thread t4=new Thread(()-> likeCounter.like());
    Thread t5=new Thread(()-> likeCounter.like());
    Thread t6=new Thread(()-> likeCounter.like());
    Thread t7=new Thread(()-> likeCounter.like());
    Thread t8=new Thread(()-> likeCounter.like());
    Thread t9=new Thread(()-> likeCounter.like());
    Thread t10=new Thread(()-> likeCounter.like());

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();
    t6.start();
    t7.start();
    t8.start();
    t9.start();
    t10.start();

    try{
      Thread.sleep(2000);
    }catch(Exception e){}
    System.out.println("Total likes" +likeCounter.getTotalLike());
  }

}

class LikeCounter{
  AtomicReference<Integer> totalCount=new AtomicReference<>(0);

  public void like(){

    Integer currentCount;
    Integer finalCount;
    while(true){

      currentCount=totalCount.get();

      finalCount=currentCount+1;

      if(totalCount.compareAndSet(currentCount, finalCount)){
        return;
      }

      System.out.println("Conflict detected. Re-trying...");
    }
  }

  public int getTotalLike(){
    return  totalCount.get();
  }
}
