package inheritance;

public interface Reviewable {

    String revAuthor = null;
    String body = null;
    double stars = 0;
    public void newReview(String revAuthor, String body, int stars);
}
