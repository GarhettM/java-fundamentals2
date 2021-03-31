package inheritance;

import org.junit.Test;

public class TheaterTest {

    @Test
    public void theaterAddTest() {
        Theater testTheater = new Theater("Garhetts Theater", 2);

        testTheater.newMovieReview("Interstellar", "Joe", "Movie rocked my socks", 4);
        testTheater.newMovieReview("Interstellar", "Garhett", "Amazing Movie", 5);
        testTheater.newMovieReview("Tulip", "Brittany", "Movie rocked my socks", 3);

        System.out.println(testTheater.getListOfReviews().get(1).getListOfReviews().get(0).movie);
    }
}
