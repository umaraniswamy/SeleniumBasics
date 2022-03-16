import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExp {
    public static void main(String[] args) {
        System.out.println("program about how to use css selector");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
       // driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("books");
       // driver.findElement(By.cssSelector("input[placeholder='Enter your email here...']")).sendKeys("user1@gmail.com");
        driver.findElement(By.cssSelector(".answer:nth-of-type(2)")).click();

    }

}
