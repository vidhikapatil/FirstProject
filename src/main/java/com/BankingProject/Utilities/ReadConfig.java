package com.BankingProject.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig
{
	 Properties pro;
     public ReadConfig() 
     {
    	 File src = new File("C:\\Users\\hp\\New folder\\vidhika patil\\vidhika patil\\VP\\framework_of_automation\\Configuration\\Config.properties");
    	 FileInputStream file;
    	 try {
    		 pro = new Properties();
    		 file= new FileInputStream(src);
    		 pro.load(file);
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
   	     }
    	 }
     public String getApplicationURL()
     {
    	String URL = pro.getProperty("baseURL"); 
    	return URL;
     }
     public String getUserName() 
     {
    	String username = pro.getProperty("username"); 
    	return username;
     }
     public String getPassword()
     {
    	String password = pro.getProperty("password");
    	return password;
     }
}
