/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class UpdateVehicle extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3,b4;
	Choice c1;
	JTextField t1,t2,t3,t4,t5,t6,t7;
	
	
	
	UpdateVehicle(){
		
		JLabel l1 = new JLabel("Update Vehicle");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(80,25,200,30);
		add(l1);
		
		
		JLabel l2 = new JLabel("Vehicle No");		
		l2.setBounds(20,80,100,30);
		add(l2);
		
		
		c1 = new Choice();
		try {
			
			conn c = new conn();
			
			ResultSet rs = c.s.executeQuery("select * from vehicle Where availablity = 'Available'");
			while(rs.next()) {
				
				c1.add(rs.getString("vehicleno"));
				
				
			}
			c1.setBounds(170,80,150,25);
			add(c1);
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		JLabel l3 = new JLabel("Status");		
		l3.setBounds(20,130,100,30);
		add(l3);	
		
		t1 = new JTextField();
		t1.setBounds(170,130,150,25);
		add(t1);
		
		JLabel l4 = new JLabel("Fule");		
		l4.setBounds(20,180,100,30);
		add(l4);
		
		t2 = new JTextField();
		t2.setBounds(170,180,150,25);
		add(t2);
		
		
		JLabel l5 = new JLabel("Price");		
		l5.setBounds(20,230,100,30);
		add(l5);
		
		t3 = new JTextField();
		t3.setBounds(170,230,150,25);
		add(t3);
		
		
		b2 = new JButton("Update");
		b2.setBounds(135,450,100,30);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("Cancel");
		b3.setBounds(240,450,100,30);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		add(b3);
                
                b4 = new JButton("Load Data");
		b4.setBounds(355,450,100,30);
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.addActionListener(this);
		add(b4);
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/checkout.jpg"));
		Image i2 = i1.getImage().getScaledInstance(400, 550, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel li = new JLabel(i3);
		li.setBounds(130,0,700,500);
		add(li);
		
		
		
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(400,200,900,700);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b2) {
			
			try {
				String room=null;
				String deposit=null;
				int amountPaid;
				String price = null;
				conn c = new conn();
				String id = c1.getSelectedItem();			
                 
                 String str2 = "update  vehicle set status = '"+t1.getText()+"',fule = '"+t2.getText()+"',price = '"+t3.getText()+"' where vehicleno = '"+id+"'";

		 System.out.println("Update Employee =>" + str2);
		 c.s.executeUpdate(str2);
	         JOptionPane.showMessageDialog(null, "vehicle Updated successfully");	 
										
			}catch(Exception e) {
                                 JOptionPane.showMessageDialog(null, e);
				System.out.println(e);
			}
			
			
		}else if(ae.getSource()==b4) {
                    try{
                        conn c = new conn();
                 String str = "select * from vehicle where vehicleno = '"+c1.getSelectedItem()+"'";
		ResultSet rs = c.s.executeQuery(str);
                while(rs.next()) {
                t1.setText(rs.getString("status"));
		 t2.setText(rs.getString("fule"));
		 t3.setText(rs.getString("price"));
                 	 

				}
                    }catch(Exception e){
                    }
			
		}else if(ae.getSource()==b3) {
			
			new Reception().setVisible(true);
			this.setVisible(false);
			
		}
		
	}
	
	
	
	public static void main(String[] args) {

		new UpdateVehicle();

	}

}



