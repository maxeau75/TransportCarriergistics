package entities;

public class ShipmentLineItemNumberAndWeights {
	
	  private String lineNumber;
	  private String internalId;
	  private String type;
	  private String uom;
	  private String Weight;
	  
	public ShipmentLineItemNumberAndWeights() {
		super();
		
	}
	public ShipmentLineItemNumberAndWeights(String lineNumber, String internalId, String type, String uom,
			String weight) {
		super();
		this.lineNumber = lineNumber;
		this.internalId = internalId;
		this.type = type;
		this.uom = uom;
		Weight = weight;
	}
	public String getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(String lineNumber) {
		this.lineNumber = lineNumber;
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
