 package practiceyoub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_dropdown {

	public static void main(String[] args) throws InterruptedException {
     ChromeDriver driver=new ChromeDriver(); // 1) .get its is inbuild wait 2) .navigate() it wont wait
		
        driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind"); 
		
		Thread.sleep(2000);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item']"));
		
		System.out.println(options.size());
		
		
		for (WebElement option:options)
		{
			if (option.getText().equalsIgnoreCase("India"))
			 option.click();
				
		}
		
		

	}

}
