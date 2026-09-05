
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class task {

  public static void main(String[] args) {

    int arr[]={1,2,3,4,5,6,7,8};

    ForkJoinPool pool=new ForkJoinPool();

    SumTask task=new SumTask(arr, 0, arr.length-1);

    int result=pool.invoke(task);

    System.out.println(result);

    pool.shutdown();

  }

}

class SumTask extends RecursiveTask<Integer> {

  private int[] arr;
  private  int start;
  private int end;

  public SumTask(int [] arr,int start, int end){
    this.arr=arr;
    this.start=start;
    this.end=end;
  }

  @Override
  protected Integer compute(){
    if(end - start <=2){
      int sum=0;
      for(int i=start; i<=end; i++){
        sum +=arr[i];
      }
      return sum;
    }

    int mid=(start + end)/2;
    SumTask lefTask=new SumTask(arr, mid, mid);
    SumTask righTask=new SumTask(arr, mid, mid);

    lefTask.fork();

    int sum2=righTask.compute();
    int sum1=lefTask.compute();

    return sum1+sum2;
  }
}
