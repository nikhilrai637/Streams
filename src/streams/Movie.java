package streams;

public class Movie {
    String title;
    int likes;

    public Movie(String title, int likes) {
        this.title = title;
        this.likes = likes;
    }

    public int getLikes() {
        return  this.likes;
    }
}
