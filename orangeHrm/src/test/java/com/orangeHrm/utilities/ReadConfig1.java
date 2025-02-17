package com.orangeHrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig1 {

	Properties pro;
	   public  ReadConfig1() {
		   File src = new File("./Configurations/config.properties");
		   try {
			   FileInputStream fis = new FileInputStream(src);
			   pro = new Properties();
			   pro.load(fis);
		   } catch(Exception e) {
			   System.out.println("Exception is " + e.getMessage());
		   }
		   
	   }
	   
	   
	   public String getApplicationURL() {
		   String url = pro.getProperty("baseurl");
		   return url;
	   }
	   
	   public String getUsername() {
		   String username = pro.getProperty("username");
		   return username;
	   }
	   
	   public String getPassword() {
		   String password = pro.getProperty("password");
		   return password;
	   }
	   
	   public String getChromepath() {
		   String chromepath = pro.getProperty("chromepath");
		   return chromepath;
	   }
	   
	   public String getEdgepath() {
		   String edgepath = pro.getProperty("edgepath");
		   return edgepath;
	   }
	   
	   public String getFirefoxpath() {
		   String firefoxpath = pro.getProperty("firefoxpath");
		   return firefoxpath;
	   }
}
