///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
package carrentalsyatem;

//import java.util.Random;
//
// 
//  
//public class otp
//{
//    static char[] OTP(int len)
//    {
//        System.out.println("Generating OTP using random() : ");
//        System.out.print("You OTP is : ");
//  
//        // Using numeric values
//        String numbers = "0123456789";
//  
//        // Using random method
//        Random rndm_method = new Random();
//  
//        char[] otp = new char[len];
//  
//        for (int i = 0; i < len; i++)
//        {
//            // Use of charAt() method : to get character value
//            // Use of nextInt() as it is scanning the value as int
//            otp[i] =
//             numbers.charAt(rndm_method.nextInt(numbers.length()));
//        }
//        return otp;
//    }
//    public static void main(String[] args)
//    {
//        int length = 6;
//        System.out.println(OTP(length));
//    }
//}





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hp
 */
import java.util.Random;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.rest.api.v2010.account.message.*;

public class otp {
   static String OTPCODE="";
   public static final String ACCOUNT_SID="AC8aa0e29615d29a33cb37dcf4e0f82419";
   public static final String AUTH_TOKEN="5da7a07142377b30748e0d7e78464cc0";
   public static void main(String[] args)
   {
       generateCode();
//       sendOTP();
   }
   
   public static String generateCode()
   {
       int len=6;
       String code;
       String numbers="+16677716558";
               Random r=new Random();
               char[] otp=new char[len];
               for(int i=0;i<len;i++)
               {
                   otp[i]=numbers.charAt(r.nextInt(numbers.length()));
               }
               String FinalOtp="";
               for(char a:otp)
               {
                   FinalOtp+=a;
               }
               OTPCODE=FinalOtp;
               return FinalOtp;
               }
   public static void sendOTP(){
       boolean status=false;
       Twilio.init(ACCOUNT_SID,AUTH_TOKEN);
       Message message=Message.creator(
               new com.twilio.type.PhoneNumber("+923425181786"),
               new com.twilio.type.PhoneNumber("+16677716558"),
               OTPCODE).create();
       System.out.println(message.getSid());
               
   }
   }
    

