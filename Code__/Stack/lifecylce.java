public class lifecylce {
  public static void main(String[] args) {
      Thread t1=new Thread(()->{
        System.out.println("Name of current thread is " + Thread.currentThread().getName());
      });
      System.out.println(t1.getState());

      t1.start();
      System.out.println(t1.getState());

      try{
        Thread.sleep(2000);
      }catch(Exception e){}

      System.out.println(t1.getState());
  }

}
