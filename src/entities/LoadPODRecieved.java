package entities;

public class LoadPODRecieved {

	 private String PODReceived;
	 private String ProofOfPickupReceived;
	 private String Status;
	 private String AssignedTo;
	 private String Owner;
	 
	public LoadPODRecieved(String pODReceived, String proofOfPickupReceived, String status, String assignedTo,
			String owner) {
		super();
		PODReceived = pODReceived;
		ProofOfPickupReceived = proofOfPickupReceived;
		Status = status;
		AssignedTo = assignedTo;
		Owner = owner;
	}
	public LoadPODRecieved() {
		super();
		
	}
	public String getPODReceived() {
		return PODReceived;
	}
	public void setPODReceived(String pODReceived) {
		PODReceived = pODReceived;
	}
	public String getProofOfPickupReceived() {
		return ProofOfPickupReceived;
	}
	public void setProofOfPickupReceived(String proofOfPickupReceived) {
		ProofOfPickupReceived = proofOfPickupReceived;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getAssignedTo() {
		return AssignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		AssignedTo = assignedTo;
	}
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String owner) {
		Owner = owner;
	}
}
