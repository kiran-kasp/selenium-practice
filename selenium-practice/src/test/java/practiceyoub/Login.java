package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
	    driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("asdf@gamil.com");
		
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("18736gjhh");
		
		Thread.sleep(2000);
		
		//driver.findElement(By.cssSelector("button[value='1']")).click();
		
		System.out.println(driver.findElement(By.xpath("//h2[@class='_8eso']")).getText());
		
		//Thread.sleep(2000);
		
		
	//	driver.close();

		



	}

}

