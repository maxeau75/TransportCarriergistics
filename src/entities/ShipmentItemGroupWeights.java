package entities;

public class ShipmentItemGroupWeights {
	
	  private String type;
	  private String uom;
	  private String Weight;
	  
	public ShipmentItemGroupWeights() {
		super();
		
	}
	public ShipmentItemGroupWeights(String type, String uom, String weight) {
		super();
		this.type = type;
		this.uom = uom;
		Weight = weight;
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
