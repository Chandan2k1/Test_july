package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");
		driver.manage().window().maximize();
	   WebElement DD =	driver.findElement(By.id("prefix"));
	   Select Dropd= new Select(DD);
	   Dropd.selectByVisibleText("Mr.");
	   
	   driver.findElement(By.id("passport")).click();		
	}

}
