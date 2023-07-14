package dropDownWithSelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithSelectClass {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://crossbrowsertesting.github.io/");
		 driver.manage().window().maximize();
		 driver.findElement(By.xpath("//a[contains(text(),'Se')]")).click();
		 WebElement dropdowns=driver.findElement(By.xpath("//select[@id='dropdown']"));
		 Select obj=new Select(dropdowns);
		List<WebElement> dropdownlist=obj.getOptions();
		 for(WebElement dropdownli: dropdownlist) {
			 System.out.println(dropdownli.getText());
		 }
		 

	}

}
