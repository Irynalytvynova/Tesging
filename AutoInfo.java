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

public class AutoInfo {
    @Test
    public static void getYear (){
        System.setProperty("webdriver.chrome.driver", "C:\\ChrDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/xampp/htdocs/index2.html");
        WebElement title = driver.findElement(By.id("film_name"));
        title.sendKeys("Jaw");
        WebElement bttn = driver.findElement(By.id("get_api_res_btn"));
        bttn.click();
        WebElement year = driver.findElement(By.xpath("//*[@id=\"api_year\"]"));
        String par = year.getText();
        System.out.println(par);
        Assert.assertEquals(year.isDisplayed(), "Year: 2005");
    }
    @Test
    public static void getDirector (){
        System.setProperty("webdriver.chrome.driver", "C:\\ChrDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/xampp/htdocs/index2.html");
        WebElement title = driver.findElement(By.id("film_name"));
        title.sendKeys("Jaw");
        WebElement bttn = driver.findElement(By.id("get_api_res_btn"));
        bttn.click();
        WebElement director = driver.findElement(By.id("api_director"));
        String par2 = director.getText();
        System.out.println(par2);
        Assert.assertEquals(director.isDisplayed(), "Director: Alex Dawson");
    }
    public static void main(String[] args) {
        getDirector();
        getYear();

    }

}
