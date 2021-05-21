package user;


import java.util.List;
import java.util.Scanner;

import entities.EntityImplementation;
import entities.ExtractRequestInfo;
import entities.HeaderDetails;

public class ReadDataOnKeyboard {

	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner(System.in);
		EntityImplementation entities= new EntityImplementation();
		System.out.print("SenderID:"); String sender= keyboard.next();
		System.out.print("ReceiverID:"); String receiver= keyboard.next();
		System.out.print("DocType:"); String doctype= keyboard.next();
		System.out.print("DocCount:"); String doccount= keyboard.toString();
		System.out.print("Date:"); String date= keyboard.next();
		
		HeaderDetails hdt= new HeaderDetails(sender, receiver, doctype, doccount, date);
		entities.addHeaderDetails(hdt);
		
		System.out.print("Key word:?");
		String kw= keyboard.next();
		List<HeaderDetails> hdetails= entities.getHeaderDetailsByKeyword(kw);
		for(HeaderDetails hd:hdetails)
		{
			System.out.println(hd.getSenderID() + "\t" +hd.getReceiverID()+ "\t" +hd.getDocTypeID()
			+ "\t" + hd.getDocCount() + "\t" + hd.getDate());
		}
		
		
		//Scanner keyboard= new Scanner(System.in);
		EntityImplementation entities1= new EntityImplementation();
		System.out.print("SenderID:"); String reason= keyboard.next();
		System.out.print("Date:"); String date1= keyboard.next();
		
		ExtractRequestInfo extract= new ExtractRequestInfo(reason, date1);
		entities.addExtractRequestInfo(extract);
		
		
		List<ExtractRequestInfo> extractinf= entities.getExtractRequestInfo();
		for(ExtractRequestInfo eri:extractinf)
		{
			System.out.println(eri.getReason() + "\t" +eri.getDate());
		}

	}

}
