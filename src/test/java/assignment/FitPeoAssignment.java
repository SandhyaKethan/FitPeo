package assignment;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FitPeoAssignment {

	public static void main(String[] args) throws Exception {

		WebDriver driver=new ChromeDriver();
		Actions act=new Actions(driver);	
	    driver.manage().window().maximize();
		driver.get("https://www.fitpeo.com/");
		driver.navigate().to("https://fitpeo.com/revenue-calculator");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		WebElement ele=driver.findElement(By.xpath("//span[@class='MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary MuiSlider-thumb MuiSlider-thumbSizeMedium MuiSlider-thumbColorPrimary css-1sfugkh']"));
		act.dragAndDropBy(ele,94,0).perform();
		Thread.sleep(2000);
		WebElement ele2= driver.findElement(By.xpath("//input[@type='number']"));
		ele2.sendKeys("560");
						
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
		r.keyRelease(KeyEvent.VK_BACK_SPACE);
		r.keyPress(KeyEvent.VK_BACK_SPACE);
	    r.keyRelease(KeyEvent.VK_BACK_SPACE);
	    driver.findElement(By.xpath("//input[@type='number']")).sendKeys("560");
		boolean b=driver.findElement(By.xpath("//input[@type='number']")).isDisplayed();
		 System.out.println(b);
		jse.executeScript("window.scrollBy(0,400)");
		WebElement CPT99091=driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		CPT99091.click();
		WebElement CPT99453=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		CPT99453.click();
		 WebElement CPT99454=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		 CPT99454.click();
		WebElement CPT99474=driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		CPT99474.click();
		 WebElement TotalRecurring=driver.findElement(By.xpath("(//p[@class='MuiTypography-root MuiTypography-body2 inter css-1xroguk'])[4]"));	 
	       String value=TotalRecurring.getText();
	       System.out.println(value);
		 driver.quit();



	}

}
