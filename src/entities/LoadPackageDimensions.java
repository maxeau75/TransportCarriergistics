package entities;

public class LoadPackageDimensions {
	
	 private String packagetype;
	 private String internalId;
     private String type;
	 public String getPackagetype() {
		return packagetype;
	}
	public LoadPackageDimensions() {
		super();
		
	}
	public LoadPackageDimensions(String packagetype, String internalId, String type, String uom, String dim,
			double dimension) {
		super();
		this.packagetype = packagetype;
		this.internalId = internalId;
		this.type = type;
		this.uom = uom;
		this.dim = dim;
		Dimension = dimension;
	}
	public void setPackagetype(String packagetype) {
		this.packagetype = packagetype;
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
	private String uom;
	 private String dim;
	 private double Dimension;

}
