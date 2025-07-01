package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiCheckbox {
	
public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();
	driver.get("https://total-qa.com/checkbox-example/");
	driver.manage().window().maximize();
	List <WebElement>	cbx= driver.findElements(By.xpath("//input[@name='chk']"));
	//System.out.println(cbx.size());
	for(int i=0;i<cbx.size();i++) {
		if((i==0) || (i==2)) {
			cbx.get(i).click();
		}
	}
}
}
