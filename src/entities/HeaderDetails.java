package entities;

import java.io.File;
import java.io.Serializable;
import java.util.Scanner;

public class HeaderDetails implements Serializable {
	
	private String SenderID;
	private String ReceiverID;
	private String DocTypeID;
	private String DocCount;
	private String Date;
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
	//private String DocCount;
	//private String Date;
	public void readData() {
		
		
	}
	
	
	/*	public void readData(){
		
	try(Scanner input = new Scanner(new File("C:/Users/maxea/Documents/workspace-sts-3.9.11.RELEASE/TransportCarriergistics/Transport-Carriergistics-27882433266.xml"))){
		
		while(input.hasNextLine())
		{
			SenderID="";
			String line;
			line=input.nextLine();
			
			//Now process the line of text for each data item
			try(Scanner data= new Scanner(line))
			{
				while(!data.hasNextInt())
				SenderID += data.next()+"  ";
			}
			SenderID = SenderID.trim();
			
			Scanner data = null;
			//Get ReceiverID
			if(data.hasNextInt())
			{
				ReceiverID= data.toString();
			}
			
			//Get DocTypeID
			if(data.hasNextInt())
			{
				DocTypeID= data.toString();
			}
			
			//Get DocCount
			if(data.hasNextInt())
			{
				DocCount= data.toString();
			}
			
			//Get Date
			if(data.hasNextInt())
			{
				Date= data.toString();
			}
			
		}
	
		//Check data
		System.out.println(SenderID+"\t"+ReceiverID+"/t"+DocTypeID+"\t"+DocCount+"\t"+Date);
		
	} catch(Exception e) {
		System.out.println(e);
	
	
	}*/
}

