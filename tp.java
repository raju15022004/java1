// public class tp{

//   int x;
//   int y;

//   // temp(){
//   //  x=20;
//   //  y=30;
//   // }

//   void show(){
//     System.out.println(x);
//     System.out.println(y);
//   }

//   public static void main(String[] args) {
//       temp t1=new temp();
//       t1.show(10);

//       temp t2=new temp();
//       t2.show(25);
//   }
// }


//////////////////////////////////////

public class tp{

  int x=getx();
  int getx()
{
  System.out.println(x);
  return 20;

}
void temp()
{
  x=20;
  x=getx();
  System.out.println(x);
}

public static void main(String[] args){
  temp t1=new temp();
  t1.show(20);
}
}


