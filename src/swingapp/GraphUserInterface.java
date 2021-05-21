package swingapp;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import entities.ExtractRequestInfo;
import entities.HeaderDetails;

public class GraphUserInterface extends AbstractTableModel {
	
	private String[] columnName= new String[] {"SenderID", "ReceiverID", "DocTypeID", "DocCount", "Date"};
	private List<String[]> tableValues= new ArrayList<String[]>();
	
	private String[] columnName1= new String[] { "Date", "Reason"};
	private List<String[]> tableValues1= new ArrayList<String[]>();

	@Override
	public int getRowCount() {
		
		return tableValues.size();
	}

	@Override
	public int getColumnCount() {
		
		return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		
		return tableValues.get(rowIndex)[columnIndex];
	}
	
	@Override
	public String getColumnName(int column)
	{
		return columnName[column];
		
	}
	
	public void setData(List<HeaderDetails> headerdetails)
	{
		tableValues= new ArrayList<>();
		for(HeaderDetails hd:headerdetails)
		
			tableValues.add(new String[]{hd.getSenderID(), hd.getReceiverID(), hd.getDocTypeID(), hd.getDocCount(), hd.getDate()});
		
		fireTableChanged(null);
				
	}

	public void setInfo(List<ExtractRequestInfo> exreqinf) {
		
		
		tableValues= new ArrayList<>();
		for(ExtractRequestInfo eri:exreqinf)
		
			tableValues.add(new String[]{eri.getReason(), eri.getDate()});
		
		fireTableChanged(null);
		
	}
	

}