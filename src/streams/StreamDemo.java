package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
       List<Movie>movieList = List.of(new Movie("a",9)
                            ,new Movie("b",10)
                            ,new Movie("c",12)
                            ,new Movie("d",29));

        Predicate<Movie> isPopular = movie -> movie.getLikes()>10;
       movieList.stream()
                .filter(isPopular)
                .forEach(movie -> System.out.println(movie.getTitle()));



    }
}
