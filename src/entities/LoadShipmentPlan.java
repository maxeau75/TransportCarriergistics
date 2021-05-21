package entities;

public class LoadShipmentPlan {
	
	 private String ReferenceNumber;
	 private String type;
	 private String internalId;
	 private String isPrimary;
	 
	 
	public LoadShipmentPlan() {
		super();
	
	}
	public LoadShipmentPlan(String referenceNumber, String type, String internalId, String isPrimary) {
		super();
		ReferenceNumber = referenceNumber;
		this.type = type;
		this.internalId = internalId;
		this.isPrimary = isPrimary;
	}
	public String getReferenceNumber() {
		return ReferenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		ReferenceNumber = referenceNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	 
	 

}
