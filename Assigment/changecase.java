public class changecase {

  static String changecase(String s){
    if(s == null){
      return null;
    }

    String result="";

    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      //lowercase -> uppercase
      if(ch >= 'a' && ch <='z'){
        result=result + (char)(ch-32);
      }

      //uppercase -> lowercase
      else if(ch >= 'A' && ch <= 'Z'){
        result=result+(char)(ch+32);
      }
      else{
        result=result+ch;
      }
    }
    return result;
  }

  public static void main(String[] args) {
      String s="raju kumar ";
      System.out.println(changecase(s));
  }System.out.println(changecase(s));

}
