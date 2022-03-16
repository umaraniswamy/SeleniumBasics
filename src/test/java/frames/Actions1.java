package frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions1 {

        public static void main(String[] args)  {
             WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();



            driver.navigate().to("https://demo.nopcommerce.com/");

            driver.manage().window().maximize();


            driver.findElement(By.id("small-searchterms")).sendKeys("mac");

            WebElement searchTextBox = driver.findElement(By.id("small-searchterms"));

            Actions actions = new Actions(driver);

            actions.sendKeys(searchTextBox, Keys.ENTER).build().perform();

            String searchResPageTitle =  driver.getTitle();
            System.out.println(searchResPageTitle);


            //driver.quit();
        }
    }


