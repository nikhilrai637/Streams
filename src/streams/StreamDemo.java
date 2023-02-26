package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
    var stream = Stream.generate(()->Math.random());
    stream
            .limit(6)
            .forEach((n)-> System.out.println(n));


    }
}
