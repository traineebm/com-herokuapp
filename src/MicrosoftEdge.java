import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicrosoftEdge {
    public static void main(String[] args) {
        String baseUrl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.edge.driver","Drivers/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
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
