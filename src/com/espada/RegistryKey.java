/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Sumber:http://www.ongoinghelp.com/can-we-perform-readwrite-operations-to-windows-registry-using-java/
//Location: HKEY_CURRENT_USER/Software/Javasoft/Prefs/([nama.package]./Registry/Key)
package com.espada;
import java.util.prefs.Preferences;
/**
 *
 * @author Hafiizh Eko M
 */
public class RegistryKey {
   private static Preferences userRoot;
   private Preferences prefs;
 
   public RegistryKey()
   {
      userRoot = Preferences.userRoot();
      prefs = userRoot.node(this.getClass().getName());
   }
   
   public void setKeyString(String key, String value){
       prefs.put(key, value);
   }
   
   public void setKeyBoolean(String key, boolean value){
       prefs.putBoolean(key, value);
   }
   
   public String getKeyString(String key){
       String temp = prefs.get(key, key);
       return temp;
   }
   
   public boolean getKeyBoolean(String key){
       boolean temp = prefs.getBoolean(key, false);
       return temp;
   }
 
}
