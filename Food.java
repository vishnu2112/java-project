package oops;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Food 
{

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JTextField textField_5;
	private JTextField textField_6;
	
	
	protected JLabel label_17;
	
	
	
	
	double us = 0.01;
    double germany = 0.02;
    double japan = 0.03;
    double china= 0.015;
    double  nigeria= 1.2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Food window = new Food();
					window.frame.setVisible(true);
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Food() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() 
	{
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 30));
		frame.setBounds(0, 0, 1200, 687);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_1.setBounds(47, 111, 465, 241);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		
		JLayeredPane layeredPane_1 = new JLayeredPane();
		layeredPane_1.setBounds(232, 9, 1, 1);
		panel_1.add(layeredPane_1);
		
		
		JLabel lblNewLabel = new JLabel("Chicken frankie");
		lblNewLabel.setBounds(34, 20, 174, 27);
		panel_1.add(lblNewLabel);
		
		
		JLabel label_1 = new JLabel("Chicken Burger");
		label_1.setBounds(34, 50, 190, 27);
		panel_1.add(label_1);
		
		
		JLabel label_2 = new JLabel("Chicken Nuggets");
		label_2.setBounds(34, 80, 174, 27);
		panel_1.add(label_2);
		
		
		JLabel label_3 = new JLabel("French Fries");
		label_3.setBounds(34, 110, 174, 27);
		panel_1.add(label_3);
		
		
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(220, 20, 190, 27);
		panel_1.add(textField);
		textField.setText("0");
		textField.setColumns(10);
		
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_1.setColumns(10);
		textField_1.setBounds(220, 50, 190, 27);
		textField_1.setText("0");
		panel_1.add(textField_1);
		
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_2.setColumns(10);
		textField_2.setBounds(220, 80, 190, 27);
		textField_2.setText("0");
		panel_1.add(textField_2);
		
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_3.setBounds(220, 110, 190, 27);
		panel_1.add(textField_3);
		textField_3.setText("0");
		textField_3.setColumns(10);
		
		
		JLabel label_4 = new JLabel("Drinks");
		label_4.setBounds(34, 140, 174, 27);
		panel_1.add(label_4);
		
		
		JLabel label_5 = new JLabel("Qty");
		label_5.setBounds(220, 140, 190, 27);
		
		panel_1.add(label_5);
		
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select drinks ", "mango", "coke", "apple", "banana", "badam", "grape", "sprite", "watermelon"}));
		comboBox.setBounds(34, 175, 121, 22);
		panel_1.add(comboBox);
		
		
		JCheckBox chckbxTax = new JCheckBox("Tax");
		chckbxTax.setSelected(true);
		chckbxTax.setEnabled(false);
