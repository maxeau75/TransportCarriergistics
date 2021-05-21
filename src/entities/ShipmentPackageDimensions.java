package entities;

public class ShipmentPackageDimensions {
	
	  private String type;
	  private String uom;
	  private String dim;
	  private String Dimension;
	  
	public ShipmentPackageDimensions() {
		super();
		
	}
	public ShipmentPackageDimensions(String type, String uom, String dim, String dimension) {
		super();
		this.type = type;
		this.uom = uom;
		this.dim = dim;
		Dimension = dimension;
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
	public String getDim() {
		return dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}
	public String getDimension() {
		return Dimension;
	}
	public void setDimension(String dimension) {
		Dimension = dimension;
	}
	  

}
