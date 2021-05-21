package entities;

public class LoadItemQuantities {
	
	 private String internalId;
	 private String lineNumber;
	 private String type;
	 private String uom;
	 private double Quantity;
	 
	public LoadItemQuantities() {
		super();
		
	}
	public LoadItemQuantities(String internalId, String lineNumber, String type, String uom, double quantity) {
		super();
		this.internalId = internalId;
		this.lineNumber = lineNumber;
		this.type = type;
		this.uom = uom;
		Quantity = quantity;
	}
	public String getInternalId() {
		return internalId;
	}
	public void setInternalId(String internalId) {
		this.internalId = internalId;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUom() {
		return uom;
	}
	public void setUom(String uom) {
		this.uom = uom;
	}
	public double getQuantity() {
		return Quantity;
	}
	public void setQuantity(double quantity) {
		Quantity = quantity;
	}

}
