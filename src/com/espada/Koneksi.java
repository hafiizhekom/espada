/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espada;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Hafiizh Eko M
 */
public class Koneksi {
    public Connection Koneksi() throws SQLException{
       Connection kon = null;
       try{
           RegistryKey regist = new RegistryKey();
           String database = regist.getKeyString("database");
           String username = regist.getKeyString("username");
           String password = regist.getKeyString("password");
           String host = regist.getKeyString("host");
           Class.forName("org.gjt.mm.mysql.Driver");
           kon = DriverManager.getConnection("jdbc:mysql://"+host+"/"+database+"", username, password);
           return kon;
       }catch(SQLException sqlEx){
           System.out.println("Database tidak bisa dibuka");
           JOptionPane.showMessageDialog(null, "Tidak ada koneksi dengan database");
           return null;
       }catch(Exception ex){
           System.out.println("Anda tidak terhubung ke database");
           return null;
       }
   }
}
