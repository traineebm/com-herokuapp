import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MozillaFireFox {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver-v0.30.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title = driver.getTitle();
        System.out.println(title);

        System.out.println("Current URL = " + driver.getCurrentUrl());
        String loginUrl = "http://the-internet.herokuapp.com/login";
        driver.navigate().to(loginUrl);
        System.out.println("Current URL = " + driver.getCurrentUrl());

        WebElement emailField = driver.findElement(By.name("username"));
        emailField.sendKeys("arrow123");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("treat345");
        driver.close();
    }
}
