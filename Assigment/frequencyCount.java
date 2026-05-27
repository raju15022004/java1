public class frequencyCount {

  static void frequencyCount(String s){
    if(s == null || s.isEmpty()){
      return;
    }

    int[] count =new int[256];

    for(int i=0;i<s.length();i++){
      count[s.charAt(i)]++;
    }

    for(int i=0;i<s.length();i++){
      char ch=s.charAt(i);

      if(count[ch] !=0 && ch !=' '){
        System.out.println(ch +" = " + count[ch]);
        count[ch]=0;
      }
    }
  }

  public static void main(String[] args) {
      String s="banana";
      frequencyCount(s);
  }

}
