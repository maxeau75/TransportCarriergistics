package sftpconnection;


import java.nio.file.Files;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Properties;
import java.util.Vector;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import entities.EntityImplementation;

public class JavaSftpConnection extends EntityImplementation {
	

	public static void main(String[] args) {
		
		try
		{
		String user="u102408074-MGDump";
		String password="Fleet2020!";
		
		Properties config= new Properties();
		config.put("StrictHostKeyChecking", "no");
		String host= "access845522724.webspace-data.io";
		
		
		JSch jSch= new JSch();
		Session session= jSch.getSession(user, host);
		session.setPassword(password);
		session.setConfig(config);
		session.connect();
		
		ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
		//System.out.println("Session connected:" + session.isConnected());
		//Upload files using vertor
		channelSftp.connect();
		channelSftp = (ChannelSftp)channelSftp;
		
		@SuppressWarnings("unchecked")
		Vector<LsEntry> fileList =channelSftp.ls("inboundFiles/");
		for(int i=0; i<fileList.size(); i++)
		{
			ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry) fileList.get(i);
			System.out.println(lsEntry.getFilename());
		//}
		
		
		//channelSftp.get("inboundFiles/CarrierInv-Carriergistics-27890825181.xml", "inputFiles/CarrierInv-Carriergistics-27890825181.xml");
		//channelSftp.get("inboundFiles/CustomerInv-Carriergistics-27956653714.xml", "inputFiles/CustomerInv-Carriergistics-27956653714.xml");
		
		//channelsftp.cd(type); // Change Directory on SFTP Server
        //channelsftp.rm("latest.xml"); // This method removes the file from remote server
	
		
					//LsEntry lsEntry = null;
			
			
					if (fileList != null && !fileList.isEmpty())
					{
						for(LsEntry files:fileList) {
							
							if(files !=null) {
						
								String fileNameToget= files.getFilename();
						//String fileNameToget= lsEntry.getFilename();
						if(fileNameToget.startsWith("Transport-Carriergistics") || fileNameToget.startsWith("CustomerInv-Carriergistics") || fileNameToget.startsWith("CarrierInv-Carriergistics"))
						{
							continue;
						}
						
						//channelSftp.get(fileNameToget);
						
						/*String fileName=lsEntry.getFilename();
						String filePath= lsEntry.getFilename();
						//if(fileName.startsWith("Transport-Carriergistics"))
						//{
							continue;
							//ChannelSftp channelsftp1;
							channelSftp.get("/" +filePath, "/" +fileName);
							channelSftp.get( "/" +fileName);
							System.out.println(lsEntry.getFilename());*/
						}
						
						//ChannelSftp channelsftp1;
						//channelsftp.get("/" +filePath, "/" +fileName);
						//channelsftp.get( "/" +fileName);*/
						//System.out.println(lsEntry.getFilename());
						
					//channelsftp.get(src="inboundFiles/", dst="Transport-Carriergistics-27970968447.xml");	
						
							//channelsftp.get("/" +filePath, "/" +fileName);
							//channelsftp.get( "/" +fileName);
							//System.out.println(lsEntry.getFilename());
							
							//String fileName= lsEntry.getFilename();
							//Change Directory on SFTP Server
							//channelsftp.cd(dst); 
							//Remove the file from remote server
					        //channelsftp.rm("latest.xml"); 
				

		//String newpath;
		//String oldpath;
		//channelsftp.rename(oldpath="inboundFiles/newFile.txt", newpath="inboundFiles/newFile2.txt");
		//channelsftp.put(src="C:/Users/maxea/OneDrive/Desktop/javasftpconnection/src/newFile.txt", dst="inboundFiles/newFile.txt");
		
		
	
		//channelsftp.get(src="inboundFiles/newFile2.txt", dst="newFile2.txt");
		//channelSftp.get("inboundFiles/Transport-Carriergistics-27970968447.xml", "Transport-Carriergistics-27970968447.xml");
		//channelSftp.get("inboundFiles/Transport-Carriergistics-27882433266.xml", "Transport-Carriergistics-27882433266.xml");
		
	
		System.out.println("Session Connected:" +session.isConnected());
		channelSftp.disconnect();
		session.disconnect();
		
						}
		}
		
		}
		 } catch (Exception ex) {
	            ex.printStackTrace();
		 }
	
		
	
}


}
	
	

		

	
	




	


