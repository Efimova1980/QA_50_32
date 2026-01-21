package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class cssSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void selectorHomePage(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        pause(2);
        hideBanner();
        pause(2);
        driver.navigate().to("https://demoqa.com/elements");
        pause(2);
        driver.navigate().back();
        pause(2);
        driver.navigate().refresh();
        pause(2);
        //driver.close();
        driver.quit();
    }

    @Test
    public void selectorsCssTests(){
        driver.get("https://demoqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        hideBanner();
        pause(2);
        hideFooter();
        pause(2);

//        WebElement footer = driver.findElement(By.tagName("footer"));
//        WebElement divElements = driver.findElement(By.cssSelector(".card-up"));
//        //pause(3);
//        divElements.click();
//        pause(3);
//        WebElement btnRadioButton = driver.findElement(By.cssSelector("#item-2"));
//        btnRadioButton.click();
//        pause(3);
//        WebElement btnYes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
//        btnYes.click();
//        pause(3);
//        driver.navigate().back();
//        driver.navigate().back();
//        pause(3);
//        WebElement divWidgets = driver.findElement(By.cssSelector("div.category-cards div.card.mt-4.top-card:nth-child(4)"));
//        divWidgets.click();

        driver.quit();
    }

    public void hideBanner(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('#fixedban').style.display = 'none'");
    }

    public void hideFooter(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.querySelector('footer').style.display = 'none'");
    }

    public void pause(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
