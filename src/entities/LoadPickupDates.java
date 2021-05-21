package entities;

public class LoadPickupDates {
	
	 private String PickupType;
	 private String DateTime;
	 
	public LoadPickupDates() {
		super();
		
	}
	public LoadPickupDates(String pickupType, String dateTime) {
		super();
		PickupType = pickupType;
		DateTime = dateTime;
	}
	public String getPickupType() {
		return PickupType;
	}
	public void setPickupType(String pickupType) {
		PickupType = pickupType;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
	 

}
