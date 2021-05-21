package entities;

public class ShipmentInsuranceTypes {
	
	 private String amount;
	 private String company;
	 private String expirationDate;
	 private String contactName;
	 private String contactPhone;
	 private String type;
	 
	public ShipmentInsuranceTypes() {
		super();
		
	}
	public ShipmentInsuranceTypes(String amount, String company, String expirationDate, String contactName,
			String contactPhone, String type) {
		super();
		this.amount = amount;
		this.company = company;
		this.expirationDate = expirationDate;
		this.contactName = contactName;
		this.contactPhone = contactPhone;
		this.type = type;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	 
	 
	 
	
	
	 
	

}
