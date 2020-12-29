package com.tests;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class TestCases extends BaseClass {
	
	
	@Test (dataProvider = "dataprovider")
	public void test1(String a)
	{
		System.out.println("Executing Test1 for Value = "+a);
	}
	
	

}
