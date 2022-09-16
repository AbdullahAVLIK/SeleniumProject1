package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssLocators {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        /*
        1 ) Bir class oluşturun : Locators_css
        2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        b. Locate email textbox
        c. Locate password textbox ve
        d. Locate signin button
        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
                */

        //a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        driver.get("http://a.testaddressbook.com/sign_in");

        //        b. Locate email textbox
        //<input type="email" class="form-control" placeholder="Email" data-test=
        // "email" name="session[email]" id="session_email">
        WebElement email = driver.findElement(By.cssSelector("#session_email"));
        //        c. Locate password textbox ve
        //<input class="form-control" placeholder="Password" data-test="password"
        // type="password" name="session[password]" id="session_password">
        WebElement password = driver.findElement(By.cssSelector("#session_password"));
        //        d. Locate signin button
        //<input type="submit" name="commit" value="Sign in" class="btn btn-primary"
        // data-test="submit" data-disable-with="Sign in">
        WebElement signIn = driver.findElement(By.cssSelector("input[name='commit']"));
        ////*[@name='commit'] -->xpath ile
        //        e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!
        Thread.sleep(2000);
        email.sendKeys("testtechproed@gmail.com");
        Thread.sleep(2000);
        password.sendKeys("Test1234!");
        Thread.sleep(2000);
        signIn.click();
        driver.quit();

    }
}
