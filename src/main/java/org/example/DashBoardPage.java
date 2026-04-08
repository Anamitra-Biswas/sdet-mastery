package org.example;

public class DashBoardPage extends BasePage {
    DashBoardPage(String pageTitle){
        super(pageTitle);
    }

    @Override
    public void navigateTo(String url) {
        System.out.println("Navigating to "+url);
    }

    @Override
    public boolean isPageLoaded() {
        System.out.println("Page loaded : "+pageTitle);
        return true;
    }
}
