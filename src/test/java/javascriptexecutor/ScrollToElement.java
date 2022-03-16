package javascriptexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollToElement {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String homeTitle = driver.getTitle();
        System.out.println(homeTitle);
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//button[text()='Add to cart'])[4]")));
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[4]")).click();
        System.out.println(driver.getTitle());
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("email-a-friend-button")));
        driver.findElement(By.className("email-a-friend-button")).click();
        System.out.println(driver.getTitle());

    }
    }


