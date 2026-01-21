package experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class xpathSelectors {
    WebDriver driver = new ChromeDriver();

@Test
public void selectorsTextbox(){
    driver.get("https://demoqa.com/elements");
    driver.manage().window().maximize();
    pause(3);
    hideBanner();
    hideFooter();

    WebElement btnTextbox = driver.findElement(By.xpath("//span[text()='Text Box']"));
    btnTextbox.click();

    WebElement fieldFullname = driver.findElement(By.xpath("//input[@id='userName']"));
    fieldFullname.sendKeys("Elton John");

    WebElement fieldEmail = driver.findElement(By.xpath("//input[@type='email']"));
    fieldEmail.sendKeys("elton@gmail.com");

    WebElement fieldCurAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
    fieldCurAddress.sendKeys("123123, Poland, Warsaw, Abraham st, 10");

    WebElement fieldPerAddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
    fieldPerAddress.sendKeys("123456, USA, Washington, Hankel st, 5");

    WebElement btnSubmit = driver.findElement(By.xpath("//button[@id = 'submit']"));
    btnSubmit.click();
    pause(2);

    WebElement output = driver.findElement(By.id("output"));
    System.out.println(output.getText());

    scrollDown();


    pause(2);
    driver.quit();

}

public void scrollDown(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0, 500);");
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
