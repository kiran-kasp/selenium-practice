package firstchrome_automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerDemo {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		//approach1
	//	driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys(" 10/15/2022");
		
		//Approach2
		
				String year="2025";
				String month="march";
				String date="15";
						
				driver.findElement(By.xpath("//input[@id='datepicker']")).click(); // will open the date picker
					
				
				//select month & year
				while(true)
				{
					String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
					String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
					
					if(mon.equals(month) && yr.equals(year))
					{
						break;
					}
					
					//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();  // Future date
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();   //Past date
					
							
				}
				
				//select date
				
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				for(WebElement dt:allDates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
				
				
		
		
			

	}

}
