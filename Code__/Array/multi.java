// package Array;

public class multi {
  public static void main(String[] args){

    //  int [][] marks=new int[3][3];
    //  marks[0][0]=20;
    //  marks[0][1]=21;
    //  marks[0][2]=23;

    //  marks[1][0]=24;
    //  marks[1][1]=25;
    //  marks[1][2]=26;

    //  marks[2][0]=27;
    //  marks[2][1]=28;
    //  marks[2][2]=29;

    //  for(int row=0; row<3; row++ ){
    //   for(int col=0; col<3; col++){
    //     System.out.print(marks[row][col] + " ");
    //   }
    //   System.out.println();
    //  }


    int[][] marks=new int[3][];

    marks[0]=new int[1];
    marks[1]=new int[2];
    marks[2]=new int[3];

    marks[0][0]=23;

    marks[1][0]=24;
    marks[1][1]=90;

    marks[2][0]=12;
    marks[2][1]=78;
    marks[2][2]=45;

    for(int row=0; row<marks.length; row++){
      for(int col=0; col<marks[row].length;col++){
        System.out.print(marks[row][col] +" ");
      }

      System.out.println();
    }

  }

}
