package entities;

public class LoadExtraDetails {
	
	 private double HandlingUnits;
	 public LoadExtraDetails(double handlingUnits, String relatedCustomerLoads, String comments, String services) {
		super();
		HandlingUnits = handlingUnits;
		RelatedCustomerLoads = relatedCustomerLoads;
		Comments = comments;
		Services = services;
	}
	public LoadExtraDetails() {
		super();
		
	}
	public double getHandlingUnits() {
		return HandlingUnits;
	}
	public void setHandlingUnits(double handlingUnits) {
		HandlingUnits = handlingUnits;
	}
	public String getRelatedCustomerLoads() {
		return RelatedCustomerLoads;
	}
	public void setRelatedCustomerLoads(String relatedCustomerLoads) {
		RelatedCustomerLoads = relatedCustomerLoads;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}
	public String getServices() {
		return Services;
	}
	public void setServices(String services) {
		Services = services;
	}
	private String RelatedCustomerLoads;
	 private String Comments;
	 private String Services;

}
