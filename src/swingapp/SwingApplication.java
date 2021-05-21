package swingapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import entities.EntityImplementation;
import entities.ExtractRequestInfo;
import entities.HeaderDetails;

public class SwingApplication extends JFrame {
	
	private JLabel jLabelKW = new JLabel("Key Word:");
	private JTextField jTextFieldKW= new  JTextField(12);
	private JButton jButtonSearch= new JButton("Search");
	private JTable jTableHeaderDetails= new JTable();
	private GraphUserInterface jtableModel;
	
	
	public SwingApplication() 
	{
		//JPanel North
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new BorderLayout());
		JPanel jPanelN= new JPanel();
		jPanelN.setLayout(new FlowLayout());
		jPanelN.add(jLabelKW);
		jPanelN.add(jTextFieldKW);
		jPanelN.add(jButtonSearch);
		this.add(jPanelN, BorderLayout.NORTH);
		
		//JPanel Center
		JPanel jPanelC= new JPanel();
		jtableModel= new  GraphUserInterface();
		jTableHeaderDetails= new JTable(jtableModel);
		JScrollPane jScrollPane= new JScrollPane(jTableHeaderDetails);
		jPanelC.setLayout(new GridLayout());
		jPanelC.add(jScrollPane);
		this.add(jPanelC, BorderLayout.CENTER);
		
		this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
		this.setVisible(true);
		
		jButtonSearch.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String kw= jTextFieldKW.getText();
				EntityImplementation entities= new EntityImplementation();
				List<HeaderDetails> hdetails= entities.getHeaderDetailsByKeyword(kw);
				jtableModel.setData(hdetails);
				
				/*EntityImplementation entities1= new EntityImplementation();
				List<ExtractRequestInfo> extractinf= entities1.getExtractRequestInfo();
				jtableModel.setInfo(extractinf);*/
				
			}		
			
		});
		
	
	}
	public static void main(String[] args)
	{
		new SwingApplication();
	}
}
