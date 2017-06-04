
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Fare {

    @SerializedName("adultservicetax")
    @Expose
    private String adultservicetax;
    @SerializedName("adultcommission")
    @Expose
    private String adultcommission;
    @SerializedName("adultbasefare")
    @Expose
    private String adultbasefare;
    @SerializedName("adultsurcharge")
    @Expose
    private String adultsurcharge;
    @SerializedName("totalfare")
    @Expose
    private String totalfare;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("totalsurcharge")
    @Expose
    private String totalsurcharge;
    @SerializedName("totalcommission")
    @Expose
    private String totalcommission;
    @SerializedName("transactionfee")
    @Expose
    private String transactionfee;
    @SerializedName("totalbasefare")
    @Expose
    private String totalbasefare;
    @SerializedName("adulttotalfare")
    @Expose
    private String adulttotalfare;
    @SerializedName("servicetax")
    @Expose
    private String servicetax;

    public String getAdultservicetax() {
        return adultservicetax;
    }

    public void setAdultservicetax(String adultservicetax) {
        this.adultservicetax = adultservicetax;
    }

    public String getAdultcommission() {
        return adultcommission;
    }

    public void setAdultcommission(String adultcommission) {
        this.adultcommission = adultcommission;
    }

    public String getAdultbasefare() {
        return adultbasefare;
    }

    public void setAdultbasefare(String adultbasefare) {
        this.adultbasefare = adultbasefare;
    }

    public String getAdultsurcharge() {
        return adultsurcharge;
    }

    public void setAdultsurcharge(String adultsurcharge) {
        this.adultsurcharge = adultsurcharge;
    }

    public String getTotalfare() {
        return totalfare;
    }

    public void setTotalfare(String totalfare) {
        this.totalfare = totalfare;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getTotalsurcharge() {
        return totalsurcharge;
    }

    public void setTotalsurcharge(String totalsurcharge) {
        this.totalsurcharge = totalsurcharge;
    }

    public String getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(String totalcommission) {
        this.totalcommission = totalcommission;
    }

    public String getTransactionfee() {
        return transactionfee;
    }

    public void setTransactionfee(String transactionfee) {
        this.transactionfee = transactionfee;
    }

    public String getTotalbasefare() {
        return totalbasefare;
    }

    public void setTotalbasefare(String totalbasefare) {
        this.totalbasefare = totalbasefare;
    }

    public String getAdulttotalfare() {
        return adulttotalfare;
    }

    public void setAdulttotalfare(String adulttotalfare) {
        this.adulttotalfare = adulttotalfare;
    }

    public String getServicetax() {
        return servicetax;
    }

    public void setServicetax(String servicetax) {
        this.servicetax = servicetax;
    }

}
