package practiceyoub;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationcommand {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); // 1) .get its is inbuild wait 2) .navigate() it wont wait
		
		driver.navigate().to("https://rahulshettyacademy.com/loginpagePractise/");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
	}

}
