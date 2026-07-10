public class find {

  static boolean find(String s1,String s2){
    if(s1 == null || s2 == null){
      return false;
    }

    int n=s1.length();
    int m=s2.length();

    if(n>m){
      return false;
    }

    for(int i=0;i<=m-n;i++){
      int j;

      for(j=0;j<n;j++){
        if(s2.charAt(i+j) != s1.charAt(j)){
          break;
        }
      }

      if(j==n){
        return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
      String s1="raju  ";
      String s2="raju Kumar";
      System.out.println(find(s1, s2));
  }

}
