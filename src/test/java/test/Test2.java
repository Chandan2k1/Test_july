package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://github.com/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
       // driver.findElement(By.linkText("Create new account")).click();
        driver.findElement(By.xpath("//a[starts-with(text(),'Create an account')]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Abc@1234");
        driver.findElement(By.xpath("//input[@id='login']")).sendKeys("Abc@1234");
	}

}
