package javapackage;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://www.w3schools.com/");
    driver.findElement(By.linkText("Try it Yourself")).click();
    Set<String>  windowlist=driver.getWindowHandles();
    List <String> Windowid = new ArrayList(windowlist);
    driver.switchTo().window(Windowid.get(1));
    System.out.println(driver.getCurrentUrl());
    driver.close();
    
    
    //String Childid =Windowid.get(1);
   // System.out.println(Childid);
    
  //  String Parentid = Windowid.get(0);
   // System.out.println(Parentid);
   // driver.switchTo().window(Childid);
   // driver.close();
   // driver.quit();
    
  
    
    
    
	}

}
