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




public class ReturnLogs  extends JFrame implements ActionListener{

	
	JTextField c1;
	JButton b1,b2,b3;
	JTable t1;
        ResultSet rs2,rs;
	
	ReturnLogs() throws SQLException{
		
		
		JLabel l1 = new JLabel(" Return Detail");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(490,25,200,30);
		add(l1);            
                
		
		JLabel l3 = new JLabel("Customer Cnic");		
		l3.setBounds(10,170,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Contact no");		
		l4.setBounds(170,170,100,30);
		add(l4);
		
		JLabel l5 = new JLabel("Email");		
		l5.setBounds(330,170,100,30);
		add(l5);
		
		JLabel l6 = new JLabel("Vehicleno");		
		l6.setBounds(480,170,100,30);
		add(l6);
		
		JLabel l7 = new JLabel("Fine");
		l7.setBounds(630,170,100,30);
		add(l7);
                
                JLabel l8 = new JLabel("Total");
		l8.setBounds(820,170,100,30);
		add(l8);
		
		JLabel l9 = new JLabel("Date");
		l9.setBounds(990,170,100,30);
		add(l9);
		
              
                
		t1 = new JTable();
		t1.setBounds(0,200,1100,200);
		add(t1);
                
                
                b3 = new JButton("Load Data");
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

		

              
              String qre= String.format("select cnic, number,email, vehicleno,fine,bill,date from returnvehicle");

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

		new ReturnLogs();

	}

}










