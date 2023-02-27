package streams;
import java.io.Serializable;
import java.lang.constant.Constable;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
      List<Movie> movieList = List.of(
                             new Movie("a",10)
                            ,new Movie("b",12)
                            ,new Movie("c",13)
                            ,new Movie("d",9));

      movieList.stream().map(movie -> movie.getTitle())
                        .forEach(s -> System.out.println(s));
    }
}
