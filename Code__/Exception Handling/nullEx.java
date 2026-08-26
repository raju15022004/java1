public class nullEx {

  public static void main(String[] args) {
      try {

        // System.out.println(5/0);
          String s=null;
          s.length();

      } catch (ArithmeticException e) {
        System.out.println("Divide by zero is not allowed");
      }
      catch(NullPointerException e){
        System.out.println("Nulls are not allowed");
      }
      catch(Exception e){
        System.out.println("Some generice Exception");
      }
  }

}
