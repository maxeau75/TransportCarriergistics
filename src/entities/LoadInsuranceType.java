package entities;

public class LoadInsuranceType {
	
	 private String type;
	 private String contactPhone;
	 private String contactName;
	 private String expirationDate;
	 private String company;
	 private String amount;
	 
	public LoadInsuranceType() {
		super();
		
	}
	public LoadInsuranceType(String type, String contactPhone, String contactName, String expirationDate,
			String company, String amount) {
		super();
		this.type = type;
		this.contactPhone = contactPhone;
		this.contactName = contactName;
		this.expirationDate = expirationDate;
		this.company = company;
		this.amount = amount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public String getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

}
