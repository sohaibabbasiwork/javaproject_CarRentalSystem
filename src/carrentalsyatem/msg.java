/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
*  By Anas Khan  
*/
package carrentalsyatem;


import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class msg { 
    // Find your Account Sid and Token at twilio.com/console 
    public static final String ACCOUNT_SID = "AC71485efc76efb2425a6f966d7c238475"; 
    public static final String AUTH_TOKEN = "06f4de9599bfa019f2a492fa79dde82e"; 
 
    public void send(String num,String msg){
        System.out.println("\n\t Your Phone no is=>" + num);
        System.out.println("\n\t Your msg is=>" + msg);

        Twilio.init(ACCOUNT_SID, AUTH_TOKEN); 
        Message message = Message.creator( 
                new com.twilio.type.PhoneNumber(num),  
                "MGdaecec9231ce5f8714009cfda2293eeb", 
                "your code is =>" + msg)      
            .create(); 
 
        System.out.println(message.getSid()); 
    } 
}
