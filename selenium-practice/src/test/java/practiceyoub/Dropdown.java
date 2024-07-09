package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		Thread.sleep(2000);
		
		WebElement staticdropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select Dropdown= new Select(staticdropdown);
		
		//Dropdown.selectByIndex(1);
		
		//Dropdown.selectByVisibleText("Teacher");
		
		  Dropdown.selectByValue("consult");

	}

}
