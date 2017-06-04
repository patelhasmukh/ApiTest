
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BPPrims {

    @SerializedName("list")
    @Expose
    private java.util.List<pojo.endpoint.bus.List> list = null;

    public java.util.List<pojo.endpoint.bus.List> getList() {
        return list;
    }

    public void setList(java.util.List<pojo.endpoint.bus.List> list) {
        this.list = list;
    }

}
