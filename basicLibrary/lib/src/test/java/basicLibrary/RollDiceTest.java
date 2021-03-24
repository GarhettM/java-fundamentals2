package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;

public class RollDiceTest {
    @Test
    public void RollDiceTest() throws Exception {

        ArrayList<Integer> testME = new ArrayList<>();
        ArrayList<Integer> testMEAgain = new ArrayList<>();

        testME = RollDice.roll(5);
        testMEAgain = RollDice.roll(56);

        for(int element: testME) {
            System.out.println(element);
        }
        assertEquals("Length of Array should be 5", testME.size(), 5);
        assertEquals("Length of Array should be 56", testMEAgain.size(), 56);

    }

    @Test
    public void testDupes() {

        ArrayList<Integer> testME = new ArrayList<>();
        ArrayList<Integer> testMEToo = new ArrayList<>();

        testME.add(2);
        testME.add(5);
        testME.add(7);
        testMEToo.add(5);
        testMEToo.add(4);
        testMEToo.add(7);
        testMEToo.add(5);

        assertFalse("Should be false", RollDice.containsDupes(testME));
        assertTrue("Should be true", RollDice.containsDupes(testMEToo));

    }

    @Test
    public void averages() {

        ArrayList<Integer> testME = new ArrayList<>();
        ArrayList<Integer> testMEToo = new ArrayList<>();

        testME.add(2);
        testME.add(5);
        testME.add(100);
        testMEToo.add(5);
        testMEToo.add(4);
        testMEToo.add(7);
        testMEToo.add(5);

        assertEquals(RollDice.averageArray(testME), 35.666666666666664, 1);
        assertEquals(RollDice.averageArray(testMEToo), 5.25, 1);
    }

    @Test
    public void avgArrayOfArrays() {

        ArrayList<ArrayList<Integer>> mainArray = new ArrayList<>();
        ArrayList<Integer> testME = new ArrayList<>();
        ArrayList<Integer> testMEToo = new ArrayList<>();

        testME.add(2);
        testME.add(5);
        testME.add(100);
        testMEToo.add(5);
        testMEToo.add(4);
        testMEToo.add(7);
        testMEToo.add(5);

        mainArray.add(testME);
        mainArray.add(testMEToo);

        assertEquals("testMeToo should be returned", testMEToo, RollDice.avgArrayOfArrays(mainArray));

    }
}
