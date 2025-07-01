package javapackage;

import org.checkerframework.framework.qual.JavaExpression;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Chandan");
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("1234567890");
	WebElement sub=	driver.findElement(By.xpath("//div[@id='subjectsContainer']//input"));
	sub.sendKeys("Maths");
	sub.sendKeys(Keys.ENTER);

		
		
	}

}
