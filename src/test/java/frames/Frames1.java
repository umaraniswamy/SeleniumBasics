package frames;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Frames1
{
    public static void main(String[] args)
    {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Frames")).click();

        driver.findElement(By.linkText("iFrame")).click();


        int iframesCount = driver.findElements(By.tagName("iframe")).size();

        System.out.println("count"+iframesCount);

      /*  int identifiedFrame = 0;



        for(int i=0;i<iframesCount;i++) {



            driver.switchTo().frame(i);


            System.out.println(driver.findElements(By.id("mce_0_ifr")).size());
            if(driver.findElements(By.id("mce_0_ifr")).size()==1) {



                System.out.println("The required element is available in iframe having index: "+i);

                identifiedFrame = i;



            }



            driver.switchTo().defaultContent();

        }*/



        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));



        String text = driver.findElement(By.xpath("//p[contains(text(),'Your content goes here.')]")).getText();



        System.out.println(text);

        driver.quit();


    }
}
