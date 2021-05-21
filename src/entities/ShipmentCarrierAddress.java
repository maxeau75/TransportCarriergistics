package entities;

public class ShipmentCarrierAddress {
	
	 private String internalId;
	 private String type;
	 private String isPrimary;
	 private String isResidential;
	 private String Owner;
	 private String CustomerAcctNum;
	 private String LocationCode;
	 private String Name;
	 private String AddrLine1;
	 private String AddrLine2;
	 private String City;
	 private String StateProvince;
	 private String PostalCode;
	 private String CountryCode;
	 private String Contacts;
	 
	public ShipmentCarrierAddress() {
		super();
		
	}
	public ShipmentCarrierAddress(String internalId, String type, String isPrimary, String isResidential, String owner,
			String customerAcctNum, String locationCode, String name, String addrLine1, String addrLine2, String city,
			String stateProvince, String postalCode, String countryCode, String contacts) {
		super();
		this.internalId = internalId;
		this.type = type;
		this.isPrimary = isPrimary;
		this.isResidential = isResidential;
		Owner = owner;
		CustomerAcctNum = customerAcctNum;
		LocationCode = locationCode;
		Name = name;
		AddrLine1 = addrLine1;
		AddrLine2 = addrLine2;
		City = city;
		StateProvince = stateProvince;
		PostalCode = postalCode;
		CountryCode = countryCode;
		Contacts = contacts;
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
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
	public String getCustomerAcctNum() {
		return CustomerAcctNum;
	}
	public void setCustomerAcctNum(String customerAcctNum) {
		CustomerAcctNum = customerAcctNum;
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
	public String getContacts() {
		return Contacts;
	}
	public void setContacts(String contacts) {
		Contacts = contacts;
	}
	 
	 

}
