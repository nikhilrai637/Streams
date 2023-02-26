package streams;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
         List<Movie>movieList = List.of(
                    new Movie("a",10),
                    new Movie("b",11),
                    new Movie("d",5)
         );

         int count = 0;
         //Imperative Programming
         for(var i = 0 ; i<movieList.size();i++){
              if(movieList.get(i).getLikes() > 10 )
                  count++;
         }
        System.out.println(count);

         //Declarative Functional Programming
         var count2  = movieList.stream().filter(mv -> mv.getLikes() > 10).count();
        System.out.println(count2);
    }

}
