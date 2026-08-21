
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;


public class function1 {
  public static void main(String[] args) {

    Function<Integer, Integer> square=x -> x * x;

    // System.out.println(square.apply(5));

    Consumer<Integer> print = x -> System.out.println(x);
    // print.accept(7);

    Supplier<Double> randomValue=() -> Math.random();

    System.out.println(randomValue.get());
  }

}
