
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ugcreview_ {

    @SerializedName("ratings")
    @Expose
    private Ratings_ ratings;
    @SerializedName("reviewCount")
    @Expose
    private Double reviewCount;
    @SerializedName("posReviewCount")
    @Expose
    private Double posReviewCount;
    @SerializedName("criReviewCount")
    @Expose
    private Double criReviewCount;
    @SerializedName("imgReviewCount")
    @Expose
    private Double imgReviewCount;
    @SerializedName("totalRating")
    @Expose
    private Double totalRating;
    @SerializedName("approvedImageCount")
    @Expose
    private Double approvedImageCount;
    @SerializedName("id")
    @Expose
    private String id;

    public Ratings_ getRatings() {
        return ratings;
    }

    public void setRatings(Ratings_ ratings) {
        this.ratings = ratings;
    }

    public Double getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Double reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Double getPosReviewCount() {
        return posReviewCount;
    }

    public void setPosReviewCount(Double posReviewCount) {
        this.posReviewCount = posReviewCount;
    }

    public Double getCriReviewCount() {
        return criReviewCount;
    }

    public void setCriReviewCount(Double criReviewCount) {
        this.criReviewCount = criReviewCount;
    }

    public Double getImgReviewCount() {
        return imgReviewCount;
    }

    public void setImgReviewCount(Double imgReviewCount) {
        this.imgReviewCount = imgReviewCount;
    }

    public Double getTotalRating() {
        return totalRating;
    }

    public void setTotalRating(Double totalRating) {
        this.totalRating = totalRating;
    }

    public Double getApprovedImageCount() {
        return approvedImageCount;
    }

    public void setApprovedImageCount(Double approvedImageCount) {
        this.approvedImageCount = approvedImageCount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
