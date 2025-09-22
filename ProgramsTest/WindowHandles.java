package ProgramsTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		//for(String window: windowHandles)
		Iterator<String> iterator = windowHandles.iterator();
		String Parent = iterator.next();
		String Child = iterator.next();
		
		driver.switchTo().window(Child);
		System.out.println("ChildWindow" + driver.getTitle());
		
		driver.switchTo().window(Parent);
		System.out.println("ParentWindow"+ driver.getTitle());
				
		driver.switchTo().window(Child);
		System.out.println("ChildWindow" + driver.getTitle());
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys("Wills").perform();
	}

}
