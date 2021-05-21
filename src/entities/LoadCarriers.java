package entities;

public class LoadCarriers {
	
	  private String internalId;
	  private String type;
	  private String CarrierId;
	  private String CarrierName;
	  private String SCAC;
	  private String Mode;
	  private String Service;
	  private String ServiceDays;
	  private String Id;
	  private String MCNumber;
	  private String USDOT;
	  
	  public LoadCarriers() {
			super();	
		}
	  
	public LoadCarriers(String internalId, String type, String carrierId, String carrierName, String sCAC, String mode,
			String service, String serviceDays, String id, String mCNumber, String uSDOT) {
		super();
		this.internalId = internalId;
		this.type = type;
		CarrierId = carrierId;
		CarrierName = carrierName;
		SCAC = sCAC;
		Mode = mode;
		Service = service;
		ServiceDays = serviceDays;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
