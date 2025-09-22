package ProgramsTest;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumBasics1 {

	public static void main(String[] args) {
		
		//ChromeOptions setup,
		ChromeOptions opt=new ChromeOptions();
        opt.addArguments("--start-maximized");
        opt.addArguments("--disable-notifications");
        opt.addArguments("--incognito");
        opt.addArguments("--disable-infobars");
        opt.setAcceptInsecureCerts(true);
        
        //Initialize WebDriver,
        WebDriver driver=new ChromeDriver(opt);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        //Navigate to url,
        driver.get("https://www.selenium.dev/downloads/");
        
        //Explicit WebDriverWait,
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        WebElement until = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
        until.getText();
        until.click();
        
        //Dropdown,
        driver.navigate().to("https://demoqa.com/select-menu");
        WebElement findElement = driver.findElement(By.id("oldSelectMenu"));
        Select select=new Select(findElement);
        select.selectByVisibleText("Black");
        WebElement findElement2 = driver.findElement(By.xpath("//div[@id='react-select-2-option-1-0']"));
        Select select1=new Select(findElement2);
        select1.selectByIndex(1);
        select1.selectByValue("Mr");
        
        //Alert,
        driver.navigate().to("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        //Frames,
        driver.navigate().to("https://demoqa.com/frames");
        driver.switchTo().frame("frame1");
        driver.switchTo().defaultContent();
        
        //Screenshot,
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("screenshot.png"));
        
        String title = driver.getTitle();
        if(title.contains("Wills")) {
        	System.out.println("No");
        }else {
        	System.out.println("yes");
        }
	}
}
