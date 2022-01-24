/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;



import java.awt.Font;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

import java.awt.event.*;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Rent extends JFrame implements ActionListener {

	JTextField t1, t2, t3, t4, t5,t6,t7,t8;
	JButton b1, b2;
	JComboBox c1;
	Choice c2;
	JRadioButton r1, r2;

	Rent() {
		setBounds(300, 50, 900, 700);

		JLabel l1 = new JLabel("NEW CUSTOMER FORM");
		l1.setBounds(100, 20, 300, 30);
		l1.setForeground(Color.blue);
		l1.setFont(new Font("Tohoma", Font.BOLD, 20));
		add(l1);

		JLabel l2 = new JLabel("ID");
		l2.setBounds(30, 60, 100, 30);
		add(l2);

		c1 = new JComboBox(new String[] {"Passport", "Driving Licence", "Voter ID Card" });
		c1.setBackground(Color.white);
		c1.setBounds(200, 60, 150, 30);
		add(c1);

		JLabel l3 = new JLabel("Number");
		l3.setBounds(30, 100, 100, 30);
		add(l3);

		t1 = new JTextField();
		t1.setBounds(200, 100, 150, 30);
		add(t1);

		JLabel l4 = new JLabel("Name");
		l4.setBounds(30, 140, 100, 30);
		add(l4);

		t2 = new JTextField();
		t2.setBounds(200, 140, 150, 30);
		add(t2);

		JLabel l5 = new JLabel("Gender");
		l5.setBounds(30, 180, 100, 30);
		add(l5);

		r1 = new JRadioButton("Male");
		r1.setBackground(Color.white);
		r1.setBounds(200, 180, 80, 30);
		add(r1);

		r2 = new JRadioButton("Female");
		r2.setBackground(Color.white);
		r2.setBounds(280, 180, 100, 30);
		add(r2);

		JLabel l6 = new JLabel("Country");
		l6.setBounds(30, 220, 100, 30);
		add(l6);

		t3 = new JTextField();
		t3.setBounds(200, 220, 150, 30);
		add(t3);

		JLabel l7 = new JLabel("car no");
		l7.setBounds(30, 260, 100, 30);
		add(l7);

		c2 = new Choice();
		try {
			conn c = new conn();
			String str = "select * from vehicle";
			ResultSet rs = c.s.executeQuery(str);

			while (rs.next()) {
				c2.add(rs.getString("vehicleno"));
			}

		} catch (Exception e) {
                       JOptionPane.showMessageDialog(null, e);
			System.out.println(e);
		}
		c2.setBounds(200, 260, 150, 40);
		add(c2);

		JLabel l8 = new JLabel("Email");
		l8.setBounds(30, 300, 100, 30);
		add(l8);

		t6 = new JTextField();
		t6.setBounds(200, 300, 150, 30);
		add(t6);

		JLabel l9 = new JLabel("Contact_no");
		l9.setBounds(30, 340, 100, 30);
		add(l9);

		t7 = new JTextField();
		t7.setBounds(200, 340, 150, 30);
		add(t7);
                
                JLabel l0 = new JLabel("Price Per Day :");
		l0.setBounds(30, 380, 100, 30);
		add(l0);

		t8 = new JTextField();
		t8.setBounds(200, 380, 150, 30);
		add(t8);

		JLabel l11 = new JLabel("Deposit");
		l11.setBounds(30, 420, 100, 30);
		add(l11);

		t5 = new JTextField();
		t5.setBounds(200, 420, 150, 30);
		add(t5);
                
                
		b1 = new JButton("Rent");
		b1.setForeground(Color.white);
		b1.setBackground(Color.black);
		b1.setBounds(30, 600, 130, 30);
		b1.addActionListener(this);
		add(b1);

		b2 = new JButton("Cancel");
		b2.setForeground(Color.white);
		b2.setBackground(Color.black);
		b2.setBounds(210, 600, 130, 30);
		b2.addActionListener(this);
		add(b2);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/customer.png"));
		Image i2 = i1.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel li = new JLabel(i3);
		li.setBounds(330, 30, 400, 400);
		add(li);

		getContentPane().setBackground(Color.white);

		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {

		if (ae.getSource() == b1) {

			String id = (String) c1.getSelectedItem();
			String number = t1.getText();
			String name = t2.getText();
			String gender = null;

			if (r1.isSelected()) {
				gender = "Male";
			} else if (r2.isSelected()) {
				gender = "Female";
			}

			String country = t3.getText();
			String vehicleno = c2.getSelectedItem();
			String deposit = t5.getText();
                        String email=t6.getText();
                        String contactno=t7.getText();
                        String rentp_d=t8.getText();

			String str = "Insert into customer (cnic,number,name,gender,country,vehicleno,deposit,email,contactno,rentpd) values('" + id + "','" + number + "','" + name + "','" + gender + "','"
					+ country + "','" + vehicleno + "','" + deposit + "','" + email + "','" + contactno + "','" + rentp_d +"')";
			String str2 = "update vehicle set availablity = 'Occupied' where vehicleno = '" + vehicleno + "'";

                        String str3 = "Insert into rent (cnic,number,name,gender,country,vehicleno,deposit,email,contactno,rentpd) values('" + id + "','" + number + "','" + name + "','" + gender + "','"
					+ country + "','" + vehicleno + "','" + deposit + "','" + email + "','" + contactno + "','" + rentp_d +"')";
			try {
				conn c = new conn();
				c.s.executeUpdate(str);
				c.s.executeUpdate(str2);
                                c.s.executeUpdate(str3);
                                
                                
                                 String rs= "(Your ID Type'" + id + "',Your ID No'" + number + "',Your Name'" + name + "',Your Gender'" + gender + "',Your Country'"+ country + "',Your Rented Vehicle No'" + vehicleno + "',Your Pay'" + deposit + "',Your Email'" + email + "',Your Contact No'" + contactno + "') Thank You !You rented car successfully";
                                 sendmail mail=new sendmail();
                                 mail.mail(email, rs);
				JOptionPane.showMessageDialog(null, "New Customer Added");
                                JOptionPane.showMessageDialog(null, "Vehicle Rented Successfully");
				new Reception().setVisible(true);
				this.setVisible(false);

			} catch (Exception e) {
				System.out.println(e);
                                JOptionPane.showMessageDialog(null, e);

			}
		} else if (ae.getSource() == b2) {
			new Reception().setVisible(true);
			this.setVisible(false);
		}

	}

	public static void main(String[] args) {

		new Rent();

	}

}



