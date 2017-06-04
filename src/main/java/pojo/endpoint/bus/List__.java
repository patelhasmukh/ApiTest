
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List__ {

    @SerializedName("SellFare")
    @Expose
    private String sellFare;
    @SerializedName("busCondition")
    @Expose
    private String busCondition;
    @SerializedName("seatType")
    @Expose
    private String seatType;
    @SerializedName("seatTypeSpecific")
    @Expose
    private String seatTypeSpecific;
    @SerializedName("SeatsAvailable")
    @Expose
    private String seatsAvailable;
    @SerializedName("availabilityStatus")
    @Expose
    private String availabilityStatus;

    public String getSellFare() {
        return sellFare;
    }

    public void setSellFare(String sellFare) {
        this.sellFare = sellFare;
    }

    public String getBusCondition() {
        return busCondition;
    }

    public void setBusCondition(String busCondition) {
        this.busCondition = busCondition;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getSeatTypeSpecific() {
        return seatTypeSpecific;
    }

    public void setSeatTypeSpecific(String seatTypeSpecific) {
        this.seatTypeSpecific = seatTypeSpecific;
    }

    public String getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(String seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

}
