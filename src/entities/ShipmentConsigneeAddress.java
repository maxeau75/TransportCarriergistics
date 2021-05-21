package entities;

public class ShipmentConsigneeAddress {
	
	 private String type;
	 private String internalId;
	 private String isPrimary;
	 private String isResidential;
	 private String LocationCode; 
	 private String Name;
	 private String AddrLine1;
	 private String AddrLine2;
	 private String City;
	 private String StateProvince;
	 private String PostalCode;
	 private String CountryCode;
	 private String Contact;
	 private String Comments;
	 private String Services;
	 
	public ShipmentConsigneeAddress() {
		super();
	
	}
	public ShipmentConsigneeAddress(String type, String internalId, String isPrimary, String isResidential,
			String locationCode, String name, String addrLine1, String addrLine2, String city, String stateProvince,
			String postalCode, String countryCode, String contact, String comments, String services) {
		super();
		this.type = type;
		this.internalId = internalId;
		this.isPrimary = isPrimary;
		this.isResidential = isResidential;
		LocationCode = locationCode;
		Name = name;
		AddrLine1 = addrLine1;
		AddrLine2 = addrLine2;
		City = city;
		StateProvince = stateProvince;
		PostalCode = postalCode;
		CountryCode = countryCode;
		Contact = contact;
		Comments = comments;
		Services = services;
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
	public String getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(String isPrimary) {
		this.isPrimary = isPrimary;
	}
	public String getIsResidential() {
		return isResidential;
	}
	public void setIsResidential(String isResidential) {
		this.isResidential = isResidential;
	}
	public String getLocationCode() {
		return LocationCode;
	}
	public void setLocationCode(String locationCode) {
		LocationCode = locationCode;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddrLine1() {
		return AddrLine1;
	}
	public void setAddrLine1(String addrLine1) {
		AddrLine1 = addrLine1;
	}
	public String getAddrLine2() {
		return AddrLine2;
	}
	public void setAddrLine2(String addrLine2) {
		AddrLine2 = addrLine2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getStateProvince() {
		return StateProvince;
	}
	public void setStateProvince(String stateProvince) {
		StateProvince = stateProvince;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getCountryCode() {
		return CountryCode;
	}
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getServices() {
		return Services;
	}
	public void setServices(String services) {
		Services = services;
	}
	 

}
