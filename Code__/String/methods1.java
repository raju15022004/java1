public class methods1 {

  public static void main(String[] args) {
      String s1=new String("Raju");
      String s2=new String("Raju");

      // Length
      // System.out.println(s1.length());
      // System.out.println(s1.isEmpty());
      // System.out.println(s1.isBlank());

      // character access
      // System.out.println(s1.charAt(2));
      // char[] arr=s1.toCharArray();

      // Comparison
      // System.out.println(s1.equals(s2));
      // System.out.println(s1.equalsIgnoreCase(s2));

      // Lexicographical comparison --> Dictionary
      // System.out.println(s1.compareTo(s2));

      // Searching
      // System.out.println(s1.contains("ju"));
      // System.out.println(s1.indexOf("ju"));
      // System.out.println(s1.lastIndexOf("ju"));
      // System.out.println(s1.startsWith("Ra"));

      // Extractioon / transformation
      // System.out.println(s1.substring(1));
      // System.out.println(s1.toUpperCase());
      // System.out.println(s1.trim());

      // System.out.println(s1.replace('a', 'j'));

      // String s3="Raju,sonam";
      // String[] arr=s3.split(",");

      // for(String s: arr){
      //   System.out.println(s);

      // }

      // System.out.println(String.join("-", "a","b","c"));

      // Conversion
      // String s4=new String(String.valueOf(4));

      // byte[] arr=s1.getBytes();
      // for(byte i : arr){
      //   System.out.print(i + " ,");
      // }

      // Advance --> intern(), format()

      String s5=new String("hello");
      String s6=s5.intern();

      System.out.println(s5 == s6);
  }

}
