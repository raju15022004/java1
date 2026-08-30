

public class lock {

  public static void main(String[] args) {

    Counter d1=new Counter();
    Counter d2=new Counter();

    Thread t1=new Thread(()->{
      d1.increament();
    },"Thread-1");

    Thread t2=new Thread(()->{
     d2.increament();
    },"Thread-2");

        System.out.println();


    t1.start();
    t2.start();
  }

}

// class Demo{

//   synchronized void display(){
//     for(int i=1;i<=5;i++){
//       System.out.println(Thread.currentThread().getName()+" : " + i);
//     }
//   }
// }


class Counter{
  int count=0;

  private final Object lock=new Object();

  void increament(){
    synchronized(lock){
      count++;
    }
  }
}
