/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;

/**
 *
 * @author Hp
 */


import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Dashboard extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3,b4,b5,b6,b7,b11;
	
	
	Dashboard(){
		setBounds(40,40,1254,836);
                
		b11 = new JButton(" Reception ");
		b11.setBackground(Color.black);
		b11.setForeground(Color.white);
		b11.addActionListener(this);
		b11.setBounds(490,100,200,40);
		add(b11);		
		
		b1 = new JButton(" Employee Management");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(490,160,200,40);
		add(b1);
		
		
		b2 = new JButton(" Vichels Management");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(490,220,200,40);
		add(b2);
		
		
		b4 = new JButton("Customer Management");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.addActionListener(this);
		b4.setBounds(490,280,200,40);		

		add(b4);
		

		
		b5 = new JButton("View All Returns");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		b5.setBounds(490,340,200,40);
		add(b5);
                
                b6 = new JButton("Logout");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.setBounds(490,400,200,40);
		b6.addActionListener(this);
		add(b6);
                
                b7 = new JButton("Back");
		b7.setBackground(Color.black);
		b7.setForeground(Color.white);
		b7.setBounds(490,460,200,40);
		b7.addActionListener(this);
		add(b7);
                
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/roylrs2.png"));
//		Image i2 = i1.getImage().getScaledInstance(800, 675, Image.SCALE_DEFAULT);
//		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i1);
		l1.setBounds(0,0,1254,836);
		add(l1);
		
		
		
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource() == b1) {
			
			new EmployeeMenagement().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b2) {
			new VehicleManag().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b4) {
			
			new CustomerMenagement().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b5) {
                    try {				
                        new ReturnLogs().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}
                else if(ae.getSource() == b6) {
			this.setVisible(false);	
		}else if(ae.getSource() == b7) {
			new Dashboard().setVisible(true);			
			this.setVisible(false);	
		}else if(ae.getSource() == b11) {
			new Reception().setVisible(true);			
			this.setVisible(false);	
		}
		
		
	}
        
	

	public static void main(String[] args) {
		
		new Dashboard();

	}

}

