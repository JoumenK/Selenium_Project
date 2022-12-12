package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CheckOutOverview {
    WebDriver driver;
    public CheckOutOverview (WebDriver driver){
        this.driver=driver;
    }
    public void checkOverview(){
        WebElement checkOverv=driver.findElement(By.xpath("//*[contains(text(), 'Checkout: Overview')]"));
        Assert.assertTrue(checkOverv.isDisplayed(),"titre incorrect");
    }
    public void totalCommande(){
        WebElement totalCom=driver.findElement(By.xpath("//*[@class ='summary_total_label']"));
        Assert.assertTrue(totalCom.isDisplayed(),"le total est incorrect");
    }
    public void boutonFinish(){
        WebElement btnFinish=driver.findElement(By.id("finish"));
        btnFinish.click();
    }
}
