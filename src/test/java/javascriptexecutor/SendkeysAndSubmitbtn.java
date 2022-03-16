package javascriptexecutor;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysAndSubmitbtn {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        String homeTitle= driver.getTitle();
        System.out.println(homeTitle);
        driver.findElement(By.linkText("Log in")).click();
        String loginTitle= driver.getTitle();
        System.out.println(loginTitle);

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('Email').setAttribute('value','user1@nop.com')");//send keys
        js.executeScript("document.getElementById('Password').setAttribute('value','tester')");
        // execute the button
        js.executeScript("arguments[0].click();",driver.findElement(By.className("login-button")));

        driver.close();
    }

}
