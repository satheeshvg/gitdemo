package satz;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.qaclickhome;
import resources.base;

public class textvalidation extends base {
	public static Logger log=LogManager.getLogger(navigationbar.class.getName());
	
	@Test
	public  void checktitle() throws IOException {
		// TODO Auto-generated method stub
		
	
		qaclickhome qa=new qaclickhome(driver);
		Assert.assertTrue(qa.hometext().getText().equalsIgnoreCase("FEATURED COURSES"));
		log.info("Validated title");
		System.out.println("one");
		System.out.println("two");
		
	
				
		}
	@AfterTest
	public void closing()
	{
		driver.close();
		driver=null;
	}
	
	@BeforeTest
	public void initialization() throws IOException
	{
		driver=invoke();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void fuck()
	{
		System.out.println("three");
		System.out.println("four");
		System.out.println("five");
		System.out.println("six");
	
	}
	@Test
	public void duck()
	{
		System.out.println("three");
		System.out.println("four");
		System.out.println("five");
		System.out.println("hi");
	}
	@Test
	public void much()
	{
		System.out.println("three");
		System.out.println("four");
		System.out.println("five");
	}
	@Test
	public void kuch()
	{
		System.out.println("three");
		System.out.println("four");
		System.out.println("five");
	}
	

}
