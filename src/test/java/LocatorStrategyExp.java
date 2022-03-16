import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategyExp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
      //  driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
       // driver.findElement(By.className("search-box-button")).click();
      //  driver.findElement(By.linkText("Register")).click();
      //  driver.findElement(By.linkText("Log in")).click();
       // driver.findElement(By.partialLinkText("downloads")).click();
        driver.findElement(By.name("q")).sendKeys("books");
        driver.findElement(By.className("search-box-button")).click();
        //driver.close();
    }
}

