package testcase;

import com.qa.test.formPage;
import com.qa.test.home;

public class formSubmission {
    public static void main(String[] args) {
        home homePage = new home();
        formPage formPage;

        homePage.open();

        for (int i = 1; i <= 20; i++) {
            String name = "User" + i;
            String email = "user" + i + "@example.com";

            formPage = homePage.navigateToFormPage();

            formPage.fillForm(name, email, "Your Name automation " + i);

            formPage.submitForm();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
