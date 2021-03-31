package inheritance;

import org.junit.Test;

public class TheaterTest {

    @Test
    public void theaterAddTest() {
        Theater testTheater = new Theater("Garhetts Theater", 2);

        testTheater.newMovieReview("Interstellar", "Joe", "Movie rocked my socks", 4);
        testTheater.newMovieReview("Interstellar", "Garhett", "Amazing Movie", 5);
        testTheater.newMovieReview("Tulip", "Brittany", "Movie rocked my socks", 3);

        System.out.println(testTheater.getListOfReviews().get(0).listOfReviews.get(0).stars);
        System.out.println(testTheater.getListOfReviews().get(0).listOfReviews.get(1).stars);
        System.out.println(testTheater.getListOfReviews().get(0).avgStars);
    }
}
