package entities;

public class ExtraShipmentDetails {
	
	 private String Comments;
	 private String Status;
	 private String AssignedTo;
	 private String Owner;
	 private String Audits;
	 private String QuoteDetail;
	 private String QuotedTo;
	 private String QuotePhone;
	 private String QuoteFax;
	 private String QuoteEmail;
	 private String QuoteDate;
	 private String QuoteBy;
	 
	 
	public ExtraShipmentDetails() {
		super();
		
	}
	public ExtraShipmentDetails(String comments, String status, String assignedTo, String owner, String audits,
			String quoteDetail, String quotedTo, String quotePhone, String quoteFax, String quoteEmail,
			String quoteDate, String quoteBy) {
		super();
		Comments = comments;
		Status = status;
		AssignedTo = assignedTo;
		Owner = owner;
		Audits = audits;
		QuoteDetail = quoteDetail;
		QuotedTo = quotedTo;
		QuotePhone = quotePhone;
		QuoteFax = quoteFax;
		QuoteEmail = quoteEmail;
		QuoteDate = quoteDate;
		QuoteBy = quoteBy;
	}
	public String getComments() {
		return Comments;
	}
	public void setComments(String comments) {
		Comments = comments;
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
	public String getAudits() {
		return Audits;
	}
	public void setAudits(String audits) {
		Audits = audits;
	}
	public String getQuoteDetail() {
		return QuoteDetail;
	}
	public void setQuoteDetail(String quoteDetail) {
		QuoteDetail = quoteDetail;
	}
	public String getQuotedTo() {
		return QuotedTo;
	}
	public void setQuotedTo(String quotedTo) {
		QuotedTo = quotedTo;
	}
	public String getQuotePhone() {
		return QuotePhone;
	}
	public void setQuotePhone(String quotePhone) {
		QuotePhone = quotePhone;
	}
	public String getQuoteFax() {
		return QuoteFax;
	}
	public void setQuoteFax(String quoteFax) {
		QuoteFax = quoteFax;
	}
	public String getQuoteEmail() {
		return QuoteEmail;
	}
	public void setQuoteEmail(String quoteEmail) {
		QuoteEmail = quoteEmail;
	}
	public String getQuoteDate() {
		return QuoteDate;
	}
	public void setQuoteDate(String quoteDate) {
		QuoteDate = quoteDate;
	}
	public String getQuoteBy() {
		return QuoteBy;
	}
	public void setQuoteBy(String quoteBy) {
		QuoteBy = quoteBy;
	}
	 
	 

}
