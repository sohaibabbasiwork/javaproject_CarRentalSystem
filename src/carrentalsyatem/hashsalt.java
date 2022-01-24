/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsyatem;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;



//...................hash && salt

class hashsalt {

    public static String getSecurePassword(String password, String salt) {

        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
//            md.update(salt);
            byte[] bytes = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
 

    public static String getSalt() 
    throws NoSuchAlgorithmException, NoSuchProviderException 
{
    // Always use a SecureRandom generator
    SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");

    // Create array for salt
    byte[] salt = new byte[16];

    // Get a random salt
    sr.nextBytes(salt);

    // return salt
    return salt.toString();
}
        
}
