package entities;

public class LoadPaymentMethod {
	
	 private String Method;
	 private String Contact;
	 private String Comments;
	 
	 
	public LoadPaymentMethod() {
		super();
		
		
	}
	public LoadPaymentMethod(String method, String contact, String comments) {
		super();
		Method = method;
		Contact = contact;
		Comments = comments;
	}
	public String getMethod() {
		return Method;
	}
	public void setMethod(String method) {
		Method = method;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
	}

}
