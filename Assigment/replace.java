public class replace {

  static String replace(String s1,String s2,String s3){
    if(s1 == null || s2 == null || s3 == null){
      return null;
    }

    String result="";
    int n=s1.length();
    int m=s2.length();

    for(int i=0; i<n; i++){

      if(i <=n-m){
        int j;

        for(j=0;j<m;j++){
          if(s1.charAt(i+j) !=s2.charAt(j)){
            break;
          }
        }

        if(j==m){
          result=result+s3;
          i=i+m-1;
          continue;
        }
      }

      result=result+s1.charAt(i);
    }
    return result;


  }

  public static void main(String[] args) {
      String s1="raju kumar";
      String s2="raju Kumar";
      String s3="raj kumar";

      System.out.println(replace(s1, s2, s3));
  }

}
