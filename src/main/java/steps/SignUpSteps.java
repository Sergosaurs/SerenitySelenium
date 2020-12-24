package steps;

import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import pages.SignUpPage;

public class SignUpSteps {
    SignUpPage page;

    @Step
    public void open_sign_up_page() {
        page.open();
    }

    @Step
    public void get_screenshot() {
        page.screenShooter();
    }

    @Step
    public void type_email(String mail) {
        page.typeEmail(mail);
    }

    @Step()
    public void type_confirmation_email(String mail) {
        page.typeConfirmEmail(mail);
    }

    @Step
    public void type_password(String pass) {
        page.typePassword(pass);
    }

    @Step
    public void type_name(String name) {
        page.typeName(name);
    }

    @Step
    public void set_month(String month) {
        page.setMonth(month);                       // in russian
    }

    @Step
    public void set_day(String day) {
        page.typeDay(day);
    }

    @Step
    public void set_year(String year) {
        page.typeYear(year);
    }

    @Step
    public void select_sex(String sex) {            //in russian
        page.typeSex(sex);
    }

    @Step
    public void click_checkbox(boolean value) {
        page.chekCheckbox(value);
    }

    @Step
    public void click_sighnup() {
        page.clickSignUpButton();
    }

    @Step
    public void should_see_error(String message) {
        Assertions.assertThat(page.isErrorVisible(message));
    }
}

