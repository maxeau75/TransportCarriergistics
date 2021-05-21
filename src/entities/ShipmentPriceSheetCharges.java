package entities;

public class ShipmentPriceSheetCharges {
	
	 private String itemGroupId;
	 private String sequenceNum;
	 private String internalId;
	 private String type;
	 private String Description;
	 private String EdiCode;
	 private String Amount;
	 private String Rate;
	 private String RateQualifier;
	 private String Quantity;
	 private String Weight;
	 private String DimWeight;
	 private String FreightClass;
	 private String FakFreightClass;
	 private String IsMin;
	 private String IsMax;
	 private String IsNontaxable;
	 private String Comments;
	 
	public ShipmentPriceSheetCharges() {
		super();
	
	}
	public ShipmentPriceSheetCharges(String itemGroupId, String sequenceNum, String internalId, String type,
			String description, String ediCode, String amount, String rate, String rateQualifier, String quantity,
			String weight, String dimWeight, String freightClass, String fakFreightClass, String isMin, String isMax,
			String isNontaxable, String comments) {
		super();
		this.itemGroupId = itemGroupId;
		this.sequenceNum = sequenceNum;
		this.internalId = internalId;
		this.type = type;
		Description = description;
		EdiCode = ediCode;
		Amount = amount;
		Rate = rate;
		RateQualifier = rateQualifier;
		Quantity = quantity;
		Weight = weight;
		DimWeight = dimWeight;
		FreightClass = freightClass;
		FakFreightClass = fakFreightClass;
		IsMin = isMin;
		IsMax = isMax;
		IsNontaxable = isNontaxable;
		Comments = comments;
	}
	public String getItemGroupId() {
		return itemGroupId;
	}
	public void setItemGroupId(String itemGroupId) {
		this.itemGroupId = itemGroupId;
	}
	public String getSequenceNum() {
		return sequenceNum;
	}
	public void setSequenceNum(String sequenceNum) {
		this.sequenceNum = sequenceNum;
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
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getEdiCode() {
		return EdiCode;
	}
	public void setEdiCode(String ediCode) {
		EdiCode = ediCode;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getRate() {
		return Rate;
	}
	public void setRate(String rate) {
		Rate = rate;
	}
	public String getRateQualifier() {
		return RateQualifier;
	}
	public void setRateQualifier(String rateQualifier) {
		RateQualifier = rateQualifier;
	}
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}
	public String getDimWeight() {
		return DimWeight;
	}
	public void setDimWeight(String dimWeight) {
		DimWeight = dimWeight;
	}
	public String getFreightClass() {
		return FreightClass;
	}
	public void setFreightClass(String freightClass) {
		FreightClass = freightClass;
	}
	public String getFakFreightClass() {
		return FakFreightClass;
	}
	public void setFakFreightClass(String fakFreightClass) {
		FakFreightClass = fakFreightClass;
	}
	public String getIsMin() {
		return IsMin;
	}
	public void setIsMin(String isMin) {
		IsMin = isMin;
	}
	public String getIsMax() {
		return IsMax;
	}
	public void setIsMax(String isMax) {
		IsMax = isMax;
	}
	public String getIsNontaxable() {
		return IsNontaxable;
	}
	public void setIsNontaxable(String isNontaxable) {
		IsNontaxable = isNontaxable;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	 

}
