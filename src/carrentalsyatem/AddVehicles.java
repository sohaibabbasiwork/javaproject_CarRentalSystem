/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//public class AddVehicles extends JFrame implements ActionListener {
// JTextField t1,t2,t3;
//	JComboBox c1,c2,c3;
//	JButton b1,b2;
//	
//	AddVehicles(){
//		
//                setBounds(380,200,790,500);
//
//		
//		
//		JLabel l1 = new JLabel("Add Vichels");
//		l1.setFont(new Font("Tohoma",Font.BOLD,21));
//		l1.setBackground(Color.red);
//		l1.setOpaque(true);
//		l1.setBounds(480,15,120,30);
//		add(l1);
//		
//		JLabel vehicleno = new JLabel("Vichels Number");
//		vehicleno.setFont(new Font("Tohoma",Font.BOLD,14));
//		vehicleno.setBounds(420,80,120,30);
//		add(vehicleno);
//		
//		t1 = new JTextField();
//		t1.setBounds(560,80,110,30);
//		add(t1);
//		
//		
//		JLabel available = new JLabel("Availability");
//		available.setFont(new Font("Tohoma",Font.BOLD,14));
//		available.setBounds(420,120,120,30);
//		add(available);
//		
//		
//		c1 = new JComboBox(new String[] {"Available","Occupied" });
//		c1.setBackground(Color.WHITE);
//		c1.setBounds(560,120,110,30);
//		add(c1);
//		
//		
//		
//		
//		JLabel status = new JLabel("Condition");
//		status.setFont(new Font("Tohoma",Font.BOLD,14));
//		status.setBounds(420,160,120,30);
//		add(status);
//		
//		
//		
//		c2 = new JComboBox(new String[] {"Good","Bad" });
//		c2.setBackground(Color.WHITE);
//		c2.setBounds(560,160,110,30);
//		add(c2);
//		
//		
//		
//		JLabel price = new JLabel("Price");
//		price.setFont(new Font("Tohoma",Font.BOLD,14));
//		price.setBounds(420,200,120,30);
//		add(price);
//		
//		t2 = new JTextField();
//		t2.setBounds(560,200,110,30);
//		add(t2);
//		
//		
//		JLabel fule = new JLabel("Fule Level");
//		fule.setFont(new Font("Tohoma",Font.BOLD,14));
//		fule.setBounds(420,240,120,30);
//		add(fule);
//		
//	        t3 = new JTextField();
//		t3.setBounds(560,200,110,30);
//		add(t3);
////		c3 = new JComboBox(new String[] {"Full","6 seater" });
////		c3.setBackground(Color.WHITE);
////		c3.setBounds(560,240,110,30);
////		add(c3);
//		
//		
//		
//		b1  = new JButton("Add Vichels");
//		b1.setBounds(423,300,100,30);
//		b1.addActionListener(this);
//		b1.setBackground(Color.black);
//		b1.setForeground(Color.white);
//		add(b1);
//		
//		
//		b2  = new JButton("Cancel");
//		b2.setBounds(565,300,100,30);
//		b2.addActionListener(this);
//		b2.setBackground(Color.black);
//		b2.setForeground(Color.white);
//		add(b2);
//		
//		
//		
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/mrcds.jpg"));
//		JLabel l2 = new JLabel(i1);
//		l2.setBounds(0,0,750,500);
//		add(l2);
//		
//		
//		getContentPane().setBackground(Color.white);
//		
//		setLayout(null);
//		setVisible(true);
//	}
//	
//	
//	
//	public void actionPerformed(ActionEvent ae) {
//		
//		
//		if(ae.getSource()==b1) {
//			
//			String vehicleno = t1.getText();
//			String available = (String)c1.getSelectedItem();
//			String status =  (String)c2.getSelectedItem();
//			String price = t2.getText();
//			String fule =  (String)t3.getText();
//			
//			conn c = new conn();
//			
//			try {
//				
//				String str = "insert into vehicle (vehicleno, availablity, status, fulr, price) values('"+vehicleno+"','"+available+"','"+status+"','"+fule+"','"+price+"')";
//                                c.s.executeUpdate(str);
//				
//				JOptionPane.showMessageDialog(null,"New Vichel Added");
//				this.setVisible(false);
//				
//			}catch(Exception e) {
//				System.out.println(e);
//                                JOptionPane.showMessageDialog(null,e);
//
//			}
//			
//		}else if(ae.getSource()==b2) {
//			this.setVisible(false);
//		}
//		
//		
//	}
//	
//
//	public static void main(String[] args) {
//		
//		new AddVehicles();
//		
//	}  
//
//}




