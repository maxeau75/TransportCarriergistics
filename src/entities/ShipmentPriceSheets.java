package entities;

public class ShipmentPriceSheets {
	
	 private String chargeModel ;
	 private String isSelected;
	 private String isAllocated;
	 private String currencyCode;
	 private String exchangeDate;
	 private String createBy;
	 private String createDate;
	 private String updateBy;
	 private String updateDate;
	 private String internalId;
	 private String type;
	 private String AccessorialTotal ;
	 private String SubTotal ;
	 private String NormalizedTotal;
	 private String ContractId;
	 private String  ContractName;
	 
	public ShipmentPriceSheets() {
		super();
		
	}
	public ShipmentPriceSheets(String chargeModel, String isSelected, String isAllocated, String currencyCode,
			String exchangeDate, String createBy, String createDate, String updateBy, String updateDate,
			String internalId, String type, String accessorialTotal, String subTotal, String normalizedTotal,
			String contractId, String contractName) {
		super();
		this.chargeModel = chargeModel;
		this.isSelected = isSelected;
		this.isAllocated = isAllocated;
		this.currencyCode = currencyCode;
		this.exchangeDate = exchangeDate;
		this.createBy = createBy;
		this.createDate = createDate;
		this.updateBy = updateBy;
		this.updateDate = updateDate;
		this.internalId = internalId;
		this.type = type;
		AccessorialTotal = accessorialTotal;
		SubTotal = subTotal;
		NormalizedTotal = normalizedTotal;
		ContractId = contractId;
		ContractName = contractName;
	}
	public String getChargeModel() {
		return chargeModel;
	}
	public void setChargeModel(String chargeModel) {
		this.chargeModel = chargeModel;
	}
	public String getIsSelected() {
		return isSelected;
	}
	public void setIsSelected(String isSelected) {
		this.isSelected = isSelected;
	}
	public String getIsAllocated() {
		return isAllocated;
	}
	public void setIsAllocated(String isAllocated) {
		this.isAllocated = isAllocated;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getExchangeDate() {
		return exchangeDate;
	}
	public void setExchangeDate(String exchangeDate) {
		this.exchangeDate = exchangeDate;
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
	public String getAccessorialTotal() {
		return AccessorialTotal;
	}
	public void setAccessorialTotal(String accessorialTotal) {
		AccessorialTotal = accessorialTotal;
	}
	public String getSubTotal() {
		return SubTotal;
	}
	public void setSubTotal(String subTotal) {
		SubTotal = subTotal;
	}
	public String getNormalizedTotal() {
		return NormalizedTotal;
	}
	public void setNormalizedTotal(String normalizedTotal) {
		NormalizedTotal = normalizedTotal;
	}
	public String getContractId() {
		return ContractId;
	}
	public void setContractId(String contractId) {
		ContractId = contractId;
	}
	public String getContractName() {
		return ContractName;
	}
	public void setContractName(String contractName) {
		ContractName = contractName;
	}	

}
