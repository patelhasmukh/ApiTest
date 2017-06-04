
package pojo.endpoint.bus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("returnflights")
    @Expose
    private List<Returnflight> returnflights = null;
    @SerializedName("onwardflights")
    @Expose
    private List<Onwardflight> onwardflights = null;

    public List<Returnflight> getReturnflights() {
        return returnflights;
    }

    public void setReturnflights(List<Returnflight> returnflights) {
        this.returnflights = returnflights;
    }

    public List<Onwardflight> getOnwardflights() {
        return onwardflights;
    }

    public void setOnwardflights(List<Onwardflight> onwardflights) {
        this.onwardflights = onwardflights;
    }

}
