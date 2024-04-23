package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AddUserTest {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:\\selenium\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		WebElement userName=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		userName.sendKeys("Admin");
		
		WebElement pass= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		pass.sendKeys("admin123");
		
		WebElement loginBut = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		loginBut.click();
		
		Thread.sleep(5000);
		
		WebElement name = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
		
		WebElement dashBoard = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[8]/a"));
		
	//	Assert.assertEquals(name.isDisplayed(), true);

		
		if ((name.isDisplayed() &&dashBoard.isDisplayed())==true) {
			System.out.println("Login Successfull");
		}else {
			System.out.println("Login Unsuccessfull");
		}
		
		WebElement adminBut= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span"));
		adminBut.click();
		
		Thread.sleep(5000);

		WebElement addBut= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		addBut.click();
		
		Thread.sleep(5000);
		
		WebElement userRoleBox= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i"));
		userRoleBox.click();
		
		WebElement userRoleElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		userRoleBox.click();
		userRoleElement.sendKeys("Amdin");
//		Select userRole = new Select(userRoleElement);
//		userRole.selectByIndex(0);
//		
		WebElement statusElement= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
		//Select status = new Select (statusElement);
		//status.selectByVisibleText("Disabled");
		
		WebElement empName=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		empName.sendKeys("QA  Admin");
		
		WebElement user = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
		user.sendKeys("Sagar");
		
		WebElement passWord= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
		passWord.sendKeys("12345678asdf");
		
		WebElement confirmPass= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
		confirmPass.sendKeys("12345678asdf");
		
		WebElement save = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
		save.click();
	}

}
