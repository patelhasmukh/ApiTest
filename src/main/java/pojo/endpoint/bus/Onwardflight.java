
package pojo.endpoint.bus;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Onwardflight {

    @SerializedName("origin")
    @Expose
    private String origin;
    @SerializedName("rating")
    @Expose
    private String rating;
    @SerializedName("DepartureTime")
    @Expose
    private String departureTime;
    @SerializedName("cancellationPolicy")
    @Expose
    private String cancellationPolicy;
    @SerializedName("farebasis")
    @Expose
    private String farebasis;
    @SerializedName("seat")
    @Expose
    private String seat;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("qtype")
    @Expose
    private String qtype;
    @SerializedName("skey")
    @Expose
    private String skey;
    @SerializedName("busCondition")
    @Expose
    private String busCondition;
    @SerializedName("src_voyager_id")
    @Expose
    private String srcVoyagerId;
    @SerializedName("destination")
    @Expose
    private String destination;
    @SerializedName("BPPrims")
    @Expose
    private BPPrims_ bPPrims;
    @SerializedName("amenities")
    @Expose
    private String amenities;
    @SerializedName("src_vendor_id")
    @Expose
    private String srcVendorId;
    @SerializedName("dest_voyager_id")
    @Expose
    private String destVoyagerId;
    @SerializedName("gps")
    @Expose
    private String gps;
    @SerializedName("fare")
    @Expose
    private Fare_ fare;
    @SerializedName("dst_vendor_id")
    @Expose
    private String dstVendorId;
    @SerializedName("OperatorID")
    @Expose
    private String operatorID;
    @SerializedName("DPPrims")
    @Expose
    private DPPrims_ dPPrims;
    @SerializedName("mTicket")
    @Expose
    private String mTicket;
    @SerializedName("row_type")
    @Expose
    private String rowType;
    @SerializedName("BusType")
    @Expose
    private String busType;
    @SerializedName("RouteSeatTypeDetail")
    @Expose
    private RouteSeatTypeDetail_ routeSeatTypeDetail;
    @SerializedName("partialCancellationAllowed")
    @Expose
    private String partialCancellationAllowed;
    @SerializedName("idRequired")
    @Expose
    private String idRequired;
    @SerializedName("ServiceName")
    @Expose
    private String serviceName;
    @SerializedName("busCompany")
    @Expose
    private String busCompany;
    @SerializedName("ugcreview")
    @Expose
    private Ugcreview_ ugcreview;
    @SerializedName("TravelsName")
    @Expose
    private String travelsName;
    @SerializedName("tbrequired")
    @Expose
    private String tbrequired;
    @SerializedName("RouteID")
    @Expose
    private String routeID;
    @SerializedName("ArrivalTime")
    @Expose
    private String arrivalTime;
    @SerializedName("depdate")
    @Expose
    private String depdate;
    @SerializedName("ugcid")
    @Expose
    private String ugcid;
    @SerializedName("arrdate")
    @Expose
    private String arrdate;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getCancellationPolicy() {
        return cancellationPolicy;
    }

    public void setCancellationPolicy(String cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }

    public String getFarebasis() {
        return farebasis;
    }

    public void setFarebasis(String farebasis) {
        this.farebasis = farebasis;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getQtype() {
        return qtype;
    }

    public void setQtype(String qtype) {
        this.qtype = qtype;
    }

    public String getSkey() {
        return skey;
    }

    public void setSkey(String skey) {
        this.skey = skey;
    }

    public String getBusCondition() {
        return busCondition;
    }

    public void setBusCondition(String busCondition) {
        this.busCondition = busCondition;
    }

    public String getSrcVoyagerId() {
        return srcVoyagerId;
    }

    public void setSrcVoyagerId(String srcVoyagerId) {
        this.srcVoyagerId = srcVoyagerId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public BPPrims_ getBPPrims() {
        return bPPrims;
    }

    public void setBPPrims(BPPrims_ bPPrims) {
        this.bPPrims = bPPrims;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getSrcVendorId() {
        return srcVendorId;
    }

    public void setSrcVendorId(String srcVendorId) {
        this.srcVendorId = srcVendorId;
    }

    public String getDestVoyagerId() {
        return destVoyagerId;
    }

    public void setDestVoyagerId(String destVoyagerId) {
        this.destVoyagerId = destVoyagerId;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public Fare_ getFare() {
        return fare;
    }

    public void setFare(Fare_ fare) {
        this.fare = fare;
    }

    public String getDstVendorId() {
        return dstVendorId;
    }

    public void setDstVendorId(String dstVendorId) {
        this.dstVendorId = dstVendorId;
    }

    public String getOperatorID() {
        return operatorID;
    }

    public void setOperatorID(String operatorID) {
        this.operatorID = operatorID;
    }

    public DPPrims_ getDPPrims() {
        return dPPrims;
    }

    public void setDPPrims(DPPrims_ dPPrims) {
        this.dPPrims = dPPrims;
    }

    public String getMTicket() {
        return mTicket;
    }

    public void setMTicket(String mTicket) {
        this.mTicket = mTicket;
    }

    public String getRowType() {
        return rowType;
    }

    public void setRowType(String rowType) {
        this.rowType = rowType;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public RouteSeatTypeDetail_ getRouteSeatTypeDetail() {
        return routeSeatTypeDetail;
    }

    public void setRouteSeatTypeDetail(RouteSeatTypeDetail_ routeSeatTypeDetail) {
        this.routeSeatTypeDetail = routeSeatTypeDetail;
    }

    public String getPartialCancellationAllowed() {
        return partialCancellationAllowed;
    }

    public void setPartialCancellationAllowed(String partialCancellationAllowed) {
        this.partialCancellationAllowed = partialCancellationAllowed;
    }

    public String getIdRequired() {
        return idRequired;
    }

    public void setIdRequired(String idRequired) {
        this.idRequired = idRequired;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getBusCompany() {
        return busCompany;
    }

    public void setBusCompany(String busCompany) {
        this.busCompany = busCompany;
    }

    public Ugcreview_ getUgcreview() {
        return ugcreview;
    }

    public void setUgcreview(Ugcreview_ ugcreview) {
        this.ugcreview = ugcreview;
    }

    public String getTravelsName() {
        return travelsName;
    }

    public void setTravelsName(String travelsName) {
        this.travelsName = travelsName;
    }

    public String getTbrequired() {
        return tbrequired;
    }

    public void setTbrequired(String tbrequired) {
        this.tbrequired = tbrequired;
    }

    public String getRouteID() {
        return routeID;
    }

    public void setRouteID(String routeID) {
        this.routeID = routeID;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public String getUgcid() {
        return ugcid;
    }

    public void setUgcid(String ugcid) {
        this.ugcid = ugcid;
    }

    public String getArrdate() {
        return arrdate;
    }

    public void setArrdate(String arrdate) {
        this.arrdate = arrdate;
    }

}
