package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
       var stream = Stream.of(List.of(1,2,3),List.of(4,5,6));
       stream  .flatMap(list-> list.stream())
               .forEach(n-> System.out.println(n));

    }
}
