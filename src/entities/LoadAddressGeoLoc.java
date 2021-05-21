package entities;

public class LoadAddressGeoLoc {
	
	 private String longDirection;
	 private String longDegrees;
	 private String latDirection;
	 private String latDegrees;
	 
	public LoadAddressGeoLoc() {
		super();
		
	}
	public LoadAddressGeoLoc(String longDirection, String longDegrees, String latDirection, String latDegrees) {
		super();
		this.longDirection = longDirection;
		this.longDegrees = longDegrees;
		this.latDirection = latDirection;
		this.latDegrees = latDegrees;
	}
	public String getLongDirection() {
		return longDirection;
	}
	public void setLongDirection(String longDirection) {
		this.longDirection = longDirection;
	}
	public String getLongDegrees() {
		return longDegrees;
	}
	public void setLongDegrees(String longDegrees) {
		this.longDegrees = longDegrees;
	}
	public String getLatDirection() {
		return latDirection;
	}
	public void setLatDirection(String latDirection) {
		this.latDirection = latDirection;
	}
	public String getLatDegrees() {
		return latDegrees;
	}
	public void setLatDegrees(String latDegrees) {
		this.latDegrees = latDegrees;
	}
	 
}
