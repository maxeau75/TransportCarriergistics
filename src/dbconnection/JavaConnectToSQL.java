package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

import com.jcraft.jsch.SftpException;

public class JavaConnectToSQL {


	public static void main(String[] args) {
		
		
try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn= DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" + "databaseName=TransportCarriergisticsDB;user=admin;password=angeline08");
			PreparedStatement ps= conn.prepareStatement("select * from HeaderDetails");

			ResultSet rs= ps.executeQuery();
			
			ResultSetMetaData rsmd=rs.getMetaData();
			for(int i=1; i<=rsmd.getColumnCount(); i++)
			{
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			
			System.out.println();
			
			while(rs.next())
			{
				
				for(int i=1; i<=rsmd.getColumnCount(); i++)
				{
					System.out.print(rs.getString(i)+"\t");
				}
			
				System.out.println();
				
				//System.out.println(rs.getString("SenderID")+ " "
					//+rs.getString("ReceiverID") + " "+rs.getString("DocTypeID") + " "
						//+rs.getString("DocCount") + " "+rs.getString("Date"));
			}

			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	
	}
		

	}


