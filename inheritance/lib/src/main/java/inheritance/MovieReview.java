package inheritance;

public class MovieReview extends Review{
    String movie;

    public MovieReview(String movie, String revAuthor, String body, int stars) {
        super(revAuthor, body, stars);
        this.movie = movie;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }



}
