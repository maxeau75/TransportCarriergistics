package sftpconnection;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SavingFilesInDB extends JavaSftpConnection {

	public static void main(String[] args) {
		
		
		String sql= "INSERT INTO StoreXmlFileTable(File_Name, File_Size, File_Extension, File_Content) VALUES(?, ?, ?, ?)";
		Path dir= Paths.get("inputFiles");
		try
		{
			Stream<Path> list= Files.list(dir); Statement DbUtils = null;
			Connection connection= DbUtils.getConnection();
			PreparedStatement ps= connection.prepareStatement(sql);
					{
						List<Path> pathList= list.collect(Collectors.toList());
						System.out.println("Following files are saved in database");
						for(Path path : pathList)
						{
							System.out.println(path.getFileName());
							File file = path.toFile();
							String fileName= file.getName();
							long fileLength= file.length();
							long fileLengthInKB= fileLength/1024;
							
							ps.setString(1,  fileName);
							ps.setLong(2,  fileLengthInKB);
							
							ps.setString(3,  fileName.substring(fileName.lastIndexOf("."+1)));
							ps.setCharacterStream(4, new FileReader(file),fileLength);
							
							ps.addBatch();
						}
						
						System.out.println("------------------------------------");
						int[] executeBatch= ps.executeBatch();
						for(int i:executeBatch)
								{
									System.out.println(i);
								}
						
					}

			
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	}

	
}
