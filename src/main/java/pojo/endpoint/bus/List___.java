
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List___ {

    @SerializedName("BPLocation")
    @Expose
    private String bPLocation;
    @SerializedName("BPId")
    @Expose
    private String bPId;
    @SerializedName("BPTime")
    @Expose
    private String bPTime;

    public String getBPLocation() {
        return bPLocation;
    }

    public void setBPLocation(String bPLocation) {
        this.bPLocation = bPLocation;
    }

    public String getBPId() {
        return bPId;
    }

    public void setBPId(String bPId) {
        this.bPId = bPId;
    }

    public String getBPTime() {
        return bPTime;
    }

    public void setBPTime(String bPTime) {
        this.bPTime = bPTime;
    }

}
