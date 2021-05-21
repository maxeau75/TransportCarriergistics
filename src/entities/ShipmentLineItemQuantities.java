package entities;

public class ShipmentLineItemQuantities {
	
	 private String Quantity;
	 private String uom;
	 private String type;
	 private String ItemId;
	 private String Description;
	 private String FreightClass;
	 private String Commodity;
	 private String NmfcCode;
	 private String StccCode;
	 private String CustomerPartNum;
	 private String ManufacturerPartNum;
	 private String DistributorPartNum;
	 private String Cube;
	 private String TemperatureRange;
	 private String HazardousMaterial;
	 private String internalId;
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
	 
	public ShipmentLineItemQuantities() {
		super();
		
	}
	public ShipmentLineItemQuantities(String quantity, String uom, String type, String itemId, String description,
			String freightClass, String commodity, String nmfcCode, String stccCode, String customerPartNum,
			String manufacturerPartNum, String distributorPartNum, String cube, String temperatureRange,
			String hazardousMaterial, String internalId, String hazMatDetail, String properShippingName,
			String hazMatID, String packageGroup, String hazMatClass, String contactName, String contactPhone,
			String hazMatPlacards, String hazMatPlacardsDetails, String hazMatEMSNumber, String hazMatFlashPointTemp,
			String comments) {
		super();
		Quantity = quantity;
		this.uom = uom;
		this.type = type;
		ItemId = itemId;
		Description = description;
		FreightClass = freightClass;
		Commodity = commodity;
		NmfcCode = nmfcCode;
		StccCode = stccCode;
		CustomerPartNum = customerPartNum;
		ManufacturerPartNum = manufacturerPartNum;
		DistributorPartNum = distributorPartNum;
		Cube = cube;
		TemperatureRange = temperatureRange;
		HazardousMaterial = hazardousMaterial;
		this.internalId = internalId;
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
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItemId() {
		return ItemId;
	}
	public void setItemId(String itemId) {
		ItemId = itemId;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getFreightClass() {
		return FreightClass;
	}
	public void setFreightClass(String freightClass) {
		FreightClass = freightClass;
	}
	public String getCommodity() {
		return Commodity;
	}
	public void setCommodity(String commodity) {
		Commodity = commodity;
	}
	public String getNmfcCode() {
		return NmfcCode;
	}
	public void setNmfcCode(String nmfcCode) {
		NmfcCode = nmfcCode;
	}
	public String getStccCode() {
		return StccCode;
	}
	public void setStccCode(String stccCode) {
		StccCode = stccCode;
	}
	public String getCustomerPartNum() {
		return CustomerPartNum;
	}
	public void setCustomerPartNum(String customerPartNum) {
		CustomerPartNum = customerPartNum;
	}
	public String getManufacturerPartNum() {
		return ManufacturerPartNum;
	}
	public void setManufacturerPartNum(String manufacturerPartNum) {
		ManufacturerPartNum = manufacturerPartNum;
	}
	public String getDistributorPartNum() {
		return DistributorPartNum;
	}
	public void setDistributorPartNum(String distributorPartNum) {
		DistributorPartNum = distributorPartNum;
	}
	public String getCube() {
		return Cube;
	}
	public void setCube(String cube) {
		Cube = cube;
	}
	public String getTemperatureRange() {
		return TemperatureRange;
	}
	public void setTemperatureRange(String temperatureRange) {
		TemperatureRange = temperatureRange;
	}
	public String getHazardousMaterial() {
		return HazardousMaterial;
	}
	public void setHazardousMaterial(String hazardousMaterial) {
		HazardousMaterial = hazardousMaterial;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
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
