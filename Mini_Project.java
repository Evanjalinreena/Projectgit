package com.Maven_Project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mini_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Hp\\eclipse-workspace\\October Selenium Class\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		WebElement dress = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac = new Actions(driver);
		ac.moveToElement(dress).build().perform();
		WebElement blous = driver.findElement(By.xpath("//a[text()='Blouses']"));
		blous.click();

		WebElement image = driver.findElement(By.xpath("//img[@title='Blouse']"));
		ac.moveToElement(image).build().perform();

		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));

		cart.click();
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		ac.doubleClick(check).build().perform();
		Thread.sleep(3000);

		WebElement pro = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ac.click(pro).build().perform();
		Thread.sleep(3000);

		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		email.sendKeys("evanjalinreena1994@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("lordismyhelper");
		WebElement sign = driver.findElement(By.xpath("//button[@id='SubmitLogin']"));
		sign.click();
		Thread.sleep(3000);

		WebElement proced = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ac.click(proced).build().perform();
		Thread.sleep(3000);

		WebElement box = driver.findElement(By.xpath("//input[@type='checkbox']"));
		box.click();
		Thread.sleep(3000);

		WebElement prooce = driver.findElement(By.xpath("//button[@class='button btn btn-default standard-checkout button-medium']"));
		prooce.click();
		Thread.sleep(3000);

		WebElement bank = driver.findElement(By.xpath("//a[@class='bankwire']"));
		bank.click();
		Thread.sleep(3000);

		WebElement confirm = driver.findElement(By.xpath("//span[text()='I confirm my order']"));

		ac.click(confirm).build().perform();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)", "");
		Thread.sleep(3000);

		System.out.println("MiniProject Complete");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Users\\Hp\\eclipse-workspace\\Maven_Project\\Screenshot\\miniproject.png");
		FileUtils.copyFile(source, destination);

	}

}
