package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
         //Streams from arbitary number of parameters
        var count =   Stream.of(1, "2324", 2)
                        .filter(v ->  ((Constable) v)
                                .getClass().isPrimitive() )
                        .count();
        System.out.println(count);
    }
}
