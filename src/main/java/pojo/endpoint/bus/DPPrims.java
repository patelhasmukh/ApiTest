
package pojo.endpoint.bus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DPPrims {

    @SerializedName("list")
    @Expose
    private List<List_> list = null;

    public List<List_> getList() {
        return list;
    }

    public void setList(List<List_> list) {
        this.list = list;
    }

}
