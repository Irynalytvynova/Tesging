import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class AutoInfo {
    @Test
    public static void getYear (){
        System.setProperty("webdriver.chrome.driver", "C:\\ChrDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost/index2.html");

        WebElement title = driver.findElement(By.id("film_name"));
        title.sendKeys("Jaw");
        WebElement bttn = driver.findElement(By.id("get_api_res_btn"));
        bttn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement year = driver.findElement(By.xpath("//*[@id=\"api_year\"]"));
        String par = year.getText();
        Assert.assertEquals(par, "Year: 2005");
    }
    public static void main(String[] args) {
        getYear();
    }
}
