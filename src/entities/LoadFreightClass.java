package entities;

public class LoadFreightClass {
	
	 private String type;
	 private String FreightClass;
	 private String TrackingNumber;
	 private String DeliveryStatus;
	 public LoadFreightClass() {
		super();
		
	}
	public LoadFreightClass(String type, String freightClass, String trackingNumber, String deliveryStatus,
			String equipmentRequired) {
		super();
		this.type = type;
		FreightClass = freightClass;
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
	private String EquipmentRequired;

}
