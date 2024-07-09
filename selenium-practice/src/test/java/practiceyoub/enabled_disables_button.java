package practiceyoub;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class enabled_disables_button {

	public static void main(String[] args) throws InterruptedException {
		
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		
		Thread.sleep(2000);
		
		
		String status1 = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("Style");       // //div[@class='picker-second']
		
		Thread.sleep(2000);
		
		System.out.println(status1);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='picker-second']")).click();
		
		Thread.sleep(2000);
		
         String status2 = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("Style");       // //div[@class='picker-second']
		
         Thread.sleep(2000);
         
		System.out.println(status2);
		
		if(status2.contains("display: block; opacity: 1;"))
		{
			System.out.println("Button is enabled");
		
		}
		
		else
		{
		 System.out.println("Button is disabled");	
			
		}
	}

}
