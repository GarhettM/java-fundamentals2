package inheritance;

import java.util.ArrayList;

public class Theater implements MovieReviewable{
    String name;
    int priceCat;
    ArrayList<MovieClass> listOfReviews = new ArrayList<>();

    public Theater(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }

    @Override
    public void newMovieReview(String movie, String revAuthor, String body, int stars) {

        MovieReview newMovRev = new MovieReview(movie, revAuthor, body, stars);
        for (MovieClass listOfReview : listOfReviews) {
            if (listOfReview.getName().equals(newMovRev.getMovie())) {
                updateStars(listOfReview, stars);
                listOfReview.getListOfReviews().add(newMovRev);
                return;
            }
        }
        MovieClass newMovie = new MovieClass(movie);
        newMovie.getListOfReviews().add(newMovRev);
        updateStars(newMovie, stars);
        listOfReviews.add(newMovie);
    }

    public void updateStars(MovieClass movie, int stars) {
        movie.sumOfStars += stars;
        movie.numOfReviews++;
        movie.avgStars = this.avgStars(movie.sumOfStars, movie.numOfReviews);
    }

    public double avgStars(int sum, int num) {
        double k = (double)sum / (double)num;
        return k;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

    public ArrayList<MovieClass> getListOfReviews() {
        return listOfReviews;
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", priceCat=" + priceCat +
                ", listOfReviews=" + listOfReviews +
                '}';
    }
}
