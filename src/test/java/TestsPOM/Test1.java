package TestsPOM;

import HeritagePOM.ClasseCommune;
import PagesPom.PAuthentification;
import org.testng.annotations.Test;

public class Test1 extends ClasseCommune {
    @Test
    public void test () {
        PAuthentification pageAuthentification=new PAuthentification(driver);

        pageAuthentification.saisirLogin("standard_user");

        pageAuthentification.saisirMdp("abc123");

        pageAuthentification.boutonLogin();

        pageAuthentification.errorMessage();
    }
}


