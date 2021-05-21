package entities;

public class LoadDetails {
	
	 public LoadDetails() {
		super();
		
	}
	public LoadDetails(String loadRefNumber, String internalId, String type, String createBy, String createDate,
			String updateBy, String updateDate, String loadRefInternalId, String loadRefIsPrimary, String loadRefType) {
		super();
		this.loadRefNumber = loadRefNumber;
		this.internalId = internalId;
		this.type = type;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.loadRefInternalId = loadRefInternalId;
		this.loadRefIsPrimary = loadRefIsPrimary;
		this.loadRefType = loadRefType;
	}
	private String loadRefNumber;
	 public String getLoadRefNumber() {
		return loadRefNumber;
	}
	public void setLoadRefNumber(String loadRefNumber) {
		this.loadRefNumber = loadRefNumber;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getUpdateBy() {
		return updateBy;
	}
	public void setUpdateBy(String updateBy) {
		this.updateBy = updateBy;
	}
	public String getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	public String getLoadRefInternalId() {
		return loadRefInternalId;
	}
	public void setLoadRefInternalId(String loadRefInternalId) {
		this.loadRefInternalId = loadRefInternalId;
	}
	public String getLoadRefIsPrimary() {
		return loadRefIsPrimary;
	}
	public void setLoadRefIsPrimary(String loadRefIsPrimary) {
		this.loadRefIsPrimary = loadRefIsPrimary;
	}
	public String getLoadRefType() {
		return loadRefType;
	}
	public void setLoadRefType(String loadRefType) {
		this.loadRefType = loadRefType;
	}
	private String internalId;
	 private String type;
	 private String createBy; 
	 private String createDate;
	 private String updateBy; 
	 private String updateDate;
     private String loadRefInternalId; 
	 private String loadRefIsPrimary; 
	 private String loadRefType; 

}
