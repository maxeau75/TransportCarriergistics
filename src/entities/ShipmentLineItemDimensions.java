package entities;

public class ShipmentLineItemDimensions {
	
	 private String Dimension;
	 private String dim;
	 private String uom;
	 private String type;
	 private String HarmonizedTariffCode;
	 private String PortOfLading;
	 private String CountryOfOrigin;
	 private String CountryOfManufacture;
	 private String CustomsValue;
	 private String CustomsValueCurrency;
	 private String InsuredValue;
	 private String InsuredValueCurrency;
	 private String AESExportCode;
     private String ScheduleBNumber;
	 private String Domestic;
	 private String ECCN;
	 private String OriginationCountry;
	 private String ManufacturingCountry;
	 private String LicenseNumber;
	 private String LicenseType;
	 
	public ShipmentLineItemDimensions() {
		super();
		
	}
	public ShipmentLineItemDimensions(String dimension, String dim, String uom, String type,
			String harmonizedTariffCode, String portOfLading, String countryOfOrigin, String countryOfManufacture,
			String customsValue, String customsValueCurrency, String insuredValue, String insuredValueCurrency,
			String aESExportCode, String scheduleBNumber, String domestic, String eCCN, String originationCountry,
			String manufacturingCountry, String licenseNumber, String licenseType) {
		super();
		Dimension = dimension;
		this.dim = dim;
		this.uom = uom;
		this.type = type;
		HarmonizedTariffCode = harmonizedTariffCode;
		PortOfLading = portOfLading;
		CountryOfOrigin = countryOfOrigin;
		this.CountryOfManufacture = countryOfManufacture;
		CustomsValue = customsValue;
		CustomsValueCurrency = customsValueCurrency;
		InsuredValue = insuredValue;
		InsuredValueCurrency = insuredValueCurrency;
		AESExportCode = aESExportCode;
		ScheduleBNumber = scheduleBNumber;
		Domestic = domestic;
		ECCN = eCCN;
		OriginationCountry = originationCountry;
		ManufacturingCountry = manufacturingCountry;
		LicenseNumber = licenseNumber;
		LicenseType = licenseType;
	}
	public String getDimension() {
		return Dimension;
	}
	public void setDimension(String dimension) {
		Dimension = dimension;
	}
	public String getDim() {
		return dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
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
	public String getHarmonizedTariffCode() {
		return HarmonizedTariffCode;
	}
	public void setHarmonizedTariffCode(String harmonizedTariffCode) {
		HarmonizedTariffCode = harmonizedTariffCode;
	}
	public String getPortOfLading() {
		return PortOfLading;
	}
	public void setPortOfLading(String portOfLading) {
		PortOfLading = portOfLading;
	}
	public String getCountryOfOrigin() {
		return CountryOfOrigin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		CountryOfOrigin = countryOfOrigin;
	}
	public String getCountryOfManufacture() {
		return CountryOfManufacture;
	}
	public void setCountryOfManufacture(String countryOfManufacture) {
		this.CountryOfManufacture = countryOfManufacture;
	}
	public String getCustomsValue() {
		return CustomsValue;
	}
	public void setCustomsValue(String customsValue) {
		CustomsValue = customsValue;
	}
	public String getCustomsValueCurrency() {
		return CustomsValueCurrency;
	}
	public void setCustomsValueCurrency(String customsValueCurrency) {
		CustomsValueCurrency = customsValueCurrency;
	}
	public String getInsuredValue() {
		return InsuredValue;
	}
	public void setInsuredValue(String insuredValue) {
		InsuredValue = insuredValue;
	}
	public String getInsuredValueCurrency() {
		return InsuredValueCurrency;
	}
	public void setInsuredValueCurrency(String insuredValueCurrency) {
		InsuredValueCurrency = insuredValueCurrency;
	}
	public String getAESExportCode() {
		return AESExportCode;
	}
	public void setAESExportCode(String aESExportCode) {
		AESExportCode = aESExportCode;
	}
	public String getScheduleBNumber() {
		return ScheduleBNumber;
	}
	public void setScheduleBNumber(String scheduleBNumber) {
		ScheduleBNumber = scheduleBNumber;
	}
	public String getDomestic() {
		return Domestic;
	}
	public void setDomestic(String domestic) {
		Domestic = domestic;
	}
	public String getECCN() {
		return ECCN;
	}
	public void setECCN(String eCCN) {
		ECCN = eCCN;
	}
	public String getOriginationCountry() {
		return OriginationCountry;
	}
	public void setOriginationCountry(String originationCountry) {
		OriginationCountry = originationCountry;
	}
	public String getManufacturingCountry() {
		return ManufacturingCountry;
	}
	public void setManufacturingCountry(String manufacturingCountry) {
		ManufacturingCountry = manufacturingCountry;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getLicenseType() {
		return LicenseType;
	}
	public void setLicenseType(String licenseType) {
		LicenseType = licenseType;
	}	
	
}
