package entities;

public class LoadQuantities {
	
	 private String type;
	 public LoadQuantities(String type, String uom, double quantity) {
		super();
		this.type = type;
		this.uom = uom;
		Quantity = quantity;
	}
	public LoadQuantities() {
		super();
		// TODO Auto-generated constructor stub
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
	private String uom;
	 private double Quantity;

}
