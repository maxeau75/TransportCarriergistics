package entities;

public class ShipmentMargins {
	
	private String type;
	private String currencyCode;
	private String MarginRevenue;
	private String MarginCost;
	private String MarginValue;
	
	public ShipmentMargins() {
		super();
		
	}
	public ShipmentMargins(String type, String currencyCode, String marginRevenue, String marginCost,
			String marginValue) {
		super();
		this.type = type;
		this.currencyCode = currencyCode;
		MarginRevenue = marginRevenue;
		MarginCost = marginCost;
		MarginValue = marginValue;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getMarginRevenue() {
		return MarginRevenue;
	}
	public void setMarginRevenue(String marginRevenue) {
		MarginRevenue = marginRevenue;
	}
	public String getMarginCost() {
		return MarginCost;
	}
	public void setMarginCost(String marginCost) {
		MarginCost = marginCost;
	}
	public String getMarginValue() {
		return MarginValue;
	}
	public void setMarginValue(String marginValue) {
		MarginValue = marginValue;
	}
	

}
