package MyselfWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebelementMetod1 {
    public static void main(String[] args) {

        // maneuel olarak gerceklestirdigimiz herhangi bir senaryoyu Selenium ile driver kullanarak kodlarla yapmaya TestOtomasyon denir...

/*
1-https://www.amazon.ca sayfasina gidin.
2-arama cubugunda "nutella "  yazdirin
3- Nutella yazdiktan sonra ENTER a basin arama islmenini yapin
4- Bulunan sonuc sayisini  yazdirin...

 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //1-https://www.amazon.ca sayfasina gidin.
        driver.get("https:www.amazon.ca");
        //2-arama cubugunda "nutella "  yazdirin

        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));
        aramaKutusu.sendKeys("nutella");
        //3-3- Nutella yazdiktan sonra ENTER a basin arama islmenini yapin
        aramaKutusu.submit();
        //4- Bulunan sonuc sayisini  yazdirin...
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        System.out.println(sonucYaziElementi.getText());

        driver.close();


    }
}
