

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FilpkartIphoneSearch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pavan kumar\\eclipse-workspace\\Myprojecct\\browser\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		
		
		
	}

}
