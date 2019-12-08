package Automation;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.corba.se.spi.orbutil.fsm.Action;

public class selenium {

	private static final String Driver1 = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://svcollegetest.000webhostapp.com/");
		
		driver.manage().window().maximize();
		
		//Sanity (Chrome)
		
		driver.findElement(By.id("startB")).click();

		driver.findElement(By.name("question")).sendKeys("A?");
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("A");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("A");
		
		driver.findElement(By.name("answer")).click();
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("question")).sendKeys("B?");
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("B");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("B");
		
		driver.findElement(By.name("answer")).click();
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("question")).sendKeys("C?");
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("C");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("C");
		
		driver.findElement(By.name("answer")).click();
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		
		driver.findElement(By.name("answertest2")).click();
		driver.findElement(By.id("btnnext")).click();
		
		driver.findElement(By.name("answertest1")).click();
		driver.findElement(By.id("btnnext")).click();
		
		driver.findElement(By.name("answertest0")).click();
		driver.findElement(By.id("btnnext")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"markpage\"]/center/button[2]")).click();
		
		driver.get("http://svcollegetest.000webhostapp.com/");
		
		//Functionality
		
		driver.findElement(By.id("startB")).click();
		
		driver.findElement(By.name("question")).sendKeys("Which are red vegetables");
		Thread.sleep(2000);
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("Tomato");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("Cucumber");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("Lemmon");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("Carrot");
		
		driver.findElement(By.name("answer")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("question")).sendKeys("Which are green vegetables");
		Thread.sleep(2000);
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("Cucumber");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("Carrot");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("Tomato");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("Lemon");
		
		driver.findElement(By.name("answer")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("question")).sendKeys("Which are yellow vegetables");
		Thread.sleep(2000);
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.name("answer1")).sendKeys("Lemon");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[2]/div[2]/input")).sendKeys("Cucumber");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[3]/div[2]/input")).sendKeys("Carrot");
		driver.findElement(By.xpath("//*[@id=\"answers\"]/div[4]/div[2]/input")).sendKeys("Tomato");
		
		driver.findElement(By.name("answer")).click();
		
		
		driver.findElement(By.id("nextquest")).click();
		
		driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]")).click();
		
		driver.findElement(By.name("answertest2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnnext")).click();
		
		driver.findElement(By.name("answertest1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnnext")).click();
		
		driver.findElement(By.name("answertest0")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("btnnext")).click();
		
		//Integration
		driver.findElement(By.xpath("//*[@id=\"fackBook2\"]/img")).click();
		
		driver.switchTo().alert().accept();
		
		
		//Compatibility (FireFox) *REPEAT SANITY STEPS*
		System.setProperty("webdriver.gecko.driver",  "C:\\Users\\נופר בכר\\Downloads\\newFolder");
		FirefoxDriver driver1 = new FirefoxDriver ();
		driver1.get("http://svcollegetest.000webhostapp.com/");		
		


		
		
		
		
		
		
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
