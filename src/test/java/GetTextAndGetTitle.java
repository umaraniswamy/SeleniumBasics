import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndGetTitle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String welcomemsg=driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();
        System.out.println(welcomemsg);
        String s1=driver.findElement(By.xpath("//strong[text()='Featured products']")).getText();
        System.out.println(s1);
        String homeTitle= driver.getTitle();
        System.out.println(homeTitle);
        driver.findElement(By.linkText("Register")).click();
        System.out.println(driver.getTitle());
    }

}
