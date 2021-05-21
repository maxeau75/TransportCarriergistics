package entities;

public class ShipmentPickupDate {
	
	 private String pickuptype;
	 private String Date;
	 
	public ShipmentPickupDate() {
		super();
		
	}
	public ShipmentPickupDate(String pickuptype, String date) {
		super();
		this.pickuptype = pickuptype;
		Date = date;
	}
	public String getPickuptype() {
		return pickuptype;
	}
	public void setPickuptype(String pickuptype) {
		this.pickuptype = pickuptype;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	 
	

}
