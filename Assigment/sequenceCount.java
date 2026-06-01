public class sequenceCount {

  static void sequenceCount(String s){
    if(s == null || s.isEmpty()){
      return;
    }

    int[] count = new int [256];

    //count store karo
    for(int i=0;i<s.length();i++){
      count[s.charAt(i)]++;
    }

    //print unique characters + count
    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if(count[ch] !=0){
        System.out.println(ch + " = " + count[ch]);
        count[ch]=0;
      }
    }
  }

  public static void main(String[] args) {
      String s="raj";
      sequenceCount(s);
  }

}
