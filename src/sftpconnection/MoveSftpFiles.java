package sftpconnection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.Vector;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;
import com.jcraft.jsch.ChannelSftp.LsEntry;

public class MoveSftpFiles {
	
        
	public static void main(String[] args) throws FileNotFoundException, SftpException {
		
		
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
		
		/*File file = new File("inputFiles/");
		FileInputStream fis = new FileInputStream(file);
		channelSftp.put(fis, file.getName());
		System.out.println("Files tranfered successfully to host");
		fis.close();*/
		
		@SuppressWarnings("unchecked")
		Vector<LsEntry> fileList =channelSftp.ls("/");
		//if (fileList != null && !fileList.isEmpty())
		
		for(int i=0; i<fileList.size(); i++)
		{
			ChannelSftp.LsEntry lsEntry = (ChannelSftp.LsEntry) fileList.get(i);
			String filename=lsEntry.getFilename();
			System.out.println(filename);
			
			java.io.File file = new java.io.File(filename);
			if(file.exists())
			{
				System.out.println("File exists");
				//System.exit(1);
			}
			
			java.io.PrintWriter output = new java.io.PrintWriter(file);
		
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
