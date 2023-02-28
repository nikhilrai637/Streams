package streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void show() {
        List<Movie> movieList = List.of(new Movie("z", 9, Genre.ACTION)
                , new Movie("b", 10, Genre.COMEDY)
                , new Movie("t", 10, Genre.COMEDY)
                , new Movie("y", 30, Genre.THRILLER)
                , new Movie("d", 20, Genre.ACTION));

       var result =  movieList.stream()
                        .collect(Collectors.partitioningBy(movie -> movie.getLikes()>10,
                                Collectors.mapping(Movie::getTitle,
                                        Collectors.joining(","))));

        System.out.println(result);
    }
}
