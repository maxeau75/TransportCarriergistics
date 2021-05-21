package entities;

import java.io.Serializable;

public class ExtractRequestInfo implements Serializable {
	
	public ExtractRequestInfo(String date, String reason) {
		super();
		Date = date;
		Reason = reason;
	}
	private String Date;
	private String Reason;
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getReason() {
		return Reason;
	}
	public void setReason(String reason) {
		Reason = reason;
	}
	public ExtractRequestInfo() {
		super();
		
	}

}
