
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
public class SearchVehicles  extends JFrame implements ActionListener{

	
	JTextField c1;
	JButton b1,b2,b3;
	JTable t1;
        ResultSet rs2,rs;
	
	SearchVehicles() throws SQLException{
		
		
		JLabel l1 = new JLabel("Search Vehicle");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(490,25,200,30);
		add(l1);
		
		
		
		JLabel l2 = new JLabel("Enter Vehicle_NO To Search ");		
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
                
                
                b3 = new JButton("Search");
		b3.addActionListener(this);
		b3.setBackground(Color.black);
		b3.setForeground(Color.white);
		b3.setBounds(350,420,120,30);
		add(b3);
		
		
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
		
		 if(ae.getSource()==b2) {
			
			new Reception().setVisible(true);			
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

		new SearchVehicles();

	}

}