//		if(chckbxTax.isSelected()) {
//			chckbxTax.setSelected(true);
//		}
		chckbxTax.setBounds(34, 205, 121, 23);
		panel_1.add(chckbxTax);
		
		
		JCheckBox chckbxH = new JCheckBox("Home delivery");
		chckbxH.setBounds(220, 205, 129, 23);
		panel_1.add(chckbxH);
		
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_5.setColumns(10);
		textField_5.setBounds(220, 175, 190, 27);
		textField_5.setText("0");
		panel_1.add(textField_5);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_2.setBounds(550, 111, 306, 241);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		
		JLayeredPane layeredPane_2 = new JLayeredPane();
		layeredPane_2.setBounds(152, 9, 1, 1);
		panel_2.add(layeredPane_2);
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select One", "US", "Germany", "Japan", "China", "Nigeria"}));
		comboBox_1.setBounds(61, 56, 182, 22);
		panel_2.add(comboBox_1);
		
		
		JLabel lblCurrencyConverter = new JLabel("Currency Converter");
		lblCurrencyConverter.setFont(new Font("FreeSerif", Font.BOLD, 18));
		lblCurrencyConverter.setBounds(61, 20, 192, 25);
		panel_2.add(lblCurrencyConverter);
		
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		textField_6.setColumns(10);
		textField_6.setBounds(79, 103, 153, 27);
		panel_2.add(textField_6);
		
		
		JLabel label_17 = new JLabel(" ");
		label_17.setFont(new Font("Dialog", Font.BOLD, 12));
		label_17.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_17.setBounds(79, 142, 153, 27);
		panel_2.add(label_17);
		
		
		JButton btnConvert = new JButton("Convert");
		btnConvert.setBounds(12, 191, 117, 25);
		btnConvert.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				double indian_rupee = Double.parseDouble(textField_6.getText());
				if(comboBox_1.getSelectedItem().equals("US")) 
				{
					String c1 = String.format("%.2f", indian_rupee* us);
					label_17.setText(c1);
				}
				
				
				if(comboBox_1.getSelectedItem().equals("Germany")) 
				{
					String c1 = String.format("%.2f", indian_rupee* germany);
					label_17.setText(c1);
				}
				
				if(comboBox_1.getSelectedItem().equals("Japan")) 
				{
					String c1 = String.format("%.2f", indian_rupee* japan);
					label_17.setText(c1);
				}
				
				if(comboBox_1.getSelectedItem().equals("China")) 
				{
					String c1 = String.format("%.2f", indian_rupee* china);
					label_17.setText(c1);
				}
				
				if(comboBox_1.getSelectedItem().equals("Nigeria")) 
				{
					String c1 = String.format("%.2f", indian_rupee* nigeria);
					label_17.setText(c1);
				}
			}
		});	
		panel_2.add(btnConvert);
		
		
		
		JButton btnClose = new JButton("Close");
		btnClose.setBounds(177, 191, 117, 25);
		btnClose.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				textField_6.setText(null);
				label_17.setText(null);
				comboBox_1.setSelectedItem("Select One");
			}
		});	
		panel_2.add(btnClose);
		
		
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel.setBounds(47, 364, 465, 135);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		
		
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(232, 9, 1, 1);
		panel.add(layeredPane);
		
		
		
		JLabel label_6 = new JLabel("Cost of Drinks");
		label_6.setBounds(34, 20, 190, 27);
		panel.add(label_6);
		
		
		JLabel label_7 = new JLabel("Cost of food");
		label_7.setBounds(34, 50, 190, 27);
		panel.add(label_7);
		
		
		JLabel label_8 = new JLabel("Cost of Delivery");
		label_8.setBounds(34, 80, 190, 27);
		panel.add(label_8);
		
		
		lblNewLabel_1 = new JLabel(" ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(220, 20, 190, 27);
		lblNewLabel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		panel.add(lblNewLabel_1);
		
		
		JLabel label_9 = new JLabel(" ");
		label_9.setHorizontalAlignment(SwingConstants.RIGHT);
		label_9.setFont(new Font("Dialog", Font.BOLD, 12));
		label_9.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_9.setBounds(220, 50, 190, 27);
		panel.add(label_9);
		
		
		JLabel label_10 = new JLabel(" ");
		label_10.setHorizontalAlignment(SwingConstants.RIGHT);
		label_10.setFont(new Font("Dialog", Font.BOLD, 12));
		label_10.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_10.setBounds(220, 80, 190, 27);
		panel.add(label_10);
		

		
		
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_3.setBounds(550, 364, 306, 135);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		
		JLayeredPane layeredPane_3 = new JLayeredPane();
		layeredPane_3.setBounds(135, 9, 1, 1);
		panel_3.add(layeredPane_3);
		
		
		JLabel label_11 = new JLabel(" ");
		label_11.setHorizontalAlignment(SwingConstants.RIGHT);
		label_11.setFont(new Font("Dialog", Font.BOLD, 12));
		label_11.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_11.setBounds(155, 20, 139, 27);
		panel_3.add(label_11);
		
		
		JLabel label_12 = new JLabel(" ");
		label_12.setHorizontalAlignment(SwingConstants.RIGHT);
		label_12.setFont(new Font("Dialog", Font.BOLD, 12));
		label_12.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_12.setBounds(155, 50, 139, 27);
		panel_3.add(label_12);
		
		
		JLabel label_13 = new JLabel(" ");
		label_13.setHorizontalAlignment(SwingConstants.RIGHT);
		label_13.setFont(new Font("Dialog", Font.BOLD, 12));
		label_13.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		label_13.setBounds(155, 80, 139, 27);
		panel_3.add(label_13);
		
		
		JLabel label_14 = new JLabel("Tax");
		label_14.setBounds(20, 20, 100, 27);
		panel_3.add(label_14);
		
		
		JLabel label_15 = new JLabel("Sub Total");
		label_15.setBounds(20, 50, 100, 27);
		panel_3.add(label_15);
		
		
		JLabel label_16 = new JLabel("Total");
		label_16.setBounds(20, 80, 100, 27);
		panel_3.add(label_16);
		
		
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_4.setBounds(887, 88, 272, 432);
		frame.getContentPane().add(panel_4);
		panel_4.setLayout(null);
		
		
		JLayeredPane layeredPane_4 = new JLayeredPane();
		layeredPane_4.setBounds(135, 9, 1, 1);
		panel_4.add(layeredPane_4);
		
		
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 9, 255, 415);
		panel_4.add(tabbedPane);
		
		
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("Receipt", null, panel_6, null);
		panel_6.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(0, 12, 250, 398);
		panel_6.add(textArea);
		
		//0,12,250,398
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 4));
		panel_5.setBounds(47, 532, 1112, 101);
		frame.getContentPane().add(panel_5);
		panel_5.setLayout(null);
		
		
		JLayeredPane layeredPane_5 = new JLayeredPane();
		layeredPane_5.setBounds(555, 9, 1, 1);
		panel_5.add(layeredPane_5);
		
		
		JButton btnReceipt = new JButton("Receipt");
		btnReceipt.setBounds(138, 37, 117, 25);
		btnReceipt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				
				
				double cf = Double.parseDouble(textField.getText());
				double icf = 50;
				double f;
				
				f = (cf * icf);
				String fMeal = String.format("%.2f", f);
				
				
				double cb = Double.parseDouble(textField_1.getText());
				double icb = 100;
				double b;
				
				b = (cb * icb);
				String bMeal = String.format("%.2f", b);
				
				
				double cn = Double.parseDouble(textField_2.getText());
				double icn = 75;
				double n;
				
				n = (cn * icn);
				String nMeal = String.format("%.2f", n);
				
				
				
				double ff = Double.parseDouble(textField_3.getText());
				double icff = 80;
				double fff;
				
				fff = (ff * icff);
				String ffMeal = String.format("%.2f", fff);
				
				double drinksd = Double.parseDouble(lblNewLabel_1.getText());
				double total = Double.parseDouble(label_13.getText());
				
				 textArea.append(
						 "\t Swagruha foods \t\n" +
						 "\t Food ordered Bill \t\n " + 
				         "\nChicken Frankie: " + cf + "  "+ fMeal +
				         "\nChicken Burger: " + cb +"  "+ bMeal +
				         "\nChicken nuggets: " + cn +"  "+ nMeal +
				         "\nFrench Fries: " + ff +"  "+ ffMeal +
				         "\n Drinks : " + drinksd +
				         "\n Tax :" + " 50"+
				         "\n Total : " + total +
				         "\n\n\t Thanks for visiting us " +
				         "\n\t  Visit Again" 
				         
				         );
				
			}
		});
		panel_5.add(btnReceipt);
		
		
		
		JButton btnTotal = new JButton("Total");
		btnTotal.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				double cf = Double.parseDouble(textField.getText());
				double icf = 50;
				double f;
				
				f = (cf * icf);
				String fMeal = String.format("%.2f", f);
				label_9.setText(fMeal);
				
				
			
				double cb = Double.parseDouble(textField_1.getText());
				double icb = 100;
				double b;
				
				b = (cb * icb);
				String bMeal = String.format("%.2f", f + b);
				label_9.setText(bMeal);
				
				
				
				double cn = Double.parseDouble(textField_2.getText());
				double icn = 75;
				double n;
				
				n = (cn * icn);
				String nMeal = String.format("%.2f", f + b + n);
				label_9.setText(nMeal); 
				
				
				
				double ff = Double.parseDouble(textField_3.getText());
				double icff = 80;
				double fff;
				
				fff = (ff * icff);
				String ffMeal = String.format("%.2f", f + b + n + fff);
				label_9.setText(ffMeal);
				
				
				
				
				
				double iDelivery = 50;
				if(chckbxH.isSelected()) 
				{
					String pDelivery = String.format("%.2f", iDelivery);
					label_10.setText(pDelivery);
				}
				else 
				{
					label_10.setText("0");
				}
				
				
				double drinksf = Double.parseDouble(textField_5.getText());
				double dmango  = 30*drinksf;
				double dcoke  = 20*drinksf;
				double dapple  = 25*drinksf;
				double dbanana  = 20*drinksf;
				double dbadam = 40*drinksf;
				double dgrape  = 20*drinksf;
				double dsprite  = 20*drinksf;
				double dwatermelon  = 20*drinksf;
				
				
				
				if(comboBox.getSelectedItem().equals("mango")) 
				{
					String cmango = String.format("%.2f", dmango);
					lblNewLabel_1.setText(cmango);
				}
				
				
				if(comboBox.getSelectedItem().equals("apple")) 
				{
					String capple = String.format("%.2f", dapple);
					lblNewLabel_1.setText(capple);
				}
				
				
				if(comboBox.getSelectedItem().equals("coke")) 
				{
					String ccoke = String.format("%.2f", dcoke);
					lblNewLabel_1.setText(ccoke);
				}
				
				
				if(comboBox.getSelectedItem().equals("banana") )
				{
					String cbanana = String.format("%.2f", dbanana);
					lblNewLabel_1.setText(cbanana);
				}
				
				
				if(comboBox.getSelectedItem().equals("badam")) 
				{
					String cbadam = String.format("%.2f", dbadam);
					lblNewLabel_1.setText(cbadam);
				}
				
				
				if(comboBox.getSelectedItem().equals("grape"))
				{
					String cgrape = String.format("%.2f", dgrape);
					lblNewLabel_1.setText(cgrape);
				}
				
				
				if(comboBox.getSelectedItem().equals("sprite"))
				{
					String csprite = String.format("%.2f", dsprite);
					lblNewLabel_1.setText(csprite);
				}
				
				
				if(comboBox.getSelectedItem().equals("watermelon")) 
				{
					String cwatermelon = String.format("%.2f", dwatermelon);
					lblNewLabel_1.setText(cwatermelon);
				}
				
				if(comboBox.getSelectedItem().equals("Select drinks"))
				{
					
					lblNewLabel_1.setText("0");
				}
				
				
				
				double ct1 = Double.parseDouble(lblNewLabel_1.getText());
				double ct2 = Double.parseDouble(label_9.getText());
				double ct3 = Double.parseDouble(label_10.getText());
				double allt = (ct1 + ct2 + ct3)/50;
				
				if(chckbxTax.isSelected()) 
				
				{
					String it = String.format("%.2f", allt);
					label_11.setText(it);
				}
				
				
				double ct4 = Double.parseDouble(label_11.getText());
				
				double subt = (ct1 + ct2 + ct3);
				String st = String.format("%.2f", subt);
				label_12.setText(st);
				
				double t = (ct1 + ct2 + ct3 + ct4);
				String tt = String.format("%.2f", t);
				label_13.setText(tt);
				
				
			}
			});
		
		btnTotal.setBounds(352, 37, 117, 25);
		panel_5.add(btnTotal);
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(545, 37, 117, 25);
		btnExit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				System.exit(0);
			}
		});
		
		panel_5.add(btnExit);
		
		
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(773, 37, 117, 25);
		btnReset.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			
			textField.setText("0");	
			textField_1.setText("0");	
			textField_2.setText("0");	
			textField_3.setText("0");	
			textField_5.setText("0");	
			lblNewLabel_1.setText("0");	
			label_9.setText("0");	
			label_10.setText("0");	
			textField_6.setText(null);	
			label_17.setText(null);	
			label_11.setText("0");	
			label_12.setText("0");	
			label_13.setText("0");	
			textArea.setText(null);
			comboBox_1.setSelectedItem("Select One");	
			comboBox.setSelectedItem("Select drinks");	
			chckbxTax.setSelected(false);
			chckbxH.setSelected(false);
			
			}
		});
		
		panel_5.add(btnReset);
		
		JLabel label = new JLabel("Food Ordering System");
		label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 24));
		label.setBounds(421,28 , 369, 35);
		frame.getContentPane().add(label);
	}
 
}