public class AddVehicles extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	JComboBox c1,c2;
	JButton b1,b2;
	
	AddVehicles(){
		
		setBounds(380,200,790,500);
		
		JLabel name = new JLabel("Vehicle NO");
		name.setFont(new Font("Tahoma",Font.PLAIN,17));
		name.setBounds(60,70,120,30);
		add(name);
		
		t1 = new JTextField();
		t1.setBounds(180,70,150,30);
		add(t1);
		
		
		
                JLabel available = new JLabel("Availability");
		available.setFont(new Font("Tohoma",Font.BOLD,14));
                available.setBounds(60,110,120,30);
                
		add(available);
		
		
		c1 = new JComboBox(new String[] {"Available","Occupied" });
		c1.setBackground(Color.WHITE);
		c1.setBounds(180,110,150,30);
		add(c1);
		
		
		
		
		JLabel status = new JLabel("Condition");
		status.setFont(new Font("Tohoma",Font.BOLD,14));
                status.setBounds(60,150,120,30);
              
                add(status);
		
		
		
		c2 = new JComboBox(new String[] {"Good","Bad" });
		c2.setBackground(Color.WHITE);
		c2. setBounds(180,150,70,30);
		add(c2);
              
		JLabel fule = new JLabel("Fule");
		fule.setFont(new Font("Tahoma",Font.PLAIN,17));
		fule.setBounds(60,200,120,30);
		add(fule);
		
		t2 = new JTextField();
		t2.setBounds(180,200,150,30);
		add(t2);
		
		
		JLabel salary = new JLabel("Price");
		salary.setFont(new Font("Tahoma",Font.PLAIN,17));
		salary.setBounds(60,250,120,30);
		add(salary);
		
		t3 = new JTextField();
		t3.setBounds(180,250,150,30);
		add(t3);
	
                
		
		b1 = new JButton("Submit");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(100,400,130,30);
		b1.addActionListener(this);
		add(b1);
		
                b2 = new JButton("Back");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(230,400,130,30);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/mrcds.jpg"));
		Image i2 = i1.getImage().getScaledInstance(500, 500 , Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(170,50,700,500);
		add(l1);
		
		
		JLabel l2 = new JLabel("ADD Vehical DETAILS");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Tahoma",Font.PLAIN,25));
		l2.setBounds(250,15,300,30);
		add(l2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae) {
		  
                if(ae.getSource()==b1) {
			
			String vehicleno = t1.getText();
			String available = (String)c1.getSelectedItem();
			String status =  (String)c2.getSelectedItem();
			String price = t3.getText();
			String fule =  (String)t2.getText();
			
			conn c = new conn();
			
			try {
				
				String str = "insert into vehicle (vehicleno, availablity, status, fule, price) values('"+vehicleno+"','"+available+"','"+status+"','"+fule+"','"+price+"')";
                                c.s.executeUpdate(str);
				
				JOptionPane.showMessageDialog(null,"New Vichel Added");
				
			}catch(Exception e) {
				System.out.println(e);
                                JOptionPane.showMessageDialog(null,e);

			}
			
		}
               else if(ae.getSource()==b2){
                    new AdminFram().setVisible(true);
		    this.setVisible(false);
                }
		
		
	}
	
	
	public static void main(String[] args) {
		
		new AddVehicles().setVisible(true);

	}

}




