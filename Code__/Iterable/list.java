

// public class list {

//   public static void main(String[] args) {
//       List<Integer> list=new ArrayList<>();
//       list.add(1);
//       list.add(2);
//       list.add(3);

//       System.out.println(list.get(1));

//       list.set(1, 5);
//       list.addAll(0,List.of(9,8,7));
//       System.out.println(list );


//   }
// }


// public class list{

//   public static void main(String[] args) {
//       LinkedList<String> names=new LinkedList<>();

//       names.add("Raju");
//       names.add("Raj");
//       names.add("Rahul");



//       // names.addFirst("vikash");
//       // names.addLast("sumit");

//       // System.out.println(names);

//       // names.removeFirst();
//       // names.removeLast();

//       names.getFirst();
//       names.getLast();

//       System.out.println(names);

//   }
// }

import java.util.Stack;

public class list{

  public static void main(String[] args) {


      // Vector<Integer> numbers=new Vector<>();
      // numbers.add(10);
      // numbers.add(20);
      // numbers.add(30);

      // System.out.println(numbers);

      // System.out.println(numbers.get(1));

      // numbers.remove(0);
      // System.out.println(numbers);


      /////////////////////////
      Stack<Integer> stack=new Stack<>();

      stack.push(10);
      stack.push(20);
      stack.push(30);

      // System.out.println(stack);

      System.out.println("Top:" + stack.peek());

      System.out.println("Search" + stack.pop());



      System.out.println(stack);
  }
}
