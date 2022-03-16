package actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
      WebElement computers= driver.findElement(By.linkText("Computers"));
      Actions action=new Actions(driver);
      action.moveToElement(computers).perform();
      driver.findElement(By.linkText("Notebooks")).click();
        System.out.println(driver.getTitle());
    }

}
