package testcases;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pages.SignIn;
@RunWith(SerenityRunner.class)

public class PortalApplication {

    @Managed
    WebDriver driver;

    @Steps
    SignIn sign;

    @Test
    public void LoginAsVivek() throws InterruptedException {
        driver.get("https://vmobsandbox.powerappsportals.com/apply");
        driver.manage().window().maximize();
        sign.preferedName();
        sign.pnameContinueBtn();
        sign.yourEmail();
        sign.yourEmailContinueBtn();
        Thread.sleep(2000);
        sign.password();
        Thread.sleep(20000);
        sign.signInBtn();
        sign.mobileNo();
        sign.mobContinueBtn();
        Thread.sleep(2000);
        sign.vCode();
        sign.vCodeBtn();
        sign.companyName();
        Thread.sleep(2000);
        sign.coNameConBtn();
        sign.coNumber();
        sign.coNumContinueBtn();
        Thread.sleep(2000);
        sign.licenceNo();
        sign.licenceContinueBtn();
        sign.coDirector();
        sign.yesMe();
        Thread.sleep(2000);
        sign.aTurnOver();
        sign.turnOverConBtn();
        Thread.sleep(2000);
        sign.digitalPay();
        sign.conDigitalPayBtn();
        Thread.sleep(2000);
        sign.urAcMon();
        sign.urAcMonConBtn();
        sign.sendMon();
        sign.sendMonConBtn();
        sign.reviewConBtn();
        Thread.sleep(2000);
        sign.loopBank();
        sign.loopBankConBtn();
        sign.legalCBtn();

//        sign.tax();
//        sign.taxConBtn();
//        Thread.sleep(2000);
//        sign.bIncom();
//        sign.bIncomConBtn();
//        sign.payy();
//        sign.payConBtn();
    }

}
