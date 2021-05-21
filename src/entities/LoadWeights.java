package entities;

public class LoadWeights {
	
	 private String type;
	 public LoadWeights(String type, String uom, double weight) {
		super();
		this.type = type;
		this.uom = uom;
		Weight = weight;
	}
	public LoadWeights() {
		super();
		
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
