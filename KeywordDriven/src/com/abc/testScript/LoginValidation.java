package com.abc.testScript;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoginValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Automation\\KeywordDriven\\src\\com\\abc\\utilities\\keyword.properties");
        Properties p=new Properties();
        p.load(fis);

	}

}
