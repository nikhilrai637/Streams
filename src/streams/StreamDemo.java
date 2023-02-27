package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
       List<Movie>movieList = List.of(new Movie("z",9)
                            ,new Movie("b",10)
                            ,new Movie("b",10)
                            ,new Movie("y",30)
                            ,new Movie("d",20));

     var result =   movieList.stream()
             .map(Movie::getLikes)
             .reduce((a,b)->a +b);

        System.out.println(result.orElse(0));





    }
}
