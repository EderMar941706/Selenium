import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseprueba {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }

    public static void main(String args[]){
        baseprueba test = new baseprueba();
        test.setUp();
    }
}