package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void restTest() {
        Restaurant testRest = new Restaurant("Garhetts Place", 2);

        testRest.newReview("Garhett", "This food sucks", 2);
        testRest.newReview("Joe", "This food is awesome", 5);
        assertEquals(3, testRest.getAvgStars(), 1);
    }
}
