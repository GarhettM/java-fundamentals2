package inheritance;

import java.util.ArrayList;

public class Restaurant implements Reviewable{
    String name;
    int numOfReviews = 0;
    int sumOfStars = 0;
    ArrayList<Review> listOfReviews = new ArrayList<>();
    double avgStars;
    int priceCat;

    public Restaurant(String name, int priceCat) {
        this.name = name;
        this.priceCat = priceCat;
    }

    public void addRev(String revAuthor, String revBody, int stars) {
        Review newRev = new Review(revAuthor, revBody, stars);
        listOfReviews.add(newRev);

        this.sumOfStars += stars;
        this.numOfReviews++;

        this.avgStars = this.avgStars(this.sumOfStars, this.numOfReviews);
    }

    @Override
    public void newReview(String revAuthor, String body, int stars) {
        Review newRev = new Review(revAuthor, body, stars);
        listOfReviews.add(newRev);

        this.sumOfStars += stars;
        this.numOfReviews++;

        this.avgStars = this.avgStars(this.sumOfStars, this.numOfReviews);
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

    public int getNumOfReviews() {
        return numOfReviews;
    }

    public void setNumOfReviews(int numOfReviews) {
        this.numOfReviews = numOfReviews;
    }

    public ArrayList<Review> getListOfReviews() {
        return listOfReviews;
    }

    public void setListOfReviews(ArrayList<Review> listOfReviews) {
        this.listOfReviews = listOfReviews;
    }

    public double getAvgStars() {
        return avgStars;
    }

    public void setAvgStars(double avgStars) {
        this.avgStars = avgStars;
    }

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }


    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfReviews=" + numOfReviews +
                ", sumOfStars=" + sumOfStars +
                ", listOfReviews=" + listOfReviews +
                ", avgStars=" + avgStars +
                ", priceCat=" + priceCat +
                '}';
    }
}
