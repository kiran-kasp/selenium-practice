package practiceyoub;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifypageTitle {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver(); 
		
		driver.get("https://www.google.com/");
		
		Thread.sleep(2000);
		
		// For printing to a console system.out.println();
		
		
		System.out.println(driver.getTitle());
		
		// how to get current url
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
		}

}
