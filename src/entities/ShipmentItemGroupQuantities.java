package entities;

public class ShipmentItemGroupQuantities {
	
	  private String type;
	  private String uom;
	  private String Quantity;
	  
	public ShipmentItemGroupQuantities() {
		super();
		
	}
	public ShipmentItemGroupQuantities(String type, String uom, String quantity) {
		super();
		this.type = type;
		this.uom = uom;
		Quantity = quantity;
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
	public String getQuantity() {
		return Quantity;
	}
	public void setQuantity(String quantity) {
		Quantity = quantity;
	}
	  
	  

}
