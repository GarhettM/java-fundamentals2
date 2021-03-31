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
    public void newMovieReview(String movie, String revAuthor, String body, int stars) {

        MovieReview newMovRev = new MovieReview(movie, revAuthor, body, stars);
        for (MovieClass listOfReview : listOfReviews) {
            if (listOfReview.getName().equals(newMovRev.getMovie())) {
                listOfReview.getListOfReviews().add(newMovRev);
                return;
            }
        }
        MovieClass newMovie = new MovieClass(movie);
        newMovie.getListOfReviews().add(newMovRev);
        listOfReviews.add(newMovie);
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
