
package pojo.endpoint.bus;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RouteSeatTypeDetail {

    @SerializedName("list")
    @Expose
    private List<List__> list = null;

    public List<List__> getList() {
        return list;
    }

    public void setList(List<List__> list) {
        this.list = list;
    }

}
