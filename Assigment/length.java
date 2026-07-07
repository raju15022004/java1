public class length {

  static int length(String s){
    if(s == null){
      return 0;
    }

    int count=0;

    for(char ch : s.toCharArray()){
      count++;
    }

    return count;
  }

  public static void main(String[] args) {
      String s=" raju kumar ";
      System.out.println(length(s));
  }
}
