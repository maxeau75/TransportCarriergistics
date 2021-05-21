package entities;

public class LoadDropDates {
	
	private String DropOffType;
    private String DateTime;
    
    
	public LoadDropDates() {
		super();
		
	}
	public LoadDropDates(String dropOffType, String dateTime) {
		super();
		DropOffType = dropOffType;
		DateTime = dateTime;
	}
	public String getDropOffType() {
		return DropOffType;
	}
	public void setDropOffType(String dropOffType) {
		DropOffType = dropOffType;
	}
	public String getDateTime() {
		return DateTime;
	}
	public void setDateTime(String dateTime) {
		DateTime = dateTime;
	}
    
	}
	 





