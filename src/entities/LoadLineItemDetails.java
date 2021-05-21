package entities;

public class LoadLineItemDetails {
	
	 private String ItemId;
	 private String Description;
	 private double FreightClass;
	 private String Commodity;
	 private String NmfcCode;
	 private String StccCode;
	 private String CustomerPartNum;
	 private String ManufacturerPartNum;
	 private String DistributorPartNum;
	 private String uom;
	 private String Cube;
	 
	 public LoadLineItemDetails() {
		super();
		
	}
	public LoadLineItemDetails(String itemId, String description, double freightClass, String commodity,
			String nmfcCode, String stccCode, String customerPartNum, String manufacturerPartNum,
			String distributorPartNum, String uom, String cube, String hazardousMaterial) {
		super();
		ItemId = itemId;
		Description = description;
		FreightClass = freightClass;
		Commodity = commodity;
		NmfcCode = nmfcCode;
		StccCode = stccCode;
		CustomerPartNum = customerPartNum;
		ManufacturerPartNum = manufacturerPartNum;
		DistributorPartNum = distributorPartNum;
		this.uom = uom;
		Cube = cube;
		HazardousMaterial = hazardousMaterial;
	}
	private String HazardousMaterial;

	
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
	public double getFreightClass() {
		return FreightClass;
	}
	public void setFreightClass(double freightClass) {
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
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public String getCube() {
		return Cube;
	}
	public void setCube(String cube) {
		Cube = cube;
	}
	public String getHazardousMaterial() {
		return HazardousMaterial;
	}
	public void setHazardousMaterial(String hazardousMaterial) {
		HazardousMaterial = hazardousMaterial;
	}
	 
}
