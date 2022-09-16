package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //Amazon sayfasına gidiniz
        driver.get("https://www.amazon.com");
        // arama kutusunu locate ediniz
        /*<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">*/
        WebElement aramaKutusu =driver.findElement(By.id("twotabsearchtextbox"));
        //arama kutusunun tagname nin input oldugunu test ediniz
        String actualTagName = aramaKutusu.getTagName();
        String expectedTagName = "input";
        if (actualTagName.equals(expectedTagName)){
            System.out.println("TagName testi PASSED");
        }else System.out.println("TagName testi FAILED");

        //arama kutusunun name atributre değerinin field - keyword olduğunu test ediniz
        String actualAtributeName = aramaKutusu.getAttribute("name");
        String expectedAtributeName = "field-keywords";
        if (actualAtributeName.equals(expectedAtributeName)){
            System.out.println("AtributeName testi PASSED");
        }else System.out.println("AtributeName testi FAILED");

        //Arama kutusunun konumunu yazdiriniz
        System.out.println("aramaKutusu.getLocation() = " + aramaKutusu.getLocation());
        System.out.println("aramaKutusu.getAccessibleName() = " + aramaKutusu.getAccessibleName());

        //syfayi kapatiniz
        driver.close();


    }
}
