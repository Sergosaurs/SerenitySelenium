import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SignUpSteps;

@RunWith(SerenityRunner.class)
public class WhenSignUp {                                                                           //SERENITY USING

    @Steps
    SignUpSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;


//    @Test
//    public void takeScreenshot(){
//    steps.get_screenshot();
//    }

    @Test
    public void typeInvalidYear() {
        steps.open_sign_up_page();
        steps.set_day("08");
        steps.set_month("Март");
        steps.set_year("08");
        steps.click_checkbox(true);
        steps.should_see_error("Укажите действительный год.");
    }
//
//    @Test
//    public void typeInvalidEmail() {
//        steps.open_sign_up_page();
//        steps.type_email("test@test.test");
//        steps.type_confirmation_email("test@test.tt");
//        steps.type_name("testuser");
//        steps.click_sighnup();
//        steps.should_see_error("Адреса электронной почты не совпадают.");
//    }
//
//    @Test
//    public void signUpWithEmptyPassword() {
//        steps.open_sign_up_page();
//        steps.type_email("gresereg@2mail.ru");
//        steps.type_confirmation_email("test@test.tt");
//        steps.type_name("Sergosaurs");
//        steps.click_sighnup();
//        steps.should_see_error("Введите пароль.");
//    }
//
//    @Test
//    public void typeInvalidValues() {
//        steps.open_sign_up_page();
//        steps.type_email("gresereg@2mail.ru");
//        steps.type_confirmation_email("test@test.tt");
//        steps.type_name("Sergosaurs");
//        steps.type_password("hardpass22");
//        steps.select_sex("Женщина");
//        steps.click_checkbox(false);
//        steps.click_sighnup();
//        steps.should_see_error("Подтвердите, что вы не робот.");
//    }

}
