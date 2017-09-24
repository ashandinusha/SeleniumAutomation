package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    //Define web Elements
    @FindBy(id = "txtUsername")
    private WebElement txtUserName;

    @FindBy(id = "txtPassword")
    private WebElement txtPassword;

    @FindBy(id = "btnLogin")
    private WebElement btnLogin;

    @FindBy(id = "spanMessage")
    private WebElement spanMessage;

    @FindBy(id = "spanMessage")
    private WebElement spanMessage1;

    @FindBy(id = "spanMessage")
    private WebElement spanMessage2;

    @FindBy(id = "spanMessage")
    private WebElement spanMessage3;

    //Define Action
    public void typeUsername(String userName){
        txtUserName.sendKeys(userName);
    }
    public void typePassword(String passWord){
        txtPassword.sendKeys(passWord);
    }
    public void clickLogin(){
        btnLogin.submit();
    }
    public void login(String userName, String passWord){
        typeUsername(userName);
        typePassword(passWord);
        clickLogin();
    }

    public String getMessage(){
        return spanMessage.getText();
    }
    public String getMessage1(){
        return spanMessage1.getText();
    }
    public String getMessage2(){
        return spanMessage2.getText();
    }
    public String getMessage3(){
        return spanMessage3.getText();
    }



}
