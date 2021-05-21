package entities;

public class LoadItemWeights {
	
	 private String internalId;
	 private String lineNumber;
	 private String type;
	 public LoadItemWeights() {
		super();
		
	}
	public LoadItemWeights(String internalId, String lineNumber, String type, String uom, double weight) {
		super();
		this.internalId = internalId;
		this.lineNumber = lineNumber;
		this.type = type;
		this.uom = uom;
		Weight = weight;
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
	public double getWeight() {
		return Weight;
	}
	public void setWeight(double weight) {
		Weight = weight;
	}
	private String uom;
	 private double Weight;

}
