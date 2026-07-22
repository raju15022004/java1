import java.util.HashSet;

class Hash{

  public static void main(String[] args) {
      HashSet<String>al=new HashSet<String>();
      System.out.println(al.size());
      al.add("a");
      al.add("b");
      al.add("d");
      System.out.println(al.add("c"));
      System.out.println(al.size());
      System.out.println(al);
  }
}
