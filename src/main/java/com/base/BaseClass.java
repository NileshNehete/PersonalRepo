package com.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class BaseClass {
	
	
	@BeforeMethod
	public void setup()
	{
		
		System.out.println("Setup Method from base class");
		
	}
	
	@AfterMethod
	public void exit()
	{
		System.out.println("Exit Method from base class");
	}
	
	@DataProvider (name = "dataprovider")
	public Object[] getData()
	{
		Object[] str = new Object[1];
				
			str[0]=	"TestNG";
		
		return str;
	}
	
	

}
