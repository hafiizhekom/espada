/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.espada;

/**
 *
 * @author Hafiizh Eko M
 */
public class LicenseKey {
    private HardDisk hdd = new HardDisk();
    private RegistryKey regist = new RegistryKey();
    private Hash encrypt = new Hash();
    private String kode=Integer.toHexString((Integer.parseInt(hdd.getSerialNumber("C"))));
    
    public String getCodeProgrram(){
        return kode;
    }
    
    public boolean checkingEmptyLicense(){
        if(regist.getKeyString("license")==null){
            return false;
        }else{
           return true;
        }
    }
    
    public boolean checkingCompareLicense() throws Exception{
        String temp = kode+"-"+regist.getKeyString("author");
        if(regist.getKeyString("license").equals(encrypt.md5(temp))){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checkingCompareLicense(String name, String license) throws Exception{
        String temp = kode+"-"+name;
        if(license.equals(encrypt.md5(temp))){
            return true;
        }else{
            return false;
        }
    }
    
    public void setLicense(String license, String name){
        regist.setKeyString("license", license);
        regist.setKeyString("author", name);
    }
}
