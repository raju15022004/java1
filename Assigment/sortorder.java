public class sortorder {

  static void sortorder(String s){
    if(s == null || s.isEmpty()){
      return;
    }

    char[] arr = s.toCharArray();

    //bubble sort
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr.length-1;j++){
        if(arr[j]>arr[j+1]){
          char temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    System.out.println(new String(arr));
  }

  public static void main(String[] args) {
      String s="raju kumar";
      sortorder(s);
  }

}
