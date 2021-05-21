package entities;

public class ShipmentCarrierInfo {
	
	 private String internalId;
	 private String CarrierId;
	 private String CarrierName;
	 private String SCAC;
	 private String Mode;
	 private String Service;
	 private String ServiceDays;
	 private String Distance;
	 private String Id;
	 private String MCNumber;
	 private String USDOT;
	 
	public ShipmentCarrierInfo() {
		super();
	
	}
	public ShipmentCarrierInfo(String internalId, String carrierId, String carrierName, String sCAC, String mode,
			String service, String serviceDays, String distance, String id, String mCNumber, String uSDOT) {
		super();
		this.internalId = internalId;
		CarrierId = carrierId;
		CarrierName = carrierName;
		SCAC = sCAC;
		Mode = mode;
		Service = service;
		ServiceDays = serviceDays;
		Distance = distance;
		Id = id;
		MCNumber = mCNumber;
		USDOT = uSDOT;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getCarrierId() {
		return CarrierId;
	}
	public void setCarrierId(String carrierId) {
		CarrierId = carrierId;
	}
	public String getCarrierName() {
		return CarrierName;
	}
	public void setCarrierName(String carrierName) {
		CarrierName = carrierName;
	}
	public String getSCAC() {
		return SCAC;
	}
	public void setSCAC(String sCAC) {
		SCAC = sCAC;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		Mode = mode;
	}
	public String getService() {
		return Service;
	}
	public void setService(String service) {
		Service = service;
	}
	public String getServiceDays() {
		return ServiceDays;
	}
	public void setServiceDays(String serviceDays) {
		ServiceDays = serviceDays;
	}
	public String getDistance() {
		return Distance;
	}
	public void setDistance(String distance) {
		Distance = distance;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getMCNumber() {
		return MCNumber;
	}
	public void setMCNumber(String mCNumber) {
		MCNumber = mCNumber;
	}
	public String getUSDOT() {
		return USDOT;
	}
	public void setUSDOT(String uSDOT) {
		USDOT = uSDOT;
	}
	 
}
