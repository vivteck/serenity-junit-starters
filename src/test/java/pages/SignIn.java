package pages;

import net.thucydides.core.annotations.Step;

public class SignIn {

    PortalPage portal;

    @Step
    public void preferedName()
    {
        portal.preferedName();
    }

    @Step
    public void pnameContinueBtn()
    {
        portal.continueBtn();
    }

    @Step
    public void yourEmail()
    {
        portal.yourEmail();
    }

    @Step
    public void yourEmailContinueBtn()
    {
        portal.yourEmailContinueBtn();
    }

    @Step
    public void password()
    {
        portal.password();
    }

    @Step
    public void signInBtn()
    {
        portal.signInBtn();
    }

    @Step
    public void mobileNo()
    {
        portal.mobileNo();
    }

    @Step
    public void mobContinueBtn()
    {
        portal.continueBtn();
    }
    @Step
    public void vCode()
    {
        portal.verificationCode();
    }
    @Step
    public void vCodeBtn()
    {
        portal.vcodeContinueBtn();
    }
    @Step
    public void companyName()
    {
        portal.companyName();
    }

    @Step
    public void coNameConBtn()
    {
        portal.vcodeContinueBtn();
    }
    @Step
    public void coNumber()
    {
        portal.coNumber();
    }
    @Step
    public void coNumContinueBtn()
    {
        portal.coNumContinueBtn();
    }
    @Step
    public void licenceNo()
    {
        portal.licenseNo();
    }
    @Step
    public void licenceContinueBtn()
    {
        portal.linNoContinueBtn();
    }
    @Step
    public void coDirector()
    {
        portal.coDirector();
    }
    @Step
    public void yesMe()
    {
        portal.yesMe();
    }
    @Step
    public void aTurnOver()
    {
        portal.aTurnover();
    }
    @Step
    public void turnOverConBtn()
    {
        portal.turnoverContinueBtn();
    }
    @Step
    public void digitalPay() {portal.digitalPay();}
    @Step
    public void conDigitalPayBtn() {portal.continueBtn();}

    @Step
    public void urAcMon() { portal.urAcMon(); }

    @Step
    public void urAcMonConBtn() { portal.urAcMonContinueBtn(); }

    @Step
    public void sendMon() { portal.sendMoney(); }

    @Step
    public void sendMonConBtn() { portal.sendMoneyConBtn(); }

    @Step
    public void reviewConBtn() { portal.reviewConBtn(); }

    @Step
    public void loopBank() { portal.loopBank(); }

    @Step
    public void loopBankConBtn() { portal.loopBankConBtn(); }

    @Step
    public void legalCBtn() { portal.legalConBtn(); }

//    @Step
//    public void tax()
//    {
//        portal.tax();
//    }
//    @Step
//    public void taxConBtn()
//    {
//        portal.taxContinueBtn();
//    }
//    @Step
//    public void bIncom()
//    {
//        portal.bIncome();
//    }
//    @Step
//    public void bIncomConBtn()
//    {
//        portal.bIncomeContinueBtn();
//    }
//    @Step
//    public void payy()
//    {
//        portal.pay();
//    }
//    @Step
//    public void payConBtn()
//    {
//        portal.payContinue();
//    }

}
