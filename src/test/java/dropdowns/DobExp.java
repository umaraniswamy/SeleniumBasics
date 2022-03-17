package dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DobExp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("tester@gmail.com");

       WebElement daywebele= driver.findElement(By.name("DateOfBirthDay"));
        Select dayDropdown= new Select(daywebele);
        dayDropdown.selectByValue("18");
        WebElement monthwebele= driver.findElement(By.name("DateOfBirthMonth"));
        Select monthDropdown= new Select(monthwebele);
       // monthDropdown.selectByVisibleText("January");
        monthDropdown.selectByIndex(1);
        WebElement yearwebele= driver.findElement(By.name("DateOfBirthYear"));
        Select yearDropdown= new Select(yearwebele);
        yearDropdown.selectByVisibleText("2022");



    }

}
