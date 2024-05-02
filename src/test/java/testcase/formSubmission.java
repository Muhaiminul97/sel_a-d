package testcase;

import com.qa.test.home;

public class formSubmission {
    public static void main(String[] args) {
        home homePage = new home();


        homePage.open();
        homePage.openFormModal();

        for (int i = 1; i <= 20; i++) {

            String name = "User" + i;
            String email = "user" + i + "@example.com";

            homePage.processFormSubmission();


            // Wait for a brief moment before reopening the form
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
