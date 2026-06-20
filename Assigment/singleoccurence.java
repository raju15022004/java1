public class singleoccurence {

  static String singleoccurence(String s){
    if(s == null || s.isEmpty()){
      return "";

    }

    String result="";
    result=result+s.charAt(0);

    for(int i=1;i<s.length();i++){
      if(s.charAt(i) !=s.charAt(i-1)){
        result=result+s.charAt(i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
      String s="rraajj";
      System.out.println(singleoccurence(s));
  }

}
