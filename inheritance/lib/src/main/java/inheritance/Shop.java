package inheritance;

import java.util.ArrayList;

public class Shop implements Reviewable{
    String name;
    String desc;
    int numOfReviews = 0;
    int sumOfStars = 0;
    ArrayList<Review> listOfReviews = new ArrayList<>();
    double avgStars;
    int priceCat;

    public Shop(String name, int priceCat, String desc) {
        this.name = name;
        this.priceCat = priceCat;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                ", numOfReviews=" + numOfReviews +
                ", sumOfStars=" + sumOfStars +
                ", listOfReviews=" + listOfReviews +
                ", avgStars=" + avgStars +
                ", priceCat=" + priceCat +
                '}';
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
}
