import java.util.concurrent.CompletableFuture;

public class comp {

  public static void main(String[] args) {
      // CompletableFuture<Integer> f1=
      //             CompletableFuture.supplyAsync(()->10)
      //             .thenApply(result -> result * 2);

      //  CompletableFuture<Void> f1=
      //             CompletableFuture.supplyAsync(()->10)
      //             .thenAccept(result -> System.out.println(result));

       CompletableFuture<Void> f1=
                  CompletableFuture.supplyAsync(()->10)
                  .thenRun(() -> System.out.println("Done"));

                  // try {
                  //     System.out.println(f1.get());
                  // } catch (Exception e) {
                  // }
  }

}
