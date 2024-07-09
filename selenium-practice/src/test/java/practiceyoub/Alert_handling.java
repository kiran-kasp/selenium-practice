package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_handling {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("name")).sendKeys("kiran");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		
		//driver.switchTo().alert().accept();   // any alert type we can handle with this lie of code ,if ok/confirm  is there  --> .accept() and if cancel , no --> .dismiss()
		
		
		
	}

}
