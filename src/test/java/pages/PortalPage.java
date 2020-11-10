package pages;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
//import sun.jvm.hotspot.runtime.Thread;

public class PortalPage extends PageObject {

    public void preferedName()
    {
        $(By.xpath("//input[@id='red_preferred_name']")).sendKeys("Vivek");
    }

    public void continueBtn()
    {
        $(By.xpath("//input[@id='red_nextbutton']")).click();
    }

    public void yourEmail()
    {
        $(By.xpath("//input[@id='red_email_address']")).sendKeys("testautomation110@redspire.co.uk");
    }
    public void yourEmailContinueBtn()
    {
        $(By.xpath("//input[@id='InsertButton']")).click();
    }

    public void password()
    {
        $(By.xpath("//input[@id='Password']")).sendKeys("TestAutomation1");
    }

    public void signInBtn()
    {
        $(By.xpath("//button[@id='submit-signin-local']")).click();
    }


    public void mobileNo()
    {
        $(By.xpath("//input[@id='red_mobile_number']")).sendKeys("07456715096"); ////input[@id='red_mobile_number']
    }

    public void verificationCode()
    {
        $(By.xpath("//*[@id=\"red_mobile_verification_code\"]")).sendKeys("123456");
    }

    public void vcodeContinueBtn()
    {
        $(By.xpath("//input[@id='NextButton']")).click();
    }

    public void companyName()
    {
        $(By.xpath("//input[@id='red_companysearch']")).sendKeys("Microsoft LIMITED");
    }

    public void coNumber()
    {
        $(By.xpath("//input[@id='red_companynumber']")).sendKeys("123456789");
    }
    public void coNumContinueBtn()
    {
        $(By.xpath("//input[@id='NextButton']")).click();
    }
    public void licenseNo()
    {
        $(By.xpath("//input[@id='red_licencenumber']")).sendKeys("1234");
    }
    public void linNoContinueBtn()
    {
        $(By.xpath("//input[@id='NextButton']")).click();
    }
    public void coDirector()
    {
        $(By.xpath("//input[@id='red_companydirector']")).sendKeys("Billy Rick");
    }
    public void yesMe()
    {
        $(By.xpath("//input[@id='NextButton']")).click();
    }
    public void aTurnover()
    {
        $(By.xpath("//input[@id='red_annualturnover']")).clear();
        $(By.xpath("//input[@id='red_annualturnover']")).sendKeys("100,000,000,000");
    }
    public void turnoverContinueBtn()
    {
        $(By.xpath("//input[@id='red_nextbutton']")).click();
    }

    public void digitalPay() {
        tax();
        taxContinueBtn();
        bIncome();
        taxContinueBtn();
        System.out.println("Selecting the option");
        $(By.xpath("//*[@id='red_paymentmethodsdigitalpayments']")).click();
        System.out.println("Selected digital payments option");
    }
    public void conDigitalPayBtn() {$(By.xpath("//input[@id='red_nextbutton']")).click();}
    public void urAcMon() {

        $(By.xpath("//*[@id='red_paymentfrequency']")).click();
        $(By.xpath("//*[@id='red_paymentfrequency']/option[4]")).click();
    }
    public void urAcMonContinueBtn() { $(By.xpath("//input[@id='red_nextbutton']")).click(); }
    public void sendMoney() {

        $(By.xpath("//*[@id='red_foreigntransactionsyn_1']")).click();
    }
    public void sendMoneyConBtn() {
        $(By.xpath("//input[@id='NextButton']")).click();
    }
    public void reviewConBtn() {
        $(By.xpath("//input[@id='NextButton']")).click();
    }
    public void loopBank() {

        $(By.xpath("//*[@id='red_updatesforbusinessaccountinternetmobile']")).click();
    }
    public void loopBankConBtn() { $(By.xpath("//input[@id='red_nextbutton']")).click(); }
    public void legalConBtn() {
       $(By.xpath("//input[@id='NextButton']")).click();

//        String result = $(By.xpath("//*[text()[contains(.,'to Virgin Money, ')]]")).getText();
//        System.out.println("Welcome text: "+result);
    }

    public void tax()
    {
        $(By.xpath("//input[@id='red_taxinukonly_0']")).click();
    }
    public void taxContinueBtn()
    {
        $(By.xpath("//input[@id='red_nextbutton']")).click();
    }
    public void bIncome()
    {
        $(By.xpath("//label[@for='red_businessincomecontribution_0']")).click();
    }
    public void bIncomeContinueBtn()
    {
        $(By.xpath("//input[@id='red_nextbutton']")).click();
    }


}
