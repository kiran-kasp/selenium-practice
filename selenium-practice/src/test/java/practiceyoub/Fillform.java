package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fillform {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("learning");
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[id='terms']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		//Thread.sleep(2000);
		
	//	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger col-md-12']")).getText());
		
		
	}

}
