package entities;

public class LoadExtraLineItemDetails {
	
	 private String HazMatDetail;
	 private String ProperShippingName;
	 private String HazMatID;
	 private String PackageGroup;
	 private String HazMatClass;
	 private String ContactName;
	 private String ContactPhone;
	 private String HazMatPlacards;
	 private String HazMatPlacardsDetails;
	 private String HazMatEMSNumber;
	 private String HazMatFlashPointTemp;
	 private String Comments;
	 
	 
	public LoadExtraLineItemDetails() {
		super();
		
	}
	public LoadExtraLineItemDetails(String hazMatDetail, String properShippingName, String hazMatID,
			String packageGroup, String hazMatClass, String contactName, String contactPhone, String hazMatPlacards,
			String hazMatPlacardsDetails, String hazMatEMSNumber, String hazMatFlashPointTemp, String comments) {
		super();
		HazMatDetail = hazMatDetail;
		ProperShippingName = properShippingName;
		HazMatID = hazMatID;
		PackageGroup = packageGroup;
		HazMatClass = hazMatClass;
		ContactName = contactName;
		ContactPhone = contactPhone;
		HazMatPlacards = hazMatPlacards;
		HazMatPlacardsDetails = hazMatPlacardsDetails;
		HazMatEMSNumber = hazMatEMSNumber;
		HazMatFlashPointTemp = hazMatFlashPointTemp;
		Comments = comments;
	}
	public String getHazMatDetail() {
		return HazMatDetail;
	}
	public void setHazMatDetail(String hazMatDetail) {
		HazMatDetail = hazMatDetail;
	}
	public String getProperShippingName() {
		return ProperShippingName;
	}
	public void setProperShippingName(String properShippingName) {
		ProperShippingName = properShippingName;
	}
	public String getHazMatID() {
		return HazMatID;
	}
	public void setHazMatID(String hazMatID) {
		HazMatID = hazMatID;
	}
	public String getPackageGroup() {
		return PackageGroup;
	}
	public void setPackageGroup(String packageGroup) {
		PackageGroup = packageGroup;
	}
	public String getHazMatClass() {
		return HazMatClass;
	}
	public void setHazMatClass(String hazMatClass) {
		HazMatClass = hazMatClass;
	}
	public String getContactName() {
		return ContactName;
	}
	public void setContactName(String contactName) {
		ContactName = contactName;
	}
	public String getContactPhone() {
		return ContactPhone;
	}
	public void setContactPhone(String contactPhone) {
		ContactPhone = contactPhone;
	}
	public String getHazMatPlacards() {
		return HazMatPlacards;
	}
	public void setHazMatPlacards(String hazMatPlacards) {
		HazMatPlacards = hazMatPlacards;
	}
	public String getHazMatPlacardsDetails() {
		return HazMatPlacardsDetails;
	}
	public void setHazMatPlacardsDetails(String hazMatPlacardsDetails) {
		HazMatPlacardsDetails = hazMatPlacardsDetails;
	}
	public String getHazMatEMSNumber() {
		return HazMatEMSNumber;
	}
	public void setHazMatEMSNumber(String hazMatEMSNumber) {
		HazMatEMSNumber = hazMatEMSNumber;
	}
	public String getHazMatFlashPointTemp() {
		return HazMatFlashPointTemp;
	}
	public void setHazMatFlashPointTemp(String hazMatFlashPointTemp) {
		HazMatFlashPointTemp = hazMatFlashPointTemp;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	 
}
