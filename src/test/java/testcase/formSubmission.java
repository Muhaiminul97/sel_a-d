package testcase;

import com.qa.test.home;

public class formSubmission {
    public static void main(String[] args) {
        home homeFormPage = new home();


        homeFormPage.open();
        homeFormPage.openFormModal();

        for (int i = 1; i <= 20; i++) {

            String name = "Shakib" + i;
            String email = "Shakib" + i + "@example.com";
            homeFormPage.fillForm(name, email);
            homeFormPage.processFormSubmission();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
