package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
     Stream.iterate(1,n -> n+1)
                        .limit(10)
                        .forEach(n -> System.out.println(n));



    }
}
