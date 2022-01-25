/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;



import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.*;




public class SearchCustomer  extends JFrame implements ActionListener{

	
	JTextField c1;
	JButton b1,b2,b3;
	JTable t1;
        ResultSet rs2,rs;
	
	SearchCustomer() throws SQLException{
		
		
		JLabel l1 = new JLabel("Search Customer");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(490,25,200,30);
		add(l1);
		
		
		
		JLabel l2 = new JLabel("Enter Customer ID To Search Customer");		
		l2.setBounds(50,100,250,30);
		add(l2);
		
		c1 = new JTextField();
		c1.setBounds(480,100,300,25);
		c1.setBackground(Color.white);
		add(c1);                
                
		
		JLabel l3 = new JLabel("Customer Name");		
		l3.setBounds(10,170,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Gender");		
		l4.setBounds(140,170,100,30);
		add(l4);
		
		JLabel l5 = new JLabel("country");		
		l5.setBounds(260,170,100,30);
		add(l5);
		
		JLabel l6 = new JLabel("Vehicleno");		
		l6.setBounds(370,170,100,30);
		add(l6);
		
		JLabel l7 = new JLabel("deposit");
		l7.setBounds(500,170,100,30);
		add(l7);
                
                JLabel l8 = new JLabel("email");
		l8.setBounds(620,170,100,30);
		add(l8);
		
		JLabel l9 = new JLabel("contactno");
		l9.setBounds(740,170,100,30);
		add(l9);
		
                JLabel l10 = new JLabel("ID");
		l10.setBounds(860,170,100,30);
		add(l10);
                
                JLabel l11 = new JLabel("Date");
		l11.setBounds(980,170,100,30);
		add(l11);
                
		t1 = new JTable();
		t1.setBounds(0,200,1100,200);
		add(t1);
                
                
                b3 = new JButton("Search");
		b3.addActionListener(this);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(350,420,120,30);
		add(b3);
		
		b2 = new JButton("Back");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(750,420,120,30);
		b2.addActionListener(this);
		add(b2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setBounds(40,40,1254,836);
		setVisible(true);
                
                


		
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		 if(ae.getSource()==b2) {
			
			new Reception().setVisible(true);			
			this.setVisible(false);	
			
			
		}else if(ae.getSource()==b3){
                    
                    	try {
				
			              
                conn c2 = new conn();

		

              
              String qre= String.format("select name, gender,country, vehicleno,deposit,email,contactno,number,date from customer where number = ('"+c1.getText()+"')");

            System.out.println(qre);
            rs2 = c2.s.executeQuery(qre);
				
	    t1.setModel(DbUtils.resultSetToTableModel(rs2));
				
				
				
				
			}catch(Exception e) {
                                JOptionPane.showMessageDialog(null, "Error : Not Found!!!" + e);	 
				System.out.println(e);
			}
                }
                
                
                

        
		
	}
	
	
	public static void main(String[] args) throws SQLException {

		new DeleteCustomer();

	}

}









