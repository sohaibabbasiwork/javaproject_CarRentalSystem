/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import javax.swing.*;


public class Return extends JFrame implements ActionListener{

	
	Choice c1;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	JButton b1,b2,b3;
	
	
	Return(){
		
		
		JLabel l1 = new JLabel("Return");
		l1.setFont(new Font("Tohoma",Font.BOLD,20));
		l1.setForeground(Color.blue);
		l1.setBounds(30,20,150,30);
		add(l1);
		
		
		JLabel l2 = new JLabel("Customer Id");
		l2.setBounds(30,70,100,30);
		add(l2);
		
		c1 = new Choice();
		
		try {
			
			conn c = new conn();
			ResultSet rs = c.s.executeQuery("select * from rent");
			while(rs.next()) {
				c1.add(rs.getString("number"));

			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		c1.setBounds(200,70,120,30);
		add(c1);
		
		JLabel l3 = new JLabel("Vichel Number");
		l3.setBounds(30,120,100,30);
		add(l3);
		
		
		t1 = new JTextField();
		t1.setBounds(200,120,120,30);
		add(t1);
		
                
                JLabel l4 = new JLabel("Days Late");
		l4.setBounds(30,170,100,30);
		add(l4);
		
                t2 = new JTextField();
		t2.setBounds(200,170,120,30);
		add(t2);

//                JLabel l5 = new JLabel("ToTal");
//		l5.setBounds(30,220,100,30);
//		add(l5);
//		
//                t3 = new JTextField();
//		t3.setBounds(200,220,120,30);
//		add(t3);                

                
		b1 = new JButton("Return");
		b1.setBackground(Color.black);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		b1.setBounds(30,300,120,30);
		add(b1);
		
		
		b2 = new JButton("Cancel");
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		b2.setBounds(200,300,120,30);
		add(b2);
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/tick.png"));
		Image i2 = i1.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		b3 = new JButton(i3);
		b3.addActionListener(this);
		b3.setBounds(340,60,30,30);
		add(b3);
		
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("carrentalsyatem/icons/frari.jpg"));
		Image i5 = i4.getImage().getScaledInstance(400, 200, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5);
		JLabel lii = new JLabel(i6);
		lii.setBounds(380,30,400,400);
		add(lii);
		
		getContentPane().setBackground(Color.white);
		
		setLayout(null);
		setBounds(400,200,800,500);
		setVisible(true);
		
	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		if(ae.getSource()==b1) {
			String str3;
			String id = c1.getSelectedItem();
			String vehicleno = t1.getText();
                        String fine = t2.getText();
                        
                       
			String str = "delete from rent where number = '"+id+"'";
			String str2 = "update vehicle set availablity = 'Available' where vehicleno = '"+vehicleno+"'";
//                        String str3 = "Insert into  vehicle set availablity = 'Available' where vehicleno = '"+vehicleno+"'";
	try {
            Document document=new Document();
            PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("./recipt.pdf"));
            document.open();
			 int total;
            if(Integer.parseInt(fine)>0){
                            conn c3 = new conn();
			ResultSet rs3 = c3.s.executeQuery("select * from rent where number= '"+id+"'");
                        while(rs3.next()) {
                             total=(Integer.parseInt(rs3.getString("rentpd"))*Integer.parseInt(fine))+Integer.parseInt(rs3.getString("deposit"));
                             
                             			conn c2 = new conn();
			ResultSet rs2 = c2.s.executeQuery("select * from rent where number= '"+id+"'");
			while(rs2.next()) {
//                                t6.setText(rs2.getString("contactno"));
//                                t7.setText(rs2.getString("email"));
                         JOptionPane.showMessageDialog(null,"\n Your id: \t" + rs2.getString("cnic")+"\n Your Email: \t" + rs2.getString("email") + "\n Vehicle no: \t" + rs2.getString("vehicleno") + "\n Bill: \t" + total );
                         document.add(new Paragraph("\n Your Name: \t" + rs2.getString("name") + "\n Your id: \t" + rs2.getString("number")+ "\n Vehicle no: \t" + rs2.getString("vehicleno")+"\n Your Email: \t" + rs2.getString("email") + "\n contact no: \t" + rs2.getString("contactno") + "\n Bill: \t" + total +"\n\t Thank You...  \b\t"));
                         System.out.println("Document Added in Pdf");
			 str3 = "insert into returnvehicle (cnic,number, vehicleno,bill, fine, email) values('"+c1.getSelectedItem()+"','"+rs2.getString("contactno")+"','"+rs2.getString("vehicleno") +"','"+(total)+"','"+t2.getText()+"','"+rs2.getString("email")+"')";
                         c2.s.executeUpdate(str3);
                               
                                c2.s.executeUpdate(str);
				c2.s.executeUpdate(str2);
				JOptionPane.showMessageDialog(null, "Return successful");
                                document.close();
                                writer.close();
				new Reception().setVisible(true);
				this.setVisible(false);
			}
                        }
                        }else{
                         conn c3 = new conn();
			ResultSet rs3 = c3.s.executeQuery("select * from rent where number= '"+id+"'");
                        while(rs3.next()) {
                             total=(Integer.parseInt(rs3.getString("rentpd"))*0)+Integer.parseInt(rs3.getString("deposit"));
                             
                             conn c2 = new conn();
			ResultSet rs2 = c2.s.executeQuery("select * from rent where number= '"+id+"'");
			while(rs2.next()) {
//                                t6.setText(rs2.getString("contactno"));
//                                t7.setText(rs2.getString("email"));
                         JOptionPane.showMessageDialog(null,"\n Your id: \t" + rs2.getString("number")+"\n Your Email: \t" + rs2.getString("email") + "\n Vehicle no: \t" + rs2.getString("vehicleno") + "\n Bill: \t" + total );
	                 document.add(new Paragraph("\n Your Name: \t" + rs2.getString("name") + "\n Your id: \t" + rs2.getString("cnic")+ "\n Vehicle no: \t" + rs2.getString("vehicleno")+"\n Your Email: \t" + rs2.getString("email") + "\n contact no: \t" + rs2.getString("contactno") + "\n Bill: \t" + total +"\n\t Thank Yout...  \b\t"));
                                document.close();
                                writer.close();
                         
                         str3 = "insert into returnvehicle (cnic,number, vehicleno,bill, fine, email) values('"+c1.getSelectedItem()+"','"+rs2.getString("contactno")+"','"+rs2.getString("vehicleno")+"','"+(total)+"','"+t2.getText()+"','"+rs2.getString("email")+"')";
                         c2.s.executeUpdate(str3);
                               
                                c2.s.executeUpdate(str);
				c2.s.executeUpdate(str2);
				JOptionPane.showMessageDialog(null, "Return successful");
                               
				new Reception().setVisible(true);
				this.setVisible(false);
			}
                
            }

                        	
			
		}
        }catch(Exception e) {
			System.out.println(e);
                        JOptionPane.showMessageDialog(null,e);
		}

			
		
			
			
		}else if (ae.getSource()==b2) {
			
			new Reception().setVisible(true);;
			this.setVisible(false);
			
		}else if(ae.getSource()==b3) {
			
			String id = c1.getSelectedItem();
			try {
				
				conn c = new conn();
				ResultSet rs = c.s.executeQuery("select * from customer where number  = '"+id+"'");
				while(rs.next()) {
					t1.setText(rs.getString("vehicleno"));
				}
				
			}catch(Exception e) {
				System.out.println(e);
                                JOptionPane.showMessageDialog(null,e);

			}
			
			
		}
		
	}
	
	
	public static void main(String[] args) {

		new Return();

	}

}

