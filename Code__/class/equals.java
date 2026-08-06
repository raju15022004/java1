// package class;

public class equals {

  public static void main(String[] args) throws Exception {
      // Student s=new Student(101);
      // Student s2=new Student(101);

      // System.out.println(s1.equals(s2));
      //  System.out.println(s.hashCode());

      Student s1=new Student();
      Student s2=(Student) s1.clone();

      System.out.println(s1.id);
      System.out.println(s2.id);

      // Wait
      Object obj=new Object();

      myThread t=new myThread(obj);
      synchronized(obj){

        t.start();
        obj.wait();
        System.out.println("Main Thread Resumed");
        try {
          System.out.println("Waitung...");
          obj.wait(3000);
          System.out.println("wait Comleted");

        } catch (Exception e) {
          e.printStackTrace();
        }
      }
  }

}

class Student1{

  int id;

    Student1(int id) {
      this.id=id;
    }

    // equals
    @Override
    public boolean equals(Object obj){
      Student s=(Student) obj;

      return this.id==s.id;
    }

    // Hashcode
    @Override
    public int hashCode() {
    return id;
}
}

class Student implements Cloneable {

  int id=101;

  @Override
   protected Object clone() throws CloneNotSupportedException {

    return super.clone();
  }
}

class myThread extends Thread{

  Object obj;

    myThread(Object obj) {
      this.obj=obj;
    }

    public void run(){
      synchronized(obj){
        System.out.println("Thread Started");

        obj.notify();
        System.out.println("Thread Notified");
      }
    }

}
