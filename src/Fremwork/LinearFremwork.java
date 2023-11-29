package Fremwork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinearFremwork {

	public static void main(String[] args) throws InterruptedException {
		
			//open Browser
			WebDriver driver = new FirefoxDriver();
			//open application
			driver.get("https://demoapps.qspiders.com/");
			Thread.sleep(4000);
			//Enter username
			driver.findElement(By.id("name")).sendKeys("Admin");
			Thread.sleep(4000);
			//Enter mail
			driver.findElement(By.id("email")).sendKeys("Admin@123.com");
			//Verfiy home displayed or not
			WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleContains("Demo Apps"));
			System.out.println("Home page dispayed");
			;
			
	}

}
