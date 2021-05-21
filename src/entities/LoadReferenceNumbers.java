package entities;

public class LoadReferenceNumbers {
	
	 private String type;
	 private String internalId;
	 private String isPrimary;
	 private String ReferenceNumber;
	public LoadReferenceNumbers() {
		super();
		
	}
	public LoadReferenceNumbers(String type, String internalId, String isPrimary, String referenceNumber) {
		super();
		this.type = type;
		this.internalId = internalId;
		this.isPrimary = isPrimary;
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
	public String getReferenceNumber() {
		return ReferenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		ReferenceNumber = referenceNumber;
	}

}
