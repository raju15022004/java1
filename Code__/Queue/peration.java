
import java.util.Optional;

public class peration {

  public static void main(String[] args) {
    Optional<String> name=getName();

    // System.out.println("Unknown");
  }

  public static Optional<String> getName(){
    return Optional.ofNullable("Raju");
  }

}
