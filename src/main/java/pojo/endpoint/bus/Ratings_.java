
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ratings_ {

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
    @SerializedName("staffBehaviour")
    @Expose
    private Double staffBehaviour;
    @SerializedName("busQuality")
    @Expose
    private Double busQuality;
    @SerializedName("acQuality")
    @Expose
    private Double acQuality;
    @SerializedName("seater")
    @Expose
    private Double seater;
    @SerializedName("punctuality")
    @Expose
    private Double punctuality;

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

    public Double getStaffBehaviour() {
        return staffBehaviour;
    }

    public void setStaffBehaviour(Double staffBehaviour) {
        this.staffBehaviour = staffBehaviour;
    }

    public Double getBusQuality() {
        return busQuality;
    }

    public void setBusQuality(Double busQuality) {
        this.busQuality = busQuality;
    }

    public Double getAcQuality() {
        return acQuality;
    }

    public void setAcQuality(Double acQuality) {
        this.acQuality = acQuality;
    }

    public Double getSeater() {
        return seater;
    }

    public void setSeater(Double seater) {
        this.seater = seater;
    }

    public Double getPunctuality() {
        return punctuality;
    }

    public void setPunctuality(Double punctuality) {
        this.punctuality = punctuality;
    }

}
