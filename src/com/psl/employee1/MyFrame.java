package com.psl.employee1;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/*
 * <p>UI for Employee Management System
 * @author Amit
 * @version version
 * 
 */
public class MyFrame extends JFrame {
	
	private JLabel empType;
	private JLabel empIdLabel;
	private JLabel fnameLabel;
	private JLabel lnameLabel;
	private JLabel salaryLabel;
	private JLabel gradeLabel;
	private JLabel joiningdateLabel;
	private JLabel mediclaimLabel;
	private JLabel ContractorLabel;
	private JLabel bonusLabel;
	
	private JLabel empText;
	private JTextField fnameText;
	private JTextField lnameText;
	private JTextField salaryJText;
	private JTextField joiningtext;
	private JTextField joinMonthText;
	private JTextField joinYearText;
	private JTextField mediclaimText;
	private JTextField bonusText;
	private JTextField contractorText;
	
	private JComboBox  gradeText;
	private JComboBox  emptypeText;
	
	private JButton addButton;
	private JButton viewButton;
	
	public MyFrame()
	{
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(400, 600);
		this.setBackground(Color.BLACK);
		this.setTitle("Employee Management System");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);	
		
		empType=new JLabel("Employee Type :");
		empType.setBounds(20, 20, 100, 50);
		this.add(empType);
		
		emptypeText=new JComboBox();
		emptypeText.setBounds(120,40,230,20);
		emptypeText.addItem("Project Manager");
		emptypeText.addItem("Technical Associate");
		emptypeText.addItem("Technical Associate(Contract)");
		this.add(emptypeText);
		emptypeText.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				if(emptypeText.getSelectedIndex()==0||emptypeText.getSelectedIndex()==1)
				{
					contractorText.setVisible(false);
					ContractorLabel.setVisible(false);
				}
				else{
					contractorText.setVisible(true);
					ContractorLabel.setVisible(true);
				}
			}
		});
		
		
		
		empIdLabel=new JLabel("Employee ID :");
		empIdLabel.setBounds(20, 50, 100, 50);
		this.add(empIdLabel);
		
		empText = new JLabel();
		empText.setBounds(120, 70, 100, 20);
		this.add(empText);
		
		
		
		fnameLabel = new JLabel("First Name : ");
		fnameLabel.setBounds(20, 80, 100, 50);
		this.add(fnameLabel);
		
		fnameText = new JTextField(30);
		fnameText.setBounds(120, 100, 100, 20);
		this.add(fnameText);
		
		
		lnameLabel = new JLabel("Last Name : ");
		lnameLabel.setBounds(20, 110, 100, 50);
		this.add(lnameLabel);
		
		lnameText = new JTextField(30);
		lnameText.setBounds(120, 130, 100, 20);
		this.add(lnameText);
		
		
		salaryLabel=new JLabel("Salary :");
		salaryLabel.setBounds(20, 140, 100, 50);
		this.add(salaryLabel);
		
		salaryJText=new JTextField(30);
		salaryJText.setBounds(120,160,100,20);
		this.add(salaryJText);
		
		
		
		gradeLabel=new JLabel("Grade :");
		gradeLabel.setBounds(20, 170, 100,50);
		this.add(gradeLabel);
		
		gradeText=new JComboBox();
		gradeText.setBounds(120,190,100,20);
		gradeText.addItem("3.0");
		gradeText.addItem("4.0");
		gradeText.addItem("5.0");
		gradeText.addItem("6.0");
		this.add(gradeText);
		
		
		joiningdateLabel=new JLabel("joining Date :");
		joiningdateLabel.setBounds(20, 200, 100,50);
		this.add(joiningdateLabel);
		
		joiningtext=new JTextField(30);
		joiningtext.setBounds(120,220,20,20);
		this.add(joiningtext);
		
		joinMonthText=new JTextField(30);
		joinMonthText.setBounds(145,220,20,20);
		this.add(joinMonthText);
		
		joinYearText=new JTextField(30);
		joinYearText.setBounds(170,220,50,20);
		this.add(joinYearText);
		
		mediclaimLabel=new JLabel("Mediclaim :");
		mediclaimLabel.setBounds(20, 230, 100,50);
		this.add(mediclaimLabel);
		
		mediclaimText=new JTextField(30);
		mediclaimText.setBounds(120,250,100,20);
		mediclaimText.setToolTipText("Dont Enter anything");
		mediclaimText.setCursor(new Cursor(Cursor.WAIT_CURSOR));
		this.add(mediclaimText);
		
		
		bonusLabel=new JLabel("Bonus :");
		bonusLabel.setBounds(20, 260, 100,50);
		this.add(bonusLabel);
		
		bonusText=new JTextField(30);
		bonusText.setBounds(120,280,100,20);
		this.add(bonusText);
		
		ContractorLabel=new JLabel("contractor :");
		ContractorLabel.setBounds(250, 140, 100,50);
		this.add(ContractorLabel);
		
		contractorText=new JTextField();
		contractorText.setBounds(250, 190, 100,20);
		this.add(contractorText);
		
		contractorText.setVisible(false);
		ContractorLabel.setVisible(false);
		
		// View Information
		viewButton=new JButton("View");
		viewButton.setBounds(120,310,70, 25);
		this.add(viewButton);
		
		// Add Information
		
		addButton = new JButton("Add");
		addButton.setBounds(20, 310, 70, 25);
		this.add(addButton);
		addButton.addActionListener(  new AddActionListener(){
			   
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
		}
		});
			
	}
	
	
	public static void main(String[] args)
	{
		MyFrame mf = new MyFrame();
	}


	class AddActionListener implements ActionListener
	{
	   MyFrame frame;  
	   public AddActionListener(){
		    }
	   public AddActionListener(MyFrame f){
		   this.frame = f;
	   }
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

		}
		
	}

}




