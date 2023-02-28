package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamDemo {
    public static void show() {
        IntStream.range(1,5).
                forEach(System.out::println);

        IntStream.rangeClosed(1,5).
                forEach(System.out::println);

    }
}
