package basiclibrary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RollDice {

    public static ArrayList<Integer> roll(int n) {
        ArrayList<Integer> lastReturn = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            //  Random number Gen from Stack Overflow https://stackoverflow.com/questions/20389890/generating-a-random-number-between-1-and-10-java
            Random rand = new Random();
            int randomNum = rand.nextInt((6 - 1) +1) + 1;
            lastReturn.add(randomNum);
        }
        return lastReturn;
    }

    public static boolean containsDupes(ArrayList<Integer> arr) {
        HashSet<Integer> testing = new HashSet<>();

        for (int i = 0; i < arr.size(); i++) {
            testing.add(arr.get(i));
            if(testing.size() < i + 1) {
                return true;
            }
        }
        return false;
    }

    public static double averageArray(ArrayList<Integer> arr) {
        double finalAns;
        int sum = 0;

        for (Integer integer : arr) {
            sum += integer;
        }
        int size = arr.size();
        double dSize = sum;
        finalAns = dSize/size;
        return finalAns;
    }

    public static ArrayList<Integer> avgArrayOfArrays(ArrayList<ArrayList<Integer>> arr) {
        double sum = 999999999;
        ArrayList<Integer> returnedArr = null;
        for(ArrayList<Integer> element : arr) {
            double totes = averageArray(element);
            if(totes < sum) {
                sum = totes;
                returnedArr = element;
            }
        }
        return returnedArr;
    }
}
