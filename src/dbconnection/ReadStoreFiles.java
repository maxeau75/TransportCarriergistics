package dbconnection;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import entities.EntityImplementation;



public class ReadStoreFiles {

	public static void main(String[] args) throws SQLException, IOException {
		
		String SQL="INSERT INTO StoreXmlFileTable(File_Name,File_Size,File_Extension,File_Content)VALUES(?,?,?,?)";
		Path dir = Paths.get("sftpFiles");
		
			 
			 try
			 {
			 Stream <Path> list = Files.list(dir); 
			 Connection conn=SingletonConnection.getConnection();
			 PreparedStatement ps= conn.prepareStatement(SQL); 
				
				  
			  List<Path> pathList = list.collect(Collectors.toList());
			  System.out.println("Following files are saved in database.. ");
			  
			//Thread.sleep(10000);
			  
			  for(Path path: pathList)
			  {
				  System.out.println(path.getFileName());
				  File file = path.toFile();
				  String fileName = file.getName();
				  long fileLength = file.length();
				  long fileSize = fileLength/1024;
				  
				  ps.setString(1, fileName);
				  ps.setLong(2, fileSize);
				  
				  ps.setString(3, fileName.substring(fileName.lastIndexOf(".")+1));
				  ps.setCharacterStream(4, new FileReader(file), fileLength);
				  
				  ps.addBatch();
			  }
			  
			  	//ps.close(); 
				//conn.close();
			  
			  System.out.println("-----------------------------------");
			  int[] executeBatch = ps.executeBatch();
			  for(int i: executeBatch)
			  {
				  System.out.println(i);
			  }
			  
			 
			  
			  //try { Files.walk(Paths.get("inputFiles")).filter(Files::isRegularFile)
			  //.map(Path::toFile).forEach(File::delete); } catch(FileNotFoundException e) {
			  //}
			  //System.out.println("Files deleted successfully");
			  
			  //ps.close(); 
			  //conn.close();
			  
			  
		
	       
	
		/*//Connection conn=SingletonConnection.getConnection();
		//String file = null;
		//PreparedStatement ps= conn.prepareStatement();
		
		
		try {
			//InputStream file = getClass().getClassLoader().getResourceAsStream("C:\\Users\\maxea\\Documents\\workspace-sts-3.9.11.RELEASE\\TransportCarriergistics\\Transport-Carriergistics-27970968447.xml");
			
			File file = new File("C:\\Users\\maxea\\Documents\\workspace-sts-3.9.11.RELEASE\\TransportCarriergistics\\CarrierInv-Carriergistics-27890825181.xml");
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			//Document doc = builder.parse(inputStream(file));
			
			// get the first element
	         Element element = doc.getDocumentElement();

	         // get all child nodes
	         //NodeList nodes = element.getChildNodes();
	         
	         //Normalize the xml structure
	         doc.getDocumentElement().normalize();
	         NodeList mercurygate = doc.getElementsByTagName("MercuryGate");

	         // print the text content of each child
	         for (int i = 0; i < mercurygate.getLength(); i++) {
	            //System.out.println("" + mercurygate.item(i).getTextContent());
	        	 Node mercury = mercurygate.item(i);
	        	 
	        	 if(mercury.getNodeType() == Node.ELEMENT_NODE)
	        	 {
	        		 Element mercuryElement= (Element) mercury;
	        		 System.out.println("Mercury Gate Content: "+mercuryElement.getTagName());
	        		 
	        		 NodeList mercuryDetails = mercury.getChildNodes();
	        		 
	        		 for(int j = 0; j<mercuryDetails.getLength(); j++)
	        		 {
	        			 Node detail= mercuryDetails.item(j);
	        			 if(detail.getNodeType() == Node.ELEMENT_NODE)
	        			 {
	        				 Element detailElement = (Element) detail;
	        				 System.out.println(" " +detailElement.getTagName()+":   "+detailElement.getTextContent());
	        			 }			 
	        		 }
	        	 }
	         }
		}
			 catch(Exception e) {
			System.out.println(e);
		 
		}
	
	  }  		 
	}*/
			  
			  
	
	}
			 
			 
	 catch(Exception e) {
	System.out.println(e);
	 }
			 
	} 

}
