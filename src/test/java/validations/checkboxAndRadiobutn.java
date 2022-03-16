package validations;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkboxAndRadiobutn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();
       Boolean result= driver.findElement(By.id("Newsletter")).isSelected();
        System.out.println(" checkbox Result is...."+result);
       Boolean result1 = driver.findElement(By.id("gender-male")).isSelected();
        System.out.println(" radio button Result is...."+result1);
        Boolean result3 = driver.findElement(By.id("register-button")).isEnabled();
        System.out.println(" button Result is...."+result3);
       Boolean result2= driver.findElement(By.xpath("//h1[text()='Register']")).isDisplayed();
        System.out.println("text  Result is...."+result2);






    }


}
