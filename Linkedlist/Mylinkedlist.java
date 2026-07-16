// package Linkedlist;

 class link {
  public int iData;
  public link next;

  public link(int id){
    iData=id;

  }

  public String toString(){
    return "("+iData+")";
  }

}

class linklist{
 private link first;

 public linklist(){
  first=null;
 }

 public boolean isEmpty(){
  return (first == null);
 }

 public void inserfirst(int id){
  link newlink=new link(id);
  newlink.next=first;
  first = newlink;
 }

 public link deletefirst(){
  link temp = first;
  first=first.next;
  return temp;
 }

 public String toString(){
  String str="";
  link current=first;
  while(current !=null){
  str +=current.toString();
  current=current.next;
  }
  return str;
 }
}

public class Mylinkedlist{

  public static void main(String[] args) {
     linklist thelist=new linklist();

     thelist.inserfirst(22);
     thelist.inserfirst(44);
     thelist.inserfirst(66);
     thelist.inserfirst(88);

     System.out.println(thelist);
     System.out.println(thelist.deletefirst());
     System.out.println(thelist);
     while(!thelist.isEmpty()){
      link alink=thelist.deletefirst();
      System.out.print("Deleted" + alink);
      System.out.println("");
     }
     System.out.println(thelist);
  }
}
