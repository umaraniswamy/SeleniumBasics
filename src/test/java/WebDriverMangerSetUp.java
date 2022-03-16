import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMangerSetUp {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
      //  WebDriverManager.firefoxdriver().setup();
        //WebDriver driver=new FirefoxDriver();

        driver.get("https://demo.nopcommerce.com/"); // open the url
        driver.manage().window().maximize(); // maximize the window
       driver.navigate().to("https://demo.nopcommerce.com/");
        WebElement item = driver.findElement(By.id("small-searchterms"));
        item.sendKeys("laptop");
        driver.navigate().refresh();
        item.sendKeys("mobile");
       // driver.navigate().forward();
        //driver.navigate().back();



        driver.close(); // close the driver



    }
}
