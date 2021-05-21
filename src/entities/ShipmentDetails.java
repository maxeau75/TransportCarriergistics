package entities;

public class ShipmentDetails {
	
	private String createdBy;
	private String createDate;
	private String updateBy;
	private String updateDate;
	private String internalId;
	private String type;
	private String shipmentRefNumber;
	private String shipmentRefInternalId;
	private String shipmentRefIsPrimary;
	private String shipmentRefType;
	
	
	public ShipmentDetails() {
		super();
	
	}
	public ShipmentDetails(String createdBy, String createDate, String updateBy, String updateDate, String internalId,
			String type, String shipmentRefNumber, String shipmentRefInternalId, String shipmentRefIsPrimary,
			String shipmentRefType) {
		super();
		this.createdBy = createdBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.internalId = internalId;
		this.type = type;
		this.shipmentRefNumber = shipmentRefNumber;
		this.shipmentRefInternalId = shipmentRefInternalId;
		this.shipmentRefIsPrimary = shipmentRefIsPrimary;
		this.shipmentRefType = shipmentRefType;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
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
	public String getShipmentRefNumber() {
		return shipmentRefNumber;
	}
	public void setShipmentRefNumber(String shipmentRefNumber) {
		this.shipmentRefNumber = shipmentRefNumber;
	}
	public String getShipmentRefInternalId() {
		return shipmentRefInternalId;
	}
	public void setShipmentRefInternalId(String shipmentRefInternalId) {
		this.shipmentRefInternalId = shipmentRefInternalId;
	}
	public String getShipmentRefIsPrimary() {
		return shipmentRefIsPrimary;
	}
	public void setShipmentRefIsPrimary(String shipmentRefIsPrimary) {
		this.shipmentRefIsPrimary = shipmentRefIsPrimary;
	}
	public String getShipmentRefType() {
		return shipmentRefType;
	}
	public void setShipmentRefType(String shipmentRefType) {
		this.shipmentRefType = shipmentRefType;
	}
	
	

}
