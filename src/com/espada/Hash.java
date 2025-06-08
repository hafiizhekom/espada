/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Sumber: https://www.mkyong.com/java/java-md5-hashing-example/
package com.espada;
import java.security.MessageDigest;
/**
 *
 * @author Hafiizh Eko M
 */
public class Hash {
    public String md5(String password) throws Exception
    {

        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(password.getBytes());

        byte byteData[] = md.digest();

        //convert the byte to hex format method 1
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < byteData.length; i++) {
         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
        }

       return sb.toString();
    }
}
