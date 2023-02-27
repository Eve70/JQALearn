package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//Evi//Desktop//Selenium//chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ultimateqa.com/");
        driver.manage().window().maximize();

        driver.findElement(By.className("et_pb_s")).sendKeys("java");
        driver.findElement(By.className("et_pb_s")).submit();
        driver.findElement(By.linkText("Java SDET Bootcamp")).click();
    }
}
