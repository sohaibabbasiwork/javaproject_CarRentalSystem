/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame implements ActionListener{

	JLabel l1,l2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	Login(){
		
		setBounds(480,250,600,270);
		
		
		l1 = new JLabel("Username");
		l1.setBounds(40,50,100,30);
		add(l1);
		
		l2 = new JLabel("Password");
		l2.setBounds(40,90,100,30);
		add(l2);
		
		t1 = new JTextField();
		t1.setBounds(160,50,100,30);
		add(t1);
		
		t2 = new JPasswordField();
		t2.setBounds(160,90,100,30);
		add(t2);
		
		b1 = new JButton("Login");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(60,140,80,30);
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("Cancel");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(160,140,80,30);
		b2.addActionListener(this);
		add(b2);
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/admin.png"));
		Image i2 = i1.getImage().getScaledInstance(190, 190, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l3 = new JLabel(i3);
		l3.setBounds(370,35,150,150);
		add(l3);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			
			String username = t1.getText();
			char[] pwd = t2.getPassword();
			String password = new String(pwd);
			
			conn c = new conn();
                        conn c2 = new conn();
			
			String str = "select * from admin where username = '"+username+"' and password = '"+password+"';";
                        String str2 = "select * from employeelogin where email = '"+username+"' and password = '"+password+"';";
			try {
				ResultSet rs = c.s.executeQuery(str);
				ResultSet rs2 = c2.s.executeQuery(str2);
				if(rs.next()) {
					new Dashboard().setVisible(true);
					this.setVisible(false);
				}else if(rs2.next()) {
                                    new Reception().setVisible(true);
				    this.setVisible(false);
                                }
                                else {
					JOptionPane.showMessageDialog(null,"Invalid Username or Password");
				}
				
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null,"Login Fail" + e);
			}
			
		}else if(ae.getSource()==b2) {
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args) {
		
		new Login();

	}

}


