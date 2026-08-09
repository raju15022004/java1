public class methods1 {

  public static void main(String[] args) {
      String s1=new String("Raju");
      String s2=new String("RAJU");

      // Length
      System.out.println(s1.length());
      System.out.println(s1.isEmpty());
      System.out.println(s1.isBlank());

      // character access

      System.out.println(s1.charAt(2));
      char[] arr=s1.toCharArray();

      // Comparison
      System.out.println(s1.equals(s2));
      System.out.println(s1.equalsIgnoreCase(s2));
  }

}
