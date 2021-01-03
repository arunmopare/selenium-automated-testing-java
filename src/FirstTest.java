import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/home/arun/Desktop/STQA Submission/chromedriver_linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://localhost:4200");

        driver.findElement(By.name("firstname")).sendKeys("Arun Mopare");
        driver.findElement(By.name("lastname")).sendKeys("Arun Mopare");
        driver.findElement(By.name("email")).sendKeys("arunmopare546@gmail.com");
        driver.findElement(By.name("mobile")).sendKeys("9767781162 ");
        driver.findElement(By.name("msg")).sendKeys("Hii I am arun");
        driver.findElement(By.name("btn-submit")).click();

        //        driver.findElement(By.name("q")).submit();
//        driver.findElement(By.name("btnK")).click();
        driver.close();
    }
}
