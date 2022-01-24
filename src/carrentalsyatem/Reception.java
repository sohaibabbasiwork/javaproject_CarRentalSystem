/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reception extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	
	
	Reception(){
		setBounds(40,20,800,675);		
		setBackground(new Color(51,153,255));
		
		b1 = new JButton("Rent Vehicle");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(300,30,200,30);
		add(b1);
		
		
		b2 = new JButton("Return Vehicle");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(300,80,200,30);
		add(b2);
		
		b3 = new JButton(" View All Vehicles");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		b3.setBounds(300,130,200,30);		
		add(b3);
		
		
		
		b4 = new JButton("View All Employees Info");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(300,180,200,30);
		b4.addActionListener(this);
		add(b4);
		
		
		
		b5 = new JButton("View All Return info");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		b5.setBounds(300,230,200,30);
		add(b5);
		
		
		
		b6 = new JButton(" View All Customers Info");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.addActionListener(this);
		b6.setBounds(300,280,200,30);
		add(b6);
		
		
		
		b7 = new JButton("Search Employee");
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		b7.addActionListener(this);
		b7.setBounds(300,330,200,30);
		add(b7);
		
		
		
		b8 = new JButton("Search Vehicle");
		b8.setBackground(Color.black);
		b8.setForeground(Color.white);
		b8.addActionListener(this);
		b8.setBounds(300,380,200,30);
		add(b8);
		
		
		
		
		b9 = new JButton("Search Customer");
		b9.setBackground(Color.black);
		b9.setForeground(Color.white);
		b9.addActionListener(this);
		b9.setBounds(300,430,200,30);
		add(b9);
		
		
		
		
		b12 = new JButton("Logout");
		b12.setBackground(Color.black);
		b12.setForeground(Color.white);
		b12.addActionListener(this);
		b12.setBounds(300,530,200,30);
		add(b12);
		
		
		
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/mrcds.jpg"));
//		Image i2 = i1.getImage().getScaledInstance(800, 675, Image.SCALE_DEFAULT);
//		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel();
		l1.setBounds(0,0,1254,836);
                l1.setBackground(new Color(51,153,255));
		add(l1);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			
			new Rent().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b2) {
			
                    new Return().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b3) {
                    try {
                        new Vehicles().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);	
		}else if(ae.getSource() == b4) {
			
                    try {
                        new Employees().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b5) {
			
                    try {
                        new ReturnLogs().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b6) {
			
                    try {
                        new CustomersLogs().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b7) {
			
                    try {
                        new SearchEmployee().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b8) {
			
                    try {
                        new SearchVehicles().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b9) {
			
                    try {
                        new SearchCustomer().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b12) {
			this.setVisible(false);
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new Reception();

	}

}

