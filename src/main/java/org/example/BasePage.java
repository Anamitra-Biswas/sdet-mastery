package org.example;

public abstract class BasePage implements PageActions {
    protected String pageTitle;
    BasePage(String pageTitle){
        this.pageTitle=pageTitle;
    }
    public void logActions(String action){
        System.out.println("[LOG] "+pageTitle+" | "+action);
    }
    public abstract void navigateTo(String url);

    public abstract boolean isPageLoaded();

}

