import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.linkText("Log in")).click();
        //driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("user2@gmail.com");
        //driver.findElement(By.xpath("//input[contains(@id,'Email')]")).sendKeys("tester@gamil.com");// register page
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[4]")).click();
    }

}
