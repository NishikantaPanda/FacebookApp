package genericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DriverUtilities {

	public void dropDown(WebElement ele, String name) {
		
		Select s  = new Select(ele);
		s.selectByVisibleText(name);
	}
	
	public void mouseHover(WebElement ele, WebDriver driver) {
		Actions a = new Actions(driver);
		a.moveToElement(ele);
	}
	
	public void doubleClick(WebElement ele , WebDriver driver) {
		
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();;
	}
	
	public void rightClick(WebDriver driver, WebElement ele) {
		
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	public void dragAndDrop(WebDriver driver, WebElement src, WebElement dest) {
		
		Actions a = new Actions(driver);
		a.dragAndDrop(src, dest);
	}
	
	public void switchFrame(WebDriver driver) {
		
		driver.switchTo().frame(0);
	}
	
	public void switchBackFrame(WebDriver driver) {
		
		driver.switchTo().defaultContent();
		
	}
	
	public void alertPopup(WebDriver driver) {
		
		driver.switchTo().alert();
	}
	
	public void scrollBar(WebDriver driver, int x ,int y) {
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("window.scrollBy("+x+","+y+")");
	}
	
	public void switchTab(WebDriver driver) {
		
		Set<String> handle = driver.getWindowHandles();
		
		for(String h:handle) {
			
			driver.switchTo().window(h);
		}
		
	}
}
