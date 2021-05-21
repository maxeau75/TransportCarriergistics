package entities;

public class LoadEventWeights {
	
	 private String  WeightType;
	 private String uom;
	 private String Weight;
	 
	 
	public LoadEventWeights() {
		super();
	
	}
	public LoadEventWeights(String weightType, String uom, String weight) {
		super();
		WeightType = weightType;
		this.uom = uom;
		Weight = weight;
	}
	public String getWeightType() {
		return WeightType;
	}
	public void setWeightType(String weightType) {
		WeightType = weightType;
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
