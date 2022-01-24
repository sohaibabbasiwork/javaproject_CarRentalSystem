/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import static carrentalsyatem.otp.OTPCODE;
import static carrentalsyatem.otp.generateCode;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class AddEmployee extends JFrame implements ActionListener {
	
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton r1,r2;
	JComboBox c1;
	JButton b1,b2;
	
	AddEmployee(){
		
		setBounds(380,200,790,500);
		
		JLabel name = new JLabel("NAME");
		name.setFont(new Font("Tahoma",Font.PLAIN,17));
		name.setBounds(60,70,120,30);
		add(name);
		
		t1 = new JTextField();
		t1.setBounds(180,70,150,30);
		add(t1);
		
		JLabel age = new JLabel("AGE");
		age.setFont(new Font("Tahoma",Font.PLAIN,17));
		age.setBounds(60,110,120,30);
		add(age);
		
		t2 = new JTextField();
		t2.setBounds(180,110,150,30);
		add(t2);
		
		
		JLabel gender = new JLabel("GENDER");
		gender.setFont(new Font("Tahoma",Font.PLAIN,17));
		gender.setBounds(60,150,120,30);
		add(gender);
		
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Tohoma",Font.PLAIN,13));
		r1.setBounds(177,150,70,30);
		r1.setBackground(Color.white);
		add(r1);
		
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Tohoma",Font.PLAIN,13));
		r2.setBounds(250,150,70,30);
		r2.setBackground(Color.white);
		add(r2);
		
		
		
		JLabel job = new JLabel("JOB");
		job.setFont(new Font("Tahoma",Font.PLAIN,17));
		job.setBounds(60,190,120,30);
		add(job);
		
		String str[] = {"Select","Front Dest Employee","Vehicle Service","Manager","Accountant"};
		c1 = new JComboBox(str);
		c1.setBounds(180,190,150,30);
		c1.setBackground(Color.white);
		add(c1);
		
		
		
		JLabel salary = new JLabel("SALARY");
		salary.setFont(new Font("Tahoma",Font.PLAIN,17));
		salary.setBounds(60,230,120,30);
		add(salary);
		
		t3 = new JTextField();
		t3.setBounds(180,230,150,30);
		add(t3);
		
		
		JLabel phone = new JLabel("PHONE");
		phone.setFont(new Font("Tahoma",Font.PLAIN,17));
		phone.setBounds(60,270,120,30);
		add(phone);
		
		t4 = new JTextField();
		t4.setBounds(180,270,150,30);
		add(t4);
		
		
		JLabel aadhar = new JLabel("CNIC/Passport_no");
		aadhar.setFont(new Font("Tahoma",Font.PLAIN,17));
		aadhar.setBounds(60,310,120,30);
		add(aadhar);
		
		t5 = new JTextField();
		t5.setBounds(180,310,150,30);
		add(t5);
		
		
		JLabel email = new JLabel("EMAIL");
		email.setFont(new Font("Tahoma",Font.PLAIN,17));
		email.setBounds(60,350,120,30);
		add(email);
		
		t6 = new JTextField();
		t6.setBounds(180,350,150,30);
		add(t6);
		
		
                
                
		
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
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/hiring.png"));
		Image i2 = i1.getImage().getScaledInstance(500, 500 , Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(170,50,700,500);
		add(l1);
		
		
		JLabel l2 = new JLabel("ADD EMPLOYEE DETAILS");
		l2.setForeground(Color.blue);
		l2.setFont(new Font("Tahoma",Font.PLAIN,25));
		l2.setBounds(250,15,300,30);
		add(l2);
		
		
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
	}

	
	public void actionPerformed(ActionEvent ae) {
		    if(ae.getSource()==b1){
               
                
		String name = t1.getText();
		String age = t2.getText();
		String salary = t3.getText();
		String phone = t4.getText();
		String aadhar = t5.getText();
		String email = t6.getText();
                
                otp Otp=new otp();
                
                String pass=Otp.generateCode();
                System.out.println("Otp code is=>" + pass);
                
                hashsalt hs=new hashsalt();
                
                String slt="";
                String hsh="";
            try {
                slt = hs.getSalt();
                 hsh = hs.getSecurePassword(pass, slt);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            } catch (NoSuchProviderException ex) {
                Logger.getLogger(AddEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
	        
		String gender = null;
		
		if(r1.isSelected()) {
			gender="Male";
		}else if(r2.isSelected()){
			gender="Female";
		}
		
                sendmail mail=new sendmail();
                mail.mail(email, pass);
                msg Msg=new msg();
		Msg.send( phone,"Your otp or password is :"+ pass );
		String job = (String)c1.getSelectedItem();
		
		
		conn c = new conn();
		
		String str = "insert into employee (name, age, gender, job, salary,phone,cnic,email)values('"+name+"','"+age+"','"+gender+"','"+job+"','"+salary+"','"+phone+"','"+aadhar+"','"+email+"')";
//		str = " insert into employee (username, email, rollno, password, hash,salt)"
//        + " values (?, ?, ?, ?, ?,?)";
		String str2 = "insert into employeelogin (email, password, hash, salt)values('"+email+"','"+pass+"','"+hsh+"','"+slt+"')";

		
		try {
			
			c.s.executeUpdate(str);
                        c.s.executeUpdate(str2);
			JOptionPane.showMessageDialog(null,"New Employee Added");
//			this.setVisible(false);			
			
			
		}catch(Exception e ) {
			
			System.out.println(e);
                        JOptionPane.showMessageDialog(null,"Error :" + e );
                        
			
		}
                    }
               else if(ae.getSource()==b2){
                    new Dashboard().setVisible(true);
		    this.setVisible(false);
                }
		
		
	}
	
	
	public static void main(String[] args) {
		
		new AddEmployee().setVisible(true);

	}

}




