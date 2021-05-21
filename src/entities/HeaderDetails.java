package entities;

import java.io.Serializable;

public class HeaderDetails implements Serializable {
	
	private String SenderID;
	private String ReceiverID;
	private String DocTypeID;
	public HeaderDetails(String senderID, String receiverID, String docTypeID, String docCount, String date) {
		super();
		SenderID = senderID;
		ReceiverID = receiverID;
		DocTypeID = docTypeID;
		DocCount = docCount;
		Date = date;
	}
	public HeaderDetails() {
		super();
		
	}
	public String getSenderID() {
		return SenderID;
	}
	public void setSenderID(String senderID) {
		SenderID = senderID;
	}
	public String getReceiverID() {
		return ReceiverID;
	}
	public void setReceiverID(String receiverID) {
		ReceiverID = receiverID;
	}
	public String getDocTypeID() {
		return DocTypeID;
	}
	public void setDocTypeID(String docTypeID) {
		DocTypeID = docTypeID;
	}
	public String getDocCount() {
		return DocCount;
	}
	public void setDocCount(String string) {
		DocCount = string;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	private String DocCount;
	private String Date;
	//public void setDocCount(int int1) {
		// TODO Auto-generated method stub
		
	//}
	

}
