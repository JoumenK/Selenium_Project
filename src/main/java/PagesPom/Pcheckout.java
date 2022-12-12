package PagesPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Pcheckout {

    WebDriver driver;

    public Pcheckout(WebDriver driver) {
        this.driver = driver;
    }

    public void saisiNom (String nom) {
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys(nom);
    }
    public void saisiPrénom(String prénom) {
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys(prénom);
    }
    public void codePostal (String codePost) {
        WebElement codeposte = driver.findElement(By.id("postal-code"));
        codeposte.sendKeys(codePost);
    }
    public void titrePage() {
        WebElement titrepag = driver.findElement(By.xpath("//*[contains(text(), 'Checkout: Your Information')]"));
        Assert.assertTrue(titrepag.isDisplayed(), "titre non affiché");
    }
    public void boutonContinuer() {
        WebElement btnContinuer = driver.findElement(By.id("continue"));
        btnContinuer.click();
    }




    }

