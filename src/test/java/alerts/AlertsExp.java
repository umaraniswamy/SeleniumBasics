package alerts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsExp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("JavaScript Alerts")).click();

       /* alert1
       driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
       String result= driver.findElement(By.id("result")).getText();
        System.out.println("result is..."+result);*/

       /* alert 2
        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
       String alertText= driver.switchTo().alert().getText();
        System.out.println("text in the alert"+alertText);
        driver.switchTo().alert().dismiss();
        String result=driver.findElement(By.id("result")).getText();
        System.out.println("the result is.."+result);*/

        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        WebDriverWait wait=new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys("hello world");
        driver.switchTo().alert().accept();
        String result=driver.findElement(By.id("result")).getText();
        System.out.println("the result is.."+result);



        driver.close();

    }
}
