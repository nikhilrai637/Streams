package streams;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
          int[] numbers = {1,2,3};
        Arrays.stream(numbers).forEach(n -> System.out.println(n));
    }
}
