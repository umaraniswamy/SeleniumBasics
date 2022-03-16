package framesexp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesExp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Frames")).click();
        driver.findElement(By.linkText("iFrame")).click();
        int framesize=driver.findElements(By.tagName("iframe")).size();
        System.out.println("no of frames "+framesize);
        driver.switchTo().frame(driver.findElement(By.id("mce_0_ifr")));
        String frametext=driver.findElement(By.xpath("//p[text()='Your content goes here.']")).getText();
        System.out.println("text with in the frame...."+frametext);
        driver.switchTo().defaultContent();
       String outsideText= driver.findElement(By.xpath("//h3[text()='An iFrame containing the TinyMCE WYSIWYG Editor']")).getText();
        System.out.println("text outside of the frame..."+outsideText);
       driver.close();




    }
}

