
package pojo.endpoint.bus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BPPrims_ {

    @SerializedName("list")
    @Expose
    private List<List___> list = null;

    public List<List___> getList() {
        return list;
    }

    public void setList(List<List___> list) {
        this.list = list;
    }

}
