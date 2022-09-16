package day02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class C01_HomeWork01 {

    /*
Odev 2:dhgd
Yeni bir package olusturalim : day01
Yeni bir class olusturalim : C03_GetMethods
Amazon sayfasina gidelim. https://www.amazon.com/
Sayfa basligini(title) yazdirin
Sayfa basliginin “Amazon” icerdigini test edin
Sayfa adresini(url) yazdirin
Sayfa url’inin “amazon” icerdigini test edin.
Sayfa handle degerini yazdirin
Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
Sayfayi kapatin.

 */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");
        driver.manage().window().maximize();

        //Sayfa basligini(title) yazdirin
        System.out.println("driver.getTitle() = " + driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test ediniz
        String actualTitle = driver.getTitle();
        String expectedTitle = "Amazon";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title testi PASSED");
        }else System.out.println("Title testi FAILED");

        //Sayfa adresini(url) yazdirin
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        //Sayfa url’inin “amazon” icerdigini test edin.
        String actualURL =driver.getCurrentUrl();
        String expectedURL = "amazon";
        if(actualURL.contains(expectedURL)){
            System.out.println("URL testi PASSED");
        }else System.out.println("URL testi FAILED");

        //Sayfa handle degerini yazdirin
        //System.out.println("driver.getPageSource() = " + driver.getPageSource());

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        String actualHTML =driver.getPageSource();
        String expectedHTML = "Gateway";
        if(actualHTML.contains(expectedHTML)){
            System.out.println("HTML testi PASSED");
        }else System.out.println("HTML testi FAILED");

        //Sayfayi kapatin.
        driver.close();



    }
}
