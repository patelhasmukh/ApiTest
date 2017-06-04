
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ratings {

    @SerializedName("stopOverExperience")
    @Expose
    private Double stopOverExperience;
    @SerializedName("seats")
    @Expose
    private Double seats;
    @SerializedName("onBoardExperience")
    @Expose
    private Double onBoardExperience;
    @SerializedName("onTimeAD")
    @Expose
    private Double onTimeAD;

    public Double getStopOverExperience() {
        return stopOverExperience;
    }

    public void setStopOverExperience(Double stopOverExperience) {
        this.stopOverExperience = stopOverExperience;
    }

    public Double getSeats() {
        return seats;
    }

    public void setSeats(Double seats) {
        this.seats = seats;
    }

    public Double getOnBoardExperience() {
        return onBoardExperience;
    }

    public void setOnBoardExperience(Double onBoardExperience) {
        this.onBoardExperience = onBoardExperience;
    }

    public Double getOnTimeAD() {
        return onTimeAD;
    }

    public void setOnTimeAD(Double onTimeAD) {
        this.onTimeAD = onTimeAD;
    }

}
