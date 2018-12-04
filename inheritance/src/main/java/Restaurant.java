
import java.util.*;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class Restaurant {
    private String name;
    private int numStars;
    private String priceCategory;
    private List<Review> reviewList;

    public Restaurant(String name, int numStars, String priceCategory){
        this.name = name;
        this.numStars = numStars;
        this.priceCategory = priceCategory;
        this.reviewList = new ArrayList<>();

    }


    public String toString(){
        String starsStringified = Integer.toString(this.numStars);

        return starsStringified;
    }


    public int getStars(){
        return this.numStars;
    }


    public List<Review> updateReviewList(Review newReview){
        this.reviewList.add(newReview);

        return this.reviewList;
    }

}
