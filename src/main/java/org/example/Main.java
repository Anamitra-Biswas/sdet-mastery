package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PageActions pg = new LoginPage("Login Page");
        pg.navigateTo("https://saucedemo.com");
        pg.isPageLoaded();

        PageActions pageActions=new DashBoardPage("Dashboard Page");
        pageActions.navigateTo("https://saucedemo.com");
        pageActions.isPageLoaded();

        TestDataManager t = new TestDataManager();
        t.printValidUsersUpperCase();
        List<String> ValidUsers=t.getValidUserStreams();
        System.out.println("Valid users "+ValidUsers.size());
        t.printAll();
        System.out.println(t.getConfigValue("meow"));
        t.printSet();

    }
}

