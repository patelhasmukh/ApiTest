
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List_ {

    @SerializedName("DPTime")
    @Expose
    private String dPTime;
    @SerializedName("DPLocation")
    @Expose
    private String dPLocation;
    @SerializedName("DPId")
    @Expose
    private String dPId;

    public String getDPTime() {
        return dPTime;
    }

    public void setDPTime(String dPTime) {
        this.dPTime = dPTime;
    }

    public String getDPLocation() {
        return dPLocation;
    }

    public void setDPLocation(String dPLocation) {
        this.dPLocation = dPLocation;
    }

    public String getDPId() {
        return dPId;
    }

    public void setDPId(String dPId) {
        this.dPId = dPId;
    }

}
