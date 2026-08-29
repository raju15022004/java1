public class thread1 {
  public static void main(String[] args) {
      // System.out.println(Thread.currentThread().getName());
      // System.out.println(Thread.currentThread().getId());

      // Thread t1=new Thread(()->{
      //   System.out.println("Name of my thread is"+Thread.currentThread().getName());
      //   System.out.println("Id of my thread is"+Thread.currentThread().getId());

      // });

      // Thread t2=new Thread(()->{
      //   System.out.println("Name of my 2nd thread is"+Thread.currentThread().getName());
      //   System.out.println("Id of my 2nd thread is"+Thread.currentThread().getId());

      // });

        // t1.start();
        // t2.start();


        Thread t1=new Thread(() ->{
           System.out.println("Current thread is" + Thread.currentThread().getName());

        });
        // t1.start();
        t1.run();
  }

}
