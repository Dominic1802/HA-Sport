/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extension;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Admin
 */
public class Extension {

    public final static String generateHash(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digest.reset();
        byte[] hash = digest.digest(data.getBytes());
        return bytesToStringHex(hash);
    }
    private final static char[] hexArray ="0123456789ABCDEF".toCharArray();
    public static String bytesToStringHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; ++j) {
            int v = bytes[j]&0xFF;
            hexChars[j*2] = hexArray[v>>>4];
            hexChars[j*2+1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String data = "1234";
        System.out.println("SHA-256 Hash :" + generateHash(data));
    }
}
