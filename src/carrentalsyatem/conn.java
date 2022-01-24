/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;


import java.sql.*;

public class conn {

	Connection c;
	Statement s;
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental_system?autoReconnect=true&useSSL=false","root","");
			s = c.createStatement();		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
				
	}
}

