/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrentalsyatem;





import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CarRentalSyatem extends JFrame implements ActionListener{
	JButton b1,b2;
	CarRentalSyatem(){
		setBounds(0,0,1500,750);

		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/firstdb.jpg"));
		JLabel l1 = new JLabel();
		l1.setBounds(0,0,1400,900);
                l1.setBackground(new Color(51,153,255));

		add(l1);
		
		JLabel l2 = new JLabel("...............Vehicle Rental Syatem System............");
		l2.setBounds(400,20,1000,70);
		l2.setFont(new Font("serif",Font.PLAIN,30));
		l2.setForeground(Color.blue);
		l1.add(l2);
		
		
		b1 = new JButton("Admin");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.setBounds(660,450,180,50);
		b1.addActionListener(this);
		l1.add(b1);
                
                b2 = new JButton("Employee");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBounds(460,450,180,50);
		b2.addActionListener(this);
		l1.add(b2);
		
		setLayout(null);
		setVisible(true);
		
		while(true) {
			l2.setVisible(false);
			try{
				Thread.sleep(500);
			}catch(Exception e) {
                                JOptionPane.showMessageDialog(null,e);				
			}
			l2.setVisible(true);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
                                JOptionPane.showMessageDialog(null,e);				
			}
			
		}
		
		
	}
	
	public void actionPerformed(ActionEvent ae) {
            
            if(ae.getSource()==b1) {
		new Login().setVisible(true);
		this.setVisible(false);	
		}
               else if(ae.getSource()==b2){
                  new Login().setVisible(true);
		this.setVisible(false);
                }
	}

	public static void main(String[] args) {
		
		new CarRentalSyatem();
		
	}

}

