package entities;

public class ShipmentItemGroupFreightClass {
	
	 private String type;
	 private String FreightClass;
	 private String Stackability;
	 private String TrackingNumber;
	 private String DeliveryStatus;
	 private String EquipmentRequired;
	 
	public ShipmentItemGroupFreightClass() {
		super();
		
	}
	public ShipmentItemGroupFreightClass(String type, String freightClass, String stackability, String trackingNumber,
			String deliveryStatus, String equipmentRequired) {
		super();
		this.type = type;
		FreightClass = freightClass;
		Stackability = stackability;
		TrackingNumber = trackingNumber;
		DeliveryStatus = deliveryStatus;
		EquipmentRequired = equipmentRequired;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFreightClass() {
		return FreightClass;
	}
	public void setFreightClass(String freightClass) {
		FreightClass = freightClass;
	}
	public String getStackability() {
		return Stackability;
	}
	public void setStackability(String stackability) {
		Stackability = stackability;
	}
	public String getTrackingNumber() {
		return TrackingNumber;
	}
	public void setTrackingNumber(String trackingNumber) {
		TrackingNumber = trackingNumber;
	}
	public String getDeliveryStatus() {
		return DeliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		DeliveryStatus = deliveryStatus;
	}
	public String getEquipmentRequired() {
		return EquipmentRequired;
	}
	public void setEquipmentRequired(String equipmentRequired) {
		EquipmentRequired = equipmentRequired;
	}
	 

}
