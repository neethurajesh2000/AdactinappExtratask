package com.adactin.hotelapp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class adactin {
	protected static String url="https://adactinhotelapp.com/HotelAppBuild2/index.php";
	 WebDriver driver;
	@BeforeSuite
	 public void startChromeBrowser() {
		 WebDriverManager.chromedriver().setup();//setup required initially.
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	 }
	 @BeforeClass
	 public void openUrl() {
		  driver.get(url);	
	 }
	 	
	@Test
   public void adactinregisteration() throws InterruptedException {
//		 WebElement newuserregisterelement=driver.findElement(By.cssSelector("a[href='Register.php']"));
//		 newuserregisterelement.click();
//		 WebElement username=driver.findElement(By.id("username"));
//		 username.sendKeys("thomaskerala");
//		 WebElement password=driver.findElement(By.id("password"));
//		 password.sendKeys("tom123");
//		 WebElement confirmpassword=driver.findElement(By.id("re_password"));
//		 confirmpassword.sendKeys("tom123");
//		 WebElement fullname=driver.findElement(By.id("full_name"));
//		 fullname.sendKeys("thomas");
//		 WebElement email=driver.findElement(By.id("email_add"));
//		 email.sendKeys("thomasphy@gmail.com");
//		 WebElement checkbox=driver.findElement(By.id("tnc_box"));
//		 checkbox.click();
//		 WebElement submitbutton=driver.findElement(By.id("Submit"));
//		 submitbutton.click();
//	     driver.navigate().back();
	     WebElement loginusername=driver.findElement(By.id("username"));
		 loginusername.sendKeys("thomaskerala");
		 WebElement loginpassword=driver.findElement(By.id("password"));
		 loginpassword.sendKeys("tom123");
		 WebElement loginbutton=driver.findElement(By.id("login"));
		 loginbutton.click();
		 
		 WebElement selectelement=driver.findElement(By.id("location"));
		  //create an object of Select class
		  Select select=new Select(selectelement);
		  select.selectByIndex(1);
		  Thread.sleep(1000);
	     
		  WebElement selectelement1=driver.findElement(By.id("hotels"));
		  //create an object of Select class
		  Select select1=new Select(selectelement1);
		  select1.selectByIndex(1);
		  Thread.sleep(1000);
		  
		  WebElement selectelement2=driver.findElement(By.id("room_type"));
		  //create an object of Select class
		  Select select2=new Select(selectelement2);
		  select2.selectByIndex(1);
		  Thread.sleep(1000);
	      
		  WebElement selectelement3=driver.findElement(By.id("room_nos"));
		  //create an object of Select class
		  Select select3=new Select(selectelement3);
		  select3.selectByIndex(2);
		  Thread.sleep(1000);
		  
		   WebElement checkindate=driver.findElement(By.id("datepick_in"));
		   checkindate.sendKeys("25/08/2024");
		   WebElement checkoutdate=driver.findElement(By.id("datepick_out"));
		   checkoutdate.sendKeys("30/08/2024");
		   
		   WebElement selectelement4=driver.findElement(By.id("adult_room"));
		    //create an object of Select class
			Select select4=new Select(selectelement4);
			select4.selectByIndex(2);
			Thread.sleep(1000);
			
			WebElement selectelement5=driver.findElement(By.id("child_room"));
			    //create an object of Select class
			 Select select5=new Select(selectelement5);
			 select5.selectByIndex(2);
			 Thread.sleep(1000);
			  
			WebElement searchbutton=driver.findElement(By.xpath("//input[@id='Submit']"));
			searchbutton.click();	
			
			WebElement radiobutton=driver.findElement(By.id("radiobutton_0"));
			radiobutton.click();
			
			WebElement continuebutton=driver.findElement(By.id("continue"));
			continuebutton.click();
			
			WebElement bookfirstname=driver.findElement(By.id("first_name"));
			bookfirstname.sendKeys("thomas");
			WebElement booklastname=driver.findElement(By.id("last_name"));
			booklastname.sendKeys("mathew");
			WebElement billingaddress=driver.findElement(By.id("address"));
			billingaddress.sendKeys("L&T Park, Hyderabad,65437");
			WebElement creditcardno=driver.findElement(By.id("cc_num"));
			creditcardno.sendKeys("3216547893456782");
			
			WebElement selectelement6=driver.findElement(By.id("cc_type"));
		    //create an object of Select class
		    Select select6=new Select(selectelement6);
		    select6.selectByIndex(2);
		    Thread.sleep(1000);
		    
		    WebElement selectelement7=driver.findElement(By.id("cc_exp_month"));
		    //create an object of Select class
		    Select select7=new Select(selectelement7);
		    select7.selectByIndex(2);
		    Thread.sleep(1000);
		    
		    WebElement selectelement8=driver.findElement(By.id("cc_exp_year"));
		    //create an object of Select class
		    Select select8=new Select(selectelement8);
		    select8.selectByIndex(3);
		    Thread.sleep(1000);
		    
		    WebElement cvvnumber=driver.findElement(By.id("cc_cvv"));
			cvvnumber.sendKeys("6789");
			WebElement booknowbutton=driver.findElement(By.id("book_now"));
			booknowbutton.click();
   }
	
//	 @AfterSuite		
//	  public void closeChromeBrowser() {
//			  driver.quit();
//	  }
}
