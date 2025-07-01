package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver = new ChromeDriver();
	 driver.navigate().to("https://www.google.com/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//textarea[@aria-label='Search']")).sendKeys("Naresh IT");
	 Thread.sleep(5000);
	List <WebElement> SearchSugg = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li//span"));
	Thread.sleep(5000);
	//System.out.println(SearchSugg.size());
	for(WebElement Sugg :SearchSugg  ) 
	{
		String text=Sugg.getText();
		if(text.equalsIgnoreCase("naresh it ameerpet contact number")) 
		{
			Sugg.click();
			break;
		}
	}
  
	}

}
