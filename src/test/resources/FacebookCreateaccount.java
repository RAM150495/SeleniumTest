import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateaccount {
public static void main(String[] args) {
		
		ChromeOptions op = new ChromeOptions();
		
		op.addArguments("--disable-notifications");
		
		WebDriver d = new ChromeDriver(op);
		
		d.manage().window().maximize();
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
		d.get("https://www.facebook.com/");
		
		d.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		d.findElement(By.name("firstname")).sendKeys("Ramaneeyan");
		
		d.findElement(By.name("lastname")).sendKeys("Saravanan");
		
		WebElement day = d.findElement(By.id("day"));
		
		Select s = new Select(day);
		s.selectByValue("15");
		
		WebElement month = d.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByValue("4");
		
		WebElement year = d.findElement(By.id("year"));
		Select s2 =new Select(year);
		s2.selectByValue("1995");
		
		d.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		d.findElement(By.name("reg_email__")).sendKeys("6380155230");
		
		d.findElement(By.name("reg_passwd__")).sendKeys("ram15495");
		
		//d.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		
		
		
		
		
		
		
	}
	

}
