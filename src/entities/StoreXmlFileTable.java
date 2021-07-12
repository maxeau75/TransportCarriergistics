package entities;

public class StoreXmlFileTable {
	
	          //private String File_Id;
		      private String File_Name;
		      private String File_Size;
		      private String File_Extension;
		      private String File_Content;
		      
			public StoreXmlFileTable(String file_Name, String file_Size, String file_Extension,
					String file_Content) {
				super();
				//File_Id = file_Id;
				File_Name = file_Name;
				File_Size = file_Size;
				File_Extension = file_Extension;
				File_Content = file_Content;
				
			}
			public StoreXmlFileTable() {
				super();
				
			}
			//public String getFile_Id() {
				//return File_Id;
			//}
			//public void setFile_Id(String file_Id) {
				//File_Id = file_Id;
			//}
			public String getFile_Name() {
				return File_Name;
			}
			public void setFile_Name(String file_Name) {
				File_Name = file_Name;
			}
			public String getFile_Size() {
				return File_Size;
			}
			public void setFile_Size(String file_Size) {
				File_Size = file_Size;
			}
			public String getFile_Extension() {
				return File_Extension;
			}
			public void setFile_Extension(String file_Extension) {
				File_Extension = file_Extension;
			}
			public String getFile_Content() {
				return File_Content;
			}
			public void setFile_Content(String file_Content) {
				File_Content = file_Content;
			}
		      
}
