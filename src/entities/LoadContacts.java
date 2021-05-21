package entities;

public class LoadContacts {
	
	 private String oid;
	 private String type;
	 private String Name;
	 private String ContactMethods;
	 
	public LoadContacts() {
		super();
		
	}
	public LoadContacts(String oid, String type, String name, String contactMethods) {
		super();
		this.oid = oid;
		this.type = type;
		Name = name;
		ContactMethods = contactMethods;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getContactMethods() {
		return ContactMethods;
	}
	public void setContactMethods(String contactMethods) {
		ContactMethods = contactMethods;
	}	 

}
