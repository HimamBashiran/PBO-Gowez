package gowez;

public class RatingUlasan {
    private int rating; // 1-5
    private String ulasan;

    public RatingUlasan(int rating, String ulasan) {
        this.rating = rating;
        this.ulasan = ulasan;
    }

    public int getRating() { return rating; }
    public String getUlasan() { return ulasan; }
}
