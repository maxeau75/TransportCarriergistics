package entities;

public class ShipmentActivities {
	
	 private String type;
	 private String internalId;
	 private String updateDate;
	 private String updateBy;
	 private String createDate;
	 private String createBy;
	 private String ActivityID;
	 private String Summary;
	 private String Priority;
	 private String Required;
	 private String Status;
	 private String AssignedTo;
	 private String PlannedDate;
	 private String PercentageComplete;
	 private String StatusDetails;
	 private String Location;
	 private String Contact;
	 private String Documents;
	 
	public ShipmentActivities() {
		super();
		
	}
	public ShipmentActivities(String type, String internalId, String updateDate, String updateBy, String createDate,
			String createBy, String activityID, String summary, String priority, String required, String status,
			String assignedTo, String plannedDate, String percentageComplete, String statusDetails, String location,
			String contact, String documents) {
		super();
		this.type = type;
		this.internalId = internalId;
		this.updateDate = updateDate;
		this.updateBy = updateBy;
		this.createDate = createDate;
		this.createBy = createBy;
		ActivityID = activityID;
		Summary = summary;
		Priority = priority;
		Required = required;
		Status = status;
		AssignedTo = assignedTo;
		PlannedDate = plannedDate;
		PercentageComplete = percentageComplete;
		StatusDetails = statusDetails;
		Location = location;
		Contact = contact;
		Documents = documents;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getActivityID() {
		return ActivityID;
	}
	public void setActivityID(String activityID) {
		ActivityID = activityID;
	}
	public String getSummary() {
		return Summary;
	}
	public void setSummary(String summary) {
		Summary = summary;
	}
	public String getPriority() {
		return Priority;
	}
	public void setPriority(String priority) {
		Priority = priority;
	}
	public String getRequired() {
		return Required;
	}
	public void setRequired(String required) {
		Required = required;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getAssignedTo() {
		return AssignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		AssignedTo = assignedTo;
	}
	public String getPlannedDate() {
		return PlannedDate;
	}
	public void setPlannedDate(String plannedDate) {
		PlannedDate = plannedDate;
	}
	public String getPercentageComplete() {
		return PercentageComplete;
	}
	public void setPercentageComplete(String percentageComplete) {
		PercentageComplete = percentageComplete;
	}
	public String getStatusDetails() {
		return StatusDetails;
	}
	public void setStatusDetails(String statusDetails) {
		StatusDetails = statusDetails;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getDocuments() {
		return Documents;
	}
	public void setDocuments(String documents) {
		Documents = documents;
	}
	 
	 

}
