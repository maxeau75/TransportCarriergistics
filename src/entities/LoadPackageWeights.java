package entities;

public class LoadPackageWeights {
	
	private String packagetype;
	private String internalId;
    private String type;
	private String uom;
	private String Weight;
	public String getPackagetype() {
		return packagetype;
	}
	public LoadPackageWeights() {
		super();
		
	}
	public LoadPackageWeights(String packagetype, String internalId, String type, String uom, String weight) {
		super();
		this.packagetype = packagetype;
		this.internalId = internalId;
		this.type = type;
		this.uom = uom;
		Weight = weight;
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
	public String getWeight() {
		return Weight;
	}
	public void setWeight(String weight) {
		Weight = weight;
	}

}
