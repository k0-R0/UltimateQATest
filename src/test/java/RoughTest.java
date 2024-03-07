import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RoughTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://ultimateqa.com/automation/");
        driver.manage().window().maximize();
        driver.findElement(By.partialLinkText("Big page with many elements")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("#Skills_Improved:first-of-type")
        ));
        System.out.println(driver.getTitle());
        if(driver.getTitle().contains("Complicated Page"))
            System.out.println("moved to the new page");
        driver.quit();
    }
}
