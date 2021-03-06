package sftpconnection;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
import com.jcraft.jsch.SftpATTRS;
import com.jcraft.jsch.SftpException;

import entities.EntityImplementation;

public class JavaSftpConnection {
        
	public static void main(String[] args) throws SftpException, IOException {
		
		
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
		Vector<LsEntry> fileList =channelSftp.ls("/");
		
		for(int i=0; i<fileList.size(); i++)
		{
			ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry) fileList.get(i);
			String filename=lsEntry.getFilename();
			System.out.println(filename);
			
		
			 File sourcePath = new File("C:\\Users\\maxea\\Documents\\workspace-sts-3.9.11.RELEASE\\TransportCarriergistics\\sftpFiles"); 
			  File destinationPath = new File("C:\\Users\\maxea\\Documents\\workspace-sts-3.9.11.RELEASE\\TransportCarriergistics\\inputFiles\\sftpFiles");
				  
		  
			  
				  if(sourcePath!= null && !fileList.isEmpty()) {
					
					  // Traverse the file tree and copy each file/directory
					 
				  Files.copy(sourcePath.toPath(), destinationPath.toPath(),StandardCopyOption.REPLACE_EXISTING);
				  System.out.println("File copied successfully");
				  
				  //delete the original file
				  sourcePath.delete();
		                   
				  
				  }
				  
				  else
				  {
					  System.out.println("File copy failed");
				  }

		
			
		            
			
		//Thread.sleep(10000);
		//String newpath;
		//String oldpath;
		//channelsftp.rename(oldpath="inboundFiles/newFile.txt", newpath="inboundFiles/newFile2.txt");
		//channelsftp.put(src="C:/Users/maxea/OneDrive/Desktop/javasftpconnection/src/newFile.txt", dst="inboundFiles/newFile.txt");
		
		
	
		//channelsftp.get(src="inboundFiles/newFile2.txt", dst="newFile2.txt");
		//channelSftp.get("/", "inputFiles/");
		//channelSftp.get("inboundFiles/Transport-Carriergistics-27882433266.xml", "Transport-Carriergistics-27882433266.xml");
			        
			 
		System.out.println("Session Connected:" +session.isConnected());
		channelSftp.disconnect();
		session.disconnect();
					            		
					}					 
		}	
		catch(Exception ex) {
	            ex.printStackTrace();
		 
		}  
		
	
}
	        
}
		



		        
			
		 
	
		         

			 

	



	


