package entities;

public class LoadDimensions {
	
	 private String type;
	 private String uom;
	 private String dim;
	 private double Dimension;
	public LoadDimensions(String type, String uom, String dim, double dimension) {
		super();
		this.type = type;
		this.uom = uom;
		this.dim = dim;
		Dimension = dimension;
	}
	public LoadDimensions() {
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
	public String getDim() {
		return dim;
	}
	public void setDim(String dim) {
		this.dim = dim;
	}
	public double getDimension() {
		return Dimension;
	}
	public void setDimension(double dimension) {
		Dimension = dimension;
	}

}
