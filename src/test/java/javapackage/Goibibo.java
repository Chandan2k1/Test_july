package javapackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		
		
		 WebElement fromField = driver.findElement(By.xpath("//span[text()='From']"));
		 fromField.click(); Thread.sleep(500);
		 
		
		 WebElement fromInput = driver.findElement(By.xpath("(//input[@type='text' and @='Enter city or airport'])[1]"));

        fromInput.sendKeys("Delhi");
        Thread.sleep(2000);
        fromInput.sendKeys(Keys.ENTER);
		
	}

}
