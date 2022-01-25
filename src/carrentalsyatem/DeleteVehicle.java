///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package carrentalsyatem;
//
//
//
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.ResultSet;
//import javax.swing.JButton;
//import javax.swing.JCheckBox;
//import javax.swing.JComboBox;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTable;
//import net.proteanit.sql.DbUtils;
//
//
//
//import java.awt.Color;
//import java.awt.*;
//import javax.swing.*;
//import net.proteanit.sql.DbUtils;
//import java.awt.event.*;
//import java.sql.*;
//
//
///**
// *
// * @author Hp
// */
//public class DeleteVehicle extends JFrame implements ActionListener{
//
//	
//	JTextField c1;
//	JButton b1,b2;
//	JTable t1;	
//	
//	DeleteVehicle(){
//		
//		
//		JLabel l1 = new JLabel("Search Vechiels");
//		l1.setFont(new Font("Tohoma",Font.BOLD,20));
//		l1.setForeground(Color.blue);
//		l1.setBounds(290,25,200,30);
//		add(l1);
//		
//		
//		
//		JLabel l2 = new JLabel("Enter Vechile Number To Delete Vechile");		
//		l2.setBounds(50,100,100,30);
//		add(l2);
//		
//		c1 = new JTextField();
//		c1.setBounds(180,100,150,25);
//		c1.setBackground(Color.white);
//		add(c1);
//		
//
//		
//		
//		JLabel l3 = new JLabel("Vehicle Number");		
//		l3.setBounds(30,170,100,30);
//		add(l3);
//		
//		JLabel l4 = new JLabel("Availability");		
//		l4.setBounds(170,170,100,30);
//		add(l4);
//		
//		JLabel l5 = new JLabel("Status");		
//		l5.setBounds(330,170,100,30);
//		add(l5);
//		
//		JLabel l6 = new JLabel("Price");		
//		l6.setBounds(460,170,100,30);
//		add(l6);
//		
//		JLabel l7 = new JLabel("Vehicle Type");
//		l7.setBounds(590,170,100,30);
//		add(l7);
//		
//		
//		
//		t1 = new JTable();
//		t1.setBounds(0,200,700,200);
//		add(t1);
//		
//		
//		b1 = new JButton("Delete");
//		b1.setBackground(Color.black);
//		b1.setForeground(Color.white);
//		b1.setBounds(200,420,120,30);
//		b1.addActionListener(this);
//		add(b1);
//		
//		
//		b2 = new JButton("Back");
//		b2.setBackground(Color.black);
//		b2.setForeground(Color.white);
//		b2.setBounds(350,420,120,30);
//		b2.addActionListener(this);
//		add(b2);
//		
//		
//		getContentPane().setBackground(Color.white);
//		setLayout(null);
//		setBounds(400,200,700,500);
//		setVisible(true);		
//		
//	}
//	
//	public void actionPerformed(ActionEvent ae) {
//		
//		if(ae.getSource()==b1) {
//			
//			try {
//				
//				String str = "DELETE * from room where room = '"+c1.getText()+"'";
//				
//				conn c = new conn();
//	
//				ResultSet rs = c.s.executeQuery(str);
//				t1.setModel(DbUtils.resultSetToTableModel(rs));				
//			       JOptionPane.showMessageDialog(null, "Vehicles added successfully");	 
//	
//				
//				
//				
//			}catch(Exception e) {
//				System.out.println(e);	
//                                JOptionPane.showMessageDialog(null, e);	 
//
//			}
//			
//			
//		}else if(ae.getSource()==b2) {
//			
//			new Reception().setVisible(true);
//			this.setVisible(false);
//			
//			
//		}
//		
//	}
//	
//	
//	public static void main(String[] args) {
//
//		new DeleteVehicle();
//
//	}
//
//}
//
//
//







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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
/**
 *
 * @author Hp
 */
public class DeleteVehicle  extends JFrame implements ActionListener{

	
	JTextField c1;
	JButton b1,b2,b3;
	JTable t1;
        ResultSet rs2,rs;
	
	DeleteVehicle() throws SQLException{
		
		
		JLabel l1 = new JLabel("Delete Vehicle");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(490,25,200,30);
		add(l1);
		
		
		
		JLabel l2 = new JLabel("Enter Vehicle_NO To Delete ");		
		l2.setBounds(50,100,250,30);
		add(l2);
		
		c1 = new JTextField();
		c1.setBounds(480,100,300,25);
		c1.setBackground(Color.white);
		add(c1);                
                
		
		JLabel l3 = new JLabel("Vehicle_No");		
		l3.setBounds(30,170,100,30);
		add(l3);
		
		JLabel l4 = new JLabel("Availablity");		
		l4.setBounds(250,170,100,30);
		add(l4);
		
		JLabel l5 = new JLabel("Status");		
		l5.setBounds(540,170,100,30);
		add(l5);
		
		JLabel l6 = new JLabel("Fule Type");		
		l6.setBounds(660,170,100,30);
		add(l6);
		
		JLabel l7 = new JLabel("price");
		l7.setBounds(900,170,100,30);
		add(l7);
                
                
                
		t1 = new JTable();
		t1.setBounds(0,200,1100,200);
		add(t1);
                
                
                b3 = new JButton("Load Data");
		b3.addActionListener(this);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(350,420,120,30);
		add(b3);
		
		
		b1 = new JButton("Delete");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(550,420,120,30);
		b1.addActionListener(this);
		add(b1);
		
		
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
		
		if(ae.getSource()==b1) {
                    String id=c1.getText();
			      int dialogResult = JOptionPane.showConfirmDialog (null, "Do you want to Delete the record","Warning",JOptionPane.YES_NO_OPTION);
                              if(dialogResult == JOptionPane.YES_OPTION){
			try {
				
				String str = "DELETE  from vehicle where vehicleno = '"+c1.getText()+"'";
				
				conn c = new conn();
	
				int rs = c.s.executeUpdate(str);
//				t1.setModel(DbUtils.resultSetToTableModel(rs));				
			       JOptionPane.showMessageDialog(null, "Vehicle Deleted successfully");	 		
			}catch(Exception e) {
				System.out.println(e);	
                         JOptionPane.showMessageDialog(null, e);	 
			}
			
}	
		}else if(ae.getSource()==b2) {
			
			new AdminFram().setVisible(true);
			this.setVisible(false);
			
			
		}else if(ae.getSource()==b3){
                    
                    	try {
				
			              
                conn c2 = new conn();

		

              
              String qre= String.format("select vehicleno, availablity, status, fule, price from vehicle where vehicleno = ('"+c1.getText()+"')");

            System.out.println(qre);
            rs2 = c2.s.executeQuery(qre);
				
	    t1.setModel(DbUtils.resultSetToTableModel(rs2));
				
				
				
				
			}catch(Exception e) {
				System.out.println(e);
			}
                }
                
                
                

        
		
	}
	
	
	public static void main(String[] args) throws SQLException {

		new DeleteVehicle();

	}

}




