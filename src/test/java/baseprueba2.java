import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class baseprueba2 {
        private WebDriver driver;


        public void setUp(){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/");

            List<WebElement> links =driver.findElements(By.tagName("a"));
            System.out.println(links.size());

            WebElement inputsLink = driver.findElement(By.linkText("inputs"));
            inputsLink.click();

            driver.quit();
        }

        public static void main(String args[]){
            baseprueba test = new baseprueba();
            test.setUp();
        }
    }

