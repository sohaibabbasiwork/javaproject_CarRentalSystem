/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;
    
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



public class VehicleManag extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3,b4,b5,b6;
	
	
	VehicleManag(){		
		setBounds(40,40,1254,836);
                
		b1 = new JButton("Add Vehicle");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
                b1.setBounds(490,100,200,40);

		add(b1);
		
		
		b2 = new JButton("Update Vehicle");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(490,160,200,40);
		add(b2);
		
		b3 = new JButton("Delete Vehicle");
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.addActionListener(this);
		b3.setBounds(490,240,200,40);		
		add(b3);
		
		
		
		b4 = new JButton("Search Vehicle");
		b4.setBackground(Color.black);
		b4.setForeground(Color.white);
		b4.setBounds(490,320,200,40);
		b4.addActionListener(this);
		add(b4);
		
		
		
		b5 = new JButton("View All Vehicles");
		b5.setBackground(Color.black);
		b5.setForeground(Color.white);
		b5.addActionListener(this);
		b5.setBounds(490,400,200,40);
		add(b5);
                
                b6 = new JButton("Back");
		b6.setBackground(Color.black);
		b6.setForeground(Color.white);
		b6.setBounds(490,480,200,40);
		b6.addActionListener(this);
		add(b6);
		
		
		
		
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
			
			new AddVehicles().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b2) {
                    //for Update employee
                    new UpdateVehicle().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b3) {
			
                    try {
                        new DeleteVehicle().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(EmployeeMenagement.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource() == b4) {
//			for searching
//			new SearchVehicle().setVisible(true);
			this.setVisible(false);
			
		}else if(ae.getSource() == b5) {
                    try {
                        new Vehicles().setVisible(true);
                    } catch (SQLException ex) {
                        Logger.getLogger(VehicleManag.class.getName()).log(Level.SEVERE, null, ex);
                    }
			this.setVisible(false);
			
		}else if(ae.getSource()==b6) {
			
			new AdminFram().setVisible(true);
			this.setVisible(false);
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		new VehicleManag();

	}

}




