package inheritance;

public class Review {
    String revAuthor;
    String body;
    double stars;

    public Review(String revAuthor, String body, int stars) {
        this.revAuthor = revAuthor;
        this.body = body;
        this.stars = stars;
    }

    public String getRevAuthor() {
        return revAuthor;
    }

    public void setRevAuthor(String revAuthor) {
        this.revAuthor = revAuthor;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }
}
