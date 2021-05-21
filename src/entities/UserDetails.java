package entities;

public class UserDetails {
	
	 public UserDetails() {
		super();
		
	}
	public UserDetails(String internalId, String lastName, String firstName, String userId, int sequenceNum,
			String type, String contactMethod) {
		super();
		this.internalId = internalId;
		LastName = lastName;
		FirstName = firstName;
		UserId = userId;
		this.sequenceNum = sequenceNum;
		this.type = type;
		ContactMethod = contactMethod;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public int getSequenceNum() {
		return sequenceNum;
	}
	public void setSequenceNum(int sequenceNum) {
		this.sequenceNum = sequenceNum;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactMethod() {
		return ContactMethod;
	}
	public void setContactMethod(String contactMethod) {
		ContactMethod = contactMethod;
	}
	private String internalId;
	 private String LastName; 
	 private String FirstName;
	 private String UserId; 
	 private int sequenceNum;
	 private String type; 
	 private String ContactMethod;
	  

}
