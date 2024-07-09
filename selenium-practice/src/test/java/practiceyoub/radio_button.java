package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//label[2]//span[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='form-check-inline']//label[1]//span[2]")).click();		
	}

}
