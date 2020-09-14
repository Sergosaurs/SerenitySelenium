package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static java.lang.String.format;
import static org.openqa.selenium.By.xpath;

@DefaultUrl("https://www.spotify.com/ru-ru/signup/")
public class SignUpPage extends PageObject {

    private By emailField = By.id("email");
    private By confirmEmailField = By.id("confirm");
    private By passwordField = By.id("password");
    private By nameField = By.id("displayname");
    private By monthDropDown = By.id("month");
    private String monthDropDownOptions = "//*[@id=\"month\"]/option[text()='%s']";
    private By dayField = By.id("day");
    private By yearField = By.id("year");
    private String sexRadioButton = "//span[text()='%s']";        //Мужчина, Женщина
    private By checkBoxTermsConditions = xpath("//*[@id='__next']/main/div[2]/form/div[9]");
    private By buttonSignUp = xpath("//button[text() = 'Зарегистрироваться']");
    private String errorByText = "//form[@novalidate]//*[contains (text(), '%s')]";


    public SignUpPage typeEmail(String email) {
        find(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email) {
        find(confirmEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password) {
        find(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeName(String name) {
        find(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage setMonth(String month) {          //месяц на русском
        find(monthDropDown).click();
        find(xpath(format(monthDropDownOptions, month))).waitUntilVisible();
        return this;
    }

    public SignUpPage typeDay(String day) {
        find(dayField).sendKeys(day);
        return this;
    }

    public SignUpPage typeYear(String year) {
        find(yearField).sendKeys(year);
        return this;
    }

    public SignUpPage typeSex(String sex) {
        find(By.xpath(format(sexRadioButton, sex))).click();
        return this;
    }

    public SignUpPage chekCheckbox(boolean value) {

        WebElement checkbox = find(checkBoxTermsConditions);
        if (!checkbox.isSelected() == value) {
            checkbox.click();
        }
        return this;
    }

    public void clickSignUpButton() {
        find(buttonSignUp).click();
    }

    public boolean isErrorVisible(String message) {
        return find(xpath(format(errorByText, message))).isVisible();
    }

}
