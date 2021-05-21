package entities;

public class ShipmentConsigneePackageGeoLoc {
	
	 private String type;
	 private String internalId;
	 
	public ShipmentConsigneePackageGeoLoc() {
		super();
		
	}
	public ShipmentConsigneePackageGeoLoc(String type, String internalId) {
		super();
		this.type = type;
		this.internalId = internalId;
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
	 

}
