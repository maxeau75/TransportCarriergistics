package entities;

public class ShipmentItemGroups {
	
	 private String internalId;
	 private String sequence;
	 private String isHandlingUnit;
	 private String isShipUnit;
	 private String Description;
	 private String ContainmentId;
	 
	public ShipmentItemGroups() {
		super();
		
	}
	public ShipmentItemGroups(String internalId, String sequence, String isHandlingUnit, String isShipUnit,
			String description, String containmentId) {
		super();
		this.internalId = internalId;
		this.sequence = sequence;
		this.isHandlingUnit = isHandlingUnit;
		this.isShipUnit = isShipUnit;
		Description = description;
		ContainmentId = containmentId;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getSequence() {
		return sequence;
	}
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}
	public String getIsHandlingUnit() {
		return isHandlingUnit;
	}
	public void setIsHandlingUnit(String isHandlingUnit) {
		this.isHandlingUnit = isHandlingUnit;
	}
	public String getIsShipUnit() {
		return isShipUnit;
	}
	public void setIsShipUnit(String isShipUnit) {
		this.isShipUnit = isShipUnit;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getContainmentId() {
		return ContainmentId;
	}
	public void setContainmentId(String containmentId) {
		ContainmentId = containmentId;
	}
	 

}
