package TestsPOM;

import HeritagePOM.ClasseCommune;
import PagesPom.*;
import org.testng.annotations.Test;

public class Test3 extends ClasseCommune {
    @Test
    public void test() {
        PAuthentification pageAuthentification = new PAuthentification(driver);
        Pproducts Testprod = new Pproducts(driver);
        Ppanier testPanier = new Ppanier(driver);
        Pcheckout testCheck = new Pcheckout(driver);
        CheckOutOverview testoverview = new CheckOutOverview(driver);
        PageRemerciement testLastMsg = new PageRemerciement(driver);

        pageAuthentification.saisirLogin("standard_user");
        pageAuthentification.saisirMdp("secret_sauce");
        pageAuthentification.boutonLogin();
        Testprod.ProductTitle();
        Testprod.ajoutProduit1();
        Testprod.ajoutProduit2();
        Testprod.clickPanier();
        testPanier.titrePanier();
        testPanier.nbrProdPanier();
        testPanier.boutonCheck();
        testCheck.saisiNom("Joumen");
        testCheck.saisiPrénom("kooli");
        testCheck.codePostal("77420");
        testCheck.titrePage();
        testCheck.boutonContinuer();
        testoverview.checkOverview();
        testoverview.totalCommande();
        testoverview.boutonFinish();
        testLastMsg.lastmessage();


    }
}
