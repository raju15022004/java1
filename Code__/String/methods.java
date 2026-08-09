public class methods{
  public static void main(String[] args){

    String s1=new String();

    String s2=new String("hello");

    String s3="Raju";
    String s4=new String(s3);

    // char array

    char[] arr={'A','d','i','t','y','a'};
    String s5=new String(arr);

    System.out.println(s3);

    String s6=new String(arr,0,6);

    byte[] arr2={97,98,99};
    String s7=new String(arr2,0,2);

    System.out.println(s7);
  }
}
