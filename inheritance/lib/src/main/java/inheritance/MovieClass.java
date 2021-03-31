package inheritance;

import java.util.ArrayList;

public class MovieClass {
    String name;
    int numOfReviews = 0;
    int sumOfStars = 0;
    ArrayList<MovieReview> listOfReviews = new ArrayList<>();
    double avgStars;

    public MovieClass(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    public int getSumOfStars() {
        return sumOfStars;
    }

    public void setSumOfStars(int sumOfStars) {
        this.sumOfStars = sumOfStars;
    }

    public double getAvgStars() {
        return avgStars;
    }

    public void setAvgStars(double avgStars) {
        this.avgStars = avgStars;
    }

    public ArrayList<MovieReview> getListOfReviews() {
        return listOfReviews;
    }
}
