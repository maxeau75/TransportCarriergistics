package entities;

public class ShipmentDropDate {
	
	 private String droptype;
	 private String Date;
	 private String PriceSheets;
	 
	public ShipmentDropDate() {
		super();
		
	}
	public ShipmentDropDate(String droptype, String date, String priceSheets) {
		super();
		this.droptype = droptype;
		Date = date;
		PriceSheets = priceSheets;
	}
	public String getDroptype() {
		return droptype;
	}
	public void setDroptype(String droptype) {
		this.droptype = droptype;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public String getPriceSheets() {
		return PriceSheets;
	}
	public void setPriceSheets(String priceSheets) {
		PriceSheets = priceSheets;
	}
	 

}
