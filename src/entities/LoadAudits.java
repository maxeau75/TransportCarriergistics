package entities;

public class LoadAudits {
	
	 private String action;
	 private String user;
	 private String timestamp;
	 private String Audit;
	 
	public LoadAudits(String action, String user, String timestamp, String audit) {
		super();
		this.action = action;
		this.user = user;
		this.timestamp = timestamp;
		Audit = audit;
	}
	public LoadAudits() {
		super();
		
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public String getAudit() {
		return Audit;
	}
	public void setAudit(String audit) {
		Audit = audit;
	} 

}
